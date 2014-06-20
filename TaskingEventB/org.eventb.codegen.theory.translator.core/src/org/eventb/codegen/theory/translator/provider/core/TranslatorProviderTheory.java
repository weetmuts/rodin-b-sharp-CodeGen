/**
 *
 */
package org.eventb.codegen.theory.translator.provider.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eventb.codegen.il1.translator.TargetLanguage;
import org.eventb.codegen.il1.translator.provider.AbstractTranslatorProvider;
import org.eventb.codegen.il1.translator.provider.ITranslationRule;
import org.eventb.codegen.il1.translator.provider.TranslatorProviderManager;
import org.eventb.codegen.theory.translator.core.ISCTranslatorElement;
import org.eventb.codegen.theory.translator.core.ISCTranslatorRuleElement;
import org.eventb.codegen.theory.translator.core.ISCTranslatorTypeRuleElement;
import org.eventb.codegen.theory.translator.core.utils.Messages;
import org.eventb.codegen.theory.translator.core.utils.Utils;
import org.eventb.core.IEventBProject;
import org.eventb.core.ast.Formula;
import org.eventb.core.ast.FormulaFactory;
import org.eventb.core.ast.ITypeEnvironment;
import org.eventb.theory.core.IDeployedTheoryRoot;
import org.eventb.theory.core.ISCMetavariable;
import org.eventb.theory.core.IUseTheory;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinDBException;

/**
 * @author renatosilva
 *
 */
public class TranslatorProviderTheory extends AbstractTranslatorProvider {

	private List<IDeployedTheoryRoot> deployRootList = new ArrayList<IDeployedTheoryRoot>();
	private final IInternalElementType<IDeployedTheoryRoot> rootElementType = IDeployedTheoryRoot.ELEMENT_TYPE;

	/**
	 *
	 */
	public TranslatorProviderTheory() {
	}

	private void loadAvailableDeployTheories(IEventBProject project) {
		deployRootList.clear();
		try {
			deployRootList.addAll(Arrays.asList(project.getRodinProject().getRootElementsOfType(rootElementType)));
			loadMathExtensions(project);
		} catch (RodinDBException e) {
			Utils.log(e, Messages.exception_RetrievingDeployedTheoryRoot + " " + project.toString());
			e.printStackTrace();
		}
	}

	private void loadMathExtensions(IEventBProject project) throws RodinDBException{
		IRodinProject rodinProj = project.getRodinProject().getRodinDB().getRodinProject("MathExtensions");

		// get the list of theories
		if(rodinProj!=null)
			deployRootList.addAll(Arrays.asList(rodinProj.getRootElementsOfType(rootElementType)));
		
		List<IDeployedTheoryRoot> arr = new ArrayList<IDeployedTheoryRoot>();
		
		// iterate through the theories and order imports first 
		Iterator<IDeployedTheoryRoot> iter = deployRootList.iterator();
		while(iter.hasNext()){
			IDeployedTheoryRoot tr = iter.next();
			IUseTheory[] usedTheories = tr.getUsedTheories();
			for(IUseTheory usedTheory: usedTheories){
				IDeployedTheoryRoot deployedTheory = usedTheory.getUsedTheory();
				if(!arr.contains(deployedTheory)){
					arr.add(deployedTheory);
				}
			}
			if(!arr.contains(tr)){
				arr.add(tr);
			}
		}
		
		// replace the unordered theory list with the ordered one
		deployRootList.clear();
		for(IDeployedTheoryRoot dep: arr){
			deployRootList.add(dep);
		}
		
		
	}

	/* (non-Javadoc)
	 * @see org.eventb.codegen.il1.translator.provider.ITranslatorProvider#getRules(java.lang.String)
	 */
	@Override
	public List<ITranslationRule> getRules(TargetLanguage targetLanguage, IEventBProject eventBProject) throws RodinDBException {
		loadAvailableDeployTheories(eventBProject);
		List<ITranslationRule> translationRulesList = new ArrayList<ITranslationRule>();

		for(IDeployedTheoryRoot root: deployRootList){
			ISCTranslatorElement[] translatorElements = root.getChildrenOfType(ISCTranslatorElement.ELEMENT_TYPE);
			if(translatorElements.length==0)
				continue;

			FormulaFactory ff = root.getFormulaFactory();
			ITypeEnvironment typeEnvironment = root.getTypeEnvironment(ff);
			for(ISCTranslatorElement translatorElement:translatorElements){
				ITypeEnvironment innerTypeEnvironment = typeEnvironment.clone();
				for (ISCMetavariable scMetaVariable :translatorElement.getSCMetavariables()){
					innerTypeEnvironment.addName(scMetaVariable.getIdentifierString(), scMetaVariable.getType(ff));
				}
				String scTargetLanguage = translatorElement.getSCTargetLanguage();
				if(scTargetLanguage.equalsIgnoreCase(targetLanguage.getCoreLanguage()))
					translationRulesList.addAll(getTranslationRule(translatorElement, targetLanguage,ff,innerTypeEnvironment));
			}
		}

		return translationRulesList;//.toArray(new ITranslationRule[translationRulesList.size()]);
	}

