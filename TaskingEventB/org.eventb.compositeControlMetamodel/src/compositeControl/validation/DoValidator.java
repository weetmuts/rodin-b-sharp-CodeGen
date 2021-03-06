/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package compositeControl.validation;

import compositeControl.SynchEvents;

/**
 * A sample validator interface for {@link compositeControl.Do}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DoValidator {
	boolean validate();

	boolean validateLabel(String value);
	boolean validateEvents(SynchEvents value);
	boolean validateFinally(SynchEvents value);
}
