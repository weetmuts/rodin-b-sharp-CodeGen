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
public interface ITranslatorProvider {

	public List<ITranslationRule> getRules(TargetLanguage targetLanguage, IEventBProject eventBProject) throws RodinDBException;

	public List<ITranslationRule> getTypeRules(TargetLanguage targetLanguage, IEventBProject eventBProject) throws RodinDBException;

}
