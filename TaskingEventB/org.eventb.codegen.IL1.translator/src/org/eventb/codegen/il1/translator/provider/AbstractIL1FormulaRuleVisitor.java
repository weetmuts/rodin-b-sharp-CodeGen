/**
 *
 */
package org.eventb.codegen.il1.translator.provider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eventb.codegen.il1.translator.internal.provider.TranslationBinder;
import org.eventb.core.ast.Expression;
import org.eventb.core.ast.Formula;
import org.eventb.core.ast.FormulaFactory;
import org.eventb.core.ast.FreeIdentifier;
import org.eventb.core.ast.IParseResult;
import org.eventb.core.ast.ISimpleVisitor;
import org.eventb.core.ast.ITypeCheckResult;
import org.eventb.core.ast.ITypeEnvironment;
import org.eventb.core.ast.LanguageVersion;
import org.eventb.core.ast.extensions.pm.IBinding;
import org.eventb.core.ast.extensions.pm.Matcher;

/**
 * @author renatosilva
 *
 */
public abstract class AbstractIL1FormulaRuleVisitor implements ISimpleVisitor {

	protected final String VARIABLE_ASSIGNMENT_OPERATOR = " = "; //$NON-NLS-1$
	protected final String STATEMENT_SEPARATOR = ";"; //$NON-NLS-1$
	protected FormulaFactory ff;
	protected final String inputFormulaString;
	protected Formula<?> inputFormula = null;
	protected String outputFormula = ""; //$NON-NLS-1$
	protected List<ITranslationRule> rules;
	protected ITypeEnvironment typeEnvironment;
	protected boolean issueMessages = false;

	public AbstractIL1FormulaRuleVisitor(String formula, ITypeEnvironment typeEnvironment, List<ITranslationRule> translatorRules, boolean issueMessages) {
		this.inputFormulaString = formula;
		this.typeEnvironment = typeEnvironment;
		this.ff = typeEnvironment.getFormulaFactory();
		convert();
		this.rules = translatorRules;
		this.issueMessages = issueMessages;
	}

	private boolean convert(){
		IParseResult parseResult;
		//Expression
		parseResult = ff.parseExpression(inputFormulaString, LanguageVersion.LATEST, null);
		if(null==parseResult || parseResult.hasProblem()){
			//Predicate
			parseResult = ff.parsePredicate(inputFormulaString, LanguageVersion.LATEST, null);
			if(null==parseResult || parseResult.hasProblem()){
				//Assignment
				parseResult = ff.parseAssignment(inputFormulaString, LanguageVersion.LATEST, null);
				inputFormula = parseResult.getParsedAssignment();

			}else{
				inputFormula = parseResult.getParsedPredicate();
			}
		}else{
			inputFormula = parseResult.getParsedExpression();
		}

		ITypeCheckResult typeCheck = inputFormula.typeCheck(typeEnvironment);

		if(!parseResult.hasProblem() && typeCheck.isSuccess()){
			return true;
		}

		return false;
	}

	public String translate(){
		inputFormula.accept(this);
		if(outputFormula.trim().isEmpty()){
			outputFormula = inputFormulaString;
		}
		return outputFormula;
	}

	protected void executeTranslation(Formula<?> inputFormula){
		Matcher matcher = new Matcher(ff);

		for(ITranslationRule rule: rules){
			IBinding bind = matcher.match(inputFormula, rule.getFormula(), false); //pattern = Formula (lhs)
			if(null!=bind){
				if(bind.getExpressionMappings().size()+bind.getPredicateMappings().size()>0)
					outputFormula = TranslationBinder.bind(rule.getTranslation(), bind, addTypingTranslation(bind)); //resulting translation rule (rhs)
				else
					outputFormula = rule.getTranslation();
				break;
			}
		}
	}

	/**
	 * @return the issueMessages
	 */
	public boolean isIssueMessages() {
		return issueMessages;
	}

	/**
	 * Check if the expressionTranslated match to a existing typeRule
	 *
	 * @param bind
	 * @return Map<FreeIdentifier, String> containing the additional type
	 *         translations
	 */
	protected Map<FreeIdentifier, String> addTypingTranslation(IBinding bind) {
		Map<FreeIdentifier, Expression> expressionMappings = bind.getExpressionMappings();
		Map<FreeIdentifier, String> typingMappings = new HashMap<FreeIdentifier, String>();

		for (Entry<FreeIdentifier, Expression> entry : expressionMappings.entrySet()) {
			FreeIdentifier identifier = entry.getKey();
			Expression expressionTranslated = entry.getValue();

			IL1FormulaTypeRulesVisitor formulaVisitor = new IL1FormulaTypeRulesVisitor(
					identifier.toString(), expressionTranslated.toString(),
					typeEnvironment, rules,false);
			String translatedExpression = formulaVisitor.translate();
			if (!translatedExpression.trim().isEmpty())
				typingMappings.put(identifier, translatedExpression);
		}

		return typingMappings;
	}
}
