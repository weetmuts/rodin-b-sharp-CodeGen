/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package compositeControl;

import org.eventb.emf.core.machine.Event;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link compositeControl.LocalEvent#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see compositeControl.CompositeControlPackage#getLocalEvent()
 * @model
 * @generated
 */
public interface LocalEvent extends EventWrapper {

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see compositeControl.CompositeControlPackage#getLocalEvent_Event()
	 * @model
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link compositeControl.LocalEvent#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);
} // LocalEvent
