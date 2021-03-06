/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package compositeControl.validation;

import compositeControl.SubBranch;
import compositeControl.SynchEvents;

/**
 * A sample validator interface for {@link compositeControl.SubBranch}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SubBranchValidator {
	boolean validate();

	boolean validateEvents(SynchEvents value);
	boolean validateSubBranch(SubBranch value);
}
