/**
 *
 */
package org.eventb.codegen.il1.translator.provider;

import java.util.List;

import org.eventb.codegen.il1.translator.TargetLanguage;
import org.eventb.core.IEventBProject;
import org.rodinp.core.RodinDBException;

/**
 * @author renatosilva
 *
 */
public abstract class AbstractTranslatorProvider implements ITranslatorProvider {

	/* (non-Javadoc)
	 * @see org.eventb.codegen.il1.translator.provider.ITranslatorProvider#getRules(org.eventb.codegen.il1.translator.IL1TranslationManager.TargetLanguage)
	 */
	@Override
	public abstract List<ITranslationRule> getRules(TargetLanguage targetLanguage, IEventBProject eventBProject)
			throws RodinDBException;

	@Override
	public abstract List<ITranslationRule> getTypeRules(
			TargetLanguage targetLanguage, IEventBProject eventBProject)
			throws RodinDBException;

}