	private List<ITranslationRule> getTranslationRule(ISCTranslatorElement translatorElement,TargetLanguage targetLanguage, FormulaFactory ff, ITypeEnvironment typeEnvironment) throws RodinDBException{
		List<ITranslationRule> translationRulesList = new ArrayList<ITranslationRule>();
		ISCTranslatorRuleElement[] scTranslatorRules = translatorElement.getSCTranslatorRules();
		TranslatorProviderManager translatorProviderManager = TranslatorProviderManager.getInstance();

		for(ISCTranslatorRuleElement scTranslatorRule:scTranslatorRules){
			ITranslationRule rule = translatorProviderManager.getTranslationRule(targetLanguage, typeEnvironment);
			Formula<?> scFormula = scTranslatorRule.getSCFormula(ff, typeEnvironment);
			assert scFormula!=null;
			rule.setFormula(scFormula);
			rule.setName(scTranslatorRule.getLabel());
			rule.setTranslation(scTranslatorRule.getSCTranslation());
			translationRulesList.add(rule);
		}

		return translationRulesList;
	}

	private List<ITranslationRule> getTranslationTypeRule(ISCTranslatorElement scTranslatorElement,TargetLanguage targetLanguage, FormulaFactory ff, ITypeEnvironment typeEnvironment) throws RodinDBException{
		List<ITranslationRule> translationTypeRulesList = new ArrayList<ITranslationRule>();
		ISCTranslatorTypeRuleElement[] scTranslatorTypeRules = scTranslatorElement.getSCTranslatorTypeRules();
		TranslatorProviderManager translatorProviderManager = TranslatorProviderManager.getInstance();

		for(ISCTranslatorTypeRuleElement scTranslatorTypeRule:scTranslatorTypeRules){
			ITranslationRule rule = translatorProviderManager.getTranslationTypeRule(targetLanguage, typeEnvironment);
			Formula<?> scFormula = scTranslatorTypeRule.getSCTypeFormula(ff, typeEnvironment);
			assert scFormula!=null;
			rule.setFormula(scFormula);
			rule.setName(scTranslatorTypeRule.getLabel());
			rule.setTranslation(scTranslatorTypeRule.getSCTranslation());
			translationTypeRulesList.add(rule);
		}

		return translationTypeRulesList;
	}

	@Override
	public List<ITranslationRule> getTypeRules(
			TargetLanguage targetLanguage, IEventBProject eventBProject)
			throws RodinDBException {
		loadAvailableDeployTheories(eventBProject);
		List<ITranslationRule> translationTypeRulesList = new ArrayList<ITranslationRule>();

		for(IDeployedTheoryRoot root: deployRootList){
			ISCTranslatorElement[] translatorElements = root.getChildrenOfType(ISCTranslatorElement.ELEMENT_TYPE);
			if(translatorElements.length==0)
				continue;

			FormulaFactory ff = root.getFormulaFactory();
			ITypeEnvironment typeEnvironment = root.getTypeEnvironment(ff);
			for(ISCTranslatorElement translatorElement:translatorElements){
				ITypeEnvironment innerTypeEnvironment = typeEnvironment.clone();
				for (ISCMetavariable meta :translatorElement.getSCMetavariables()){
					innerTypeEnvironment.addName(meta.getIdentifierString(), meta.getType(ff));
				}
				String scTargetLanguage = translatorElement.getSCTargetLanguage();
				if(scTargetLanguage.equalsIgnoreCase(targetLanguage.getCoreLanguage()))
					translationTypeRulesList.addAll(getTranslationTypeRule(translatorElement, targetLanguage,ff,innerTypeEnvironment));
			}
		}

		return translationTypeRulesList;//.toArray(new ITranslationRule[translationRulesList.size()]);

	}
}
