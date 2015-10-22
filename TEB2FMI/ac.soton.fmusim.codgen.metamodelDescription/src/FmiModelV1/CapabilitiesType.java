/**
 */
package FmiModelV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities of the CoSimulation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelV1.CapabilitiesType#isCanHandleVariableCommunicationStepSize <em>Can Handle Variable Communication Step Size</em>}</li>
 *   <li>{@link FmiModelV1.CapabilitiesType#isCanHandleEvents <em>Can Handle Events</em>}</li>
 *   <li>{@link FmiModelV1.CapabilitiesType#isCanRejectSteps <em>Can Reject Steps</em>}</li>
 *   <li>{@link FmiModelV1.CapabilitiesType#isCanInterpolateInputs <em>Can Interpolate Inputs</em>}</li>
 *   <li>{@link FmiModelV1.CapabilitiesType#getMaxOutputDerivativeOrder <em>Max Output Derivative Order</em>}</li>
 *   <li>{@link FmiModelV1.CapabilitiesType#isCanRunAsynchronuously <em>Can Run Asynchronuously</em>}</li>
 *   <li>{@link FmiModelV1.CapabilitiesType#isCanSignalEvents <em>Can Signal Events</em>}</li>
 *   <li>{@link FmiModelV1.CapabilitiesType#isCanBeInstantiatedOnlyOncePerProcess <em>Can Be Instantiated Only Once Per Process</em>}</li>
 *   <li>{@link FmiModelV1.CapabilitiesType#isCanNotUseMemoryManagementFunctions <em>Can Not Use Memory Management Functions</em>}</li>
 *   <li>{@link FmiModelV1.CapabilitiesType#isCanGetAndSetFMUstate <em>Can Get And Set FM Ustate</em>}</li>
 *   <li>{@link FmiModelV1.CapabilitiesType#isCanSerializeFMUstate <em>Can Serialize FM Ustate</em>}</li>
 *   <li>{@link FmiModelV1.CapabilitiesType#getModelIdentifier <em>Model Identifier</em>}</li>
 *   <li>{@link FmiModelV1.CapabilitiesType#isNeedsExecutionTool <em>Needs Execution Tool</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType()
 * @model extendedMetaData="name='Capabilities_._type' kind='elementOnly'"
 * @generated
 */
public interface CapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Can Handle Variable Communication Step Size</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Handle Variable Communication Step Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Handle Variable Communication Step Size</em>' attribute.
	 * @see #isSetCanHandleVariableCommunicationStepSize()
	 * @see #unsetCanHandleVariableCommunicationStepSize()
	 * @see #setCanHandleVariableCommunicationStepSize(boolean)
	 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType_CanHandleVariableCommunicationStepSize()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canHandleVariableCommunicationStepSize' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanHandleVariableCommunicationStepSize();

	/**
	 * Sets the value of the '{@link FmiModelV1.CapabilitiesType#isCanHandleVariableCommunicationStepSize <em>Can Handle Variable Communication Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Handle Variable Communication Step Size</em>' attribute.
	 * @see #isSetCanHandleVariableCommunicationStepSize()
	 * @see #unsetCanHandleVariableCommunicationStepSize()
	 * @see #isCanHandleVariableCommunicationStepSize()
	 * @generated
	 */
	void setCanHandleVariableCommunicationStepSize(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.CapabilitiesType#isCanHandleVariableCommunicationStepSize <em>Can Handle Variable Communication Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanHandleVariableCommunicationStepSize()
	 * @see #isCanHandleVariableCommunicationStepSize()
	 * @see #setCanHandleVariableCommunicationStepSize(boolean)
	 * @generated
	 */
	void unsetCanHandleVariableCommunicationStepSize();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.CapabilitiesType#isCanHandleVariableCommunicationStepSize <em>Can Handle Variable Communication Step Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Handle Variable Communication Step Size</em>' attribute is set.
	 * @see #unsetCanHandleVariableCommunicationStepSize()
	 * @see #isCanHandleVariableCommunicationStepSize()
	 * @see #setCanHandleVariableCommunicationStepSize(boolean)
	 * @generated
	 */
	boolean isSetCanHandleVariableCommunicationStepSize();

	/**
	 * Returns the value of the '<em><b>Can Handle Events</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Handle Events</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Handle Events</em>' attribute.
	 * @see #isSetCanHandleEvents()
	 * @see #unsetCanHandleEvents()
	 * @see #setCanHandleEvents(boolean)
	 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType_CanHandleEvents()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canHandleEvents' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanHandleEvents();

	/**
	 * Sets the value of the '{@link FmiModelV1.CapabilitiesType#isCanHandleEvents <em>Can Handle Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Handle Events</em>' attribute.
	 * @see #isSetCanHandleEvents()
	 * @see #unsetCanHandleEvents()
	 * @see #isCanHandleEvents()
	 * @generated
	 */
	void setCanHandleEvents(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.CapabilitiesType#isCanHandleEvents <em>Can Handle Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanHandleEvents()
	 * @see #isCanHandleEvents()
	 * @see #setCanHandleEvents(boolean)
	 * @generated
	 */
	void unsetCanHandleEvents();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.CapabilitiesType#isCanHandleEvents <em>Can Handle Events</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Handle Events</em>' attribute is set.
	 * @see #unsetCanHandleEvents()
	 * @see #isCanHandleEvents()
	 * @see #setCanHandleEvents(boolean)
	 * @generated
	 */
	boolean isSetCanHandleEvents();

	/**
	 * Returns the value of the '<em><b>Can Reject Steps</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Reject Steps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Reject Steps</em>' attribute.
	 * @see #isSetCanRejectSteps()
	 * @see #unsetCanRejectSteps()
	 * @see #setCanRejectSteps(boolean)
	 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType_CanRejectSteps()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canRunAsynchronuously' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanRejectSteps();

	/**
	 * Sets the value of the '{@link FmiModelV1.CapabilitiesType#isCanRejectSteps <em>Can Reject Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Reject Steps</em>' attribute.
	 * @see #isSetCanRejectSteps()
	 * @see #unsetCanRejectSteps()
	 * @see #isCanRejectSteps()
	 * @generated
	 */
	void setCanRejectSteps(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.CapabilitiesType#isCanRejectSteps <em>Can Reject Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanRejectSteps()
	 * @see #isCanRejectSteps()
	 * @see #setCanRejectSteps(boolean)
	 * @generated
	 */
	void unsetCanRejectSteps();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.CapabilitiesType#isCanRejectSteps <em>Can Reject Steps</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Reject Steps</em>' attribute is set.
	 * @see #unsetCanRejectSteps()
	 * @see #isCanRejectSteps()
	 * @see #setCanRejectSteps(boolean)
	 * @generated
	 */
	boolean isSetCanRejectSteps();

	/**
	 * Returns the value of the '<em><b>Can Interpolate Inputs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Interpolate Inputs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Interpolate Inputs</em>' attribute.
	 * @see #isSetCanInterpolateInputs()
	 * @see #unsetCanInterpolateInputs()
	 * @see #setCanInterpolateInputs(boolean)
	 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType_CanInterpolateInputs()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canInterpolateInputs' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanInterpolateInputs();

	/**
	 * Sets the value of the '{@link FmiModelV1.CapabilitiesType#isCanInterpolateInputs <em>Can Interpolate Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Interpolate Inputs</em>' attribute.
	 * @see #isSetCanInterpolateInputs()
	 * @see #unsetCanInterpolateInputs()
	 * @see #isCanInterpolateInputs()
	 * @generated
	 */
	void setCanInterpolateInputs(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.CapabilitiesType#isCanInterpolateInputs <em>Can Interpolate Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanInterpolateInputs()
	 * @see #isCanInterpolateInputs()
	 * @see #setCanInterpolateInputs(boolean)
	 * @generated
	 */
	void unsetCanInterpolateInputs();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.CapabilitiesType#isCanInterpolateInputs <em>Can Interpolate Inputs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Interpolate Inputs</em>' attribute is set.
	 * @see #unsetCanInterpolateInputs()
	 * @see #isCanInterpolateInputs()
	 * @see #setCanInterpolateInputs(boolean)
	 * @generated
	 */
	boolean isSetCanInterpolateInputs();

	/**
	 * Returns the value of the '<em><b>Max Output Derivative Order</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Output Derivative Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Output Derivative Order</em>' attribute.
	 * @see #isSetMaxOutputDerivativeOrder()
	 * @see #unsetMaxOutputDerivativeOrder()
	 * @see #setMaxOutputDerivativeOrder(long)
	 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType_MaxOutputDerivativeOrder()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='maxOutputDerivativeOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	long getMaxOutputDerivativeOrder();

	/**
	 * Sets the value of the '{@link FmiModelV1.CapabilitiesType#getMaxOutputDerivativeOrder <em>Max Output Derivative Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Output Derivative Order</em>' attribute.
	 * @see #isSetMaxOutputDerivativeOrder()
	 * @see #unsetMaxOutputDerivativeOrder()
	 * @see #getMaxOutputDerivativeOrder()
	 * @generated
	 */
	void setMaxOutputDerivativeOrder(long value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.CapabilitiesType#getMaxOutputDerivativeOrder <em>Max Output Derivative Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxOutputDerivativeOrder()
	 * @see #getMaxOutputDerivativeOrder()
	 * @see #setMaxOutputDerivativeOrder(long)
	 * @generated
	 */
	void unsetMaxOutputDerivativeOrder();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.CapabilitiesType#getMaxOutputDerivativeOrder <em>Max Output Derivative Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Output Derivative Order</em>' attribute is set.
	 * @see #unsetMaxOutputDerivativeOrder()
	 * @see #getMaxOutputDerivativeOrder()
	 * @see #setMaxOutputDerivativeOrder(long)
	 * @generated
	 */
	boolean isSetMaxOutputDerivativeOrder();

	/**
	 * Returns the value of the '<em><b>Can Run Asynchronuously</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Run Asynchronuously</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Run Asynchronuously</em>' attribute.
	 * @see #isSetCanRunAsynchronuously()
	 * @see #unsetCanRunAsynchronuously()
	 * @see #setCanRunAsynchronuously(boolean)
	 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType_CanRunAsynchronuously()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canRunAsynchronuously' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanRunAsynchronuously();

	/**
	 * Sets the value of the '{@link FmiModelV1.CapabilitiesType#isCanRunAsynchronuously <em>Can Run Asynchronuously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Run Asynchronuously</em>' attribute.
	 * @see #isSetCanRunAsynchronuously()
	 * @see #unsetCanRunAsynchronuously()
	 * @see #isCanRunAsynchronuously()
	 * @generated
	 */
	void setCanRunAsynchronuously(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.CapabilitiesType#isCanRunAsynchronuously <em>Can Run Asynchronuously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanRunAsynchronuously()
	 * @see #isCanRunAsynchronuously()
	 * @see #setCanRunAsynchronuously(boolean)
	 * @generated
	 */
	void unsetCanRunAsynchronuously();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.CapabilitiesType#isCanRunAsynchronuously <em>Can Run Asynchronuously</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Run Asynchronuously</em>' attribute is set.
	 * @see #unsetCanRunAsynchronuously()
	 * @see #isCanRunAsynchronuously()
	 * @see #setCanRunAsynchronuously(boolean)
	 * @generated
	 */
	boolean isSetCanRunAsynchronuously();

	/**
	 * Returns the value of the '<em><b>Can Signal Events</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Signal Events</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Signal Events</em>' attribute.
	 * @see #isSetCanSignalEvents()
	 * @see #unsetCanSignalEvents()
	 * @see #setCanSignalEvents(boolean)
	 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType_CanSignalEvents()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canSignalEvents' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanSignalEvents();

	/**
	 * Sets the value of the '{@link FmiModelV1.CapabilitiesType#isCanSignalEvents <em>Can Signal Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Signal Events</em>' attribute.
	 * @see #isSetCanSignalEvents()
	 * @see #unsetCanSignalEvents()
	 * @see #isCanSignalEvents()
	 * @generated
	 */
	void setCanSignalEvents(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.CapabilitiesType#isCanSignalEvents <em>Can Signal Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanSignalEvents()
	 * @see #isCanSignalEvents()
	 * @see #setCanSignalEvents(boolean)
	 * @generated
	 */
	void unsetCanSignalEvents();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.CapabilitiesType#isCanSignalEvents <em>Can Signal Events</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Signal Events</em>' attribute is set.
	 * @see #unsetCanSignalEvents()
	 * @see #isCanSignalEvents()
	 * @see #setCanSignalEvents(boolean)
	 * @generated
	 */
	boolean isSetCanSignalEvents();

	/**
	 * Returns the value of the '<em><b>Can Be Instantiated Only Once Per Process</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Be Instantiated Only Once Per Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Be Instantiated Only Once Per Process</em>' attribute.
	 * @see #isSetCanBeInstantiatedOnlyOncePerProcess()
	 * @see #unsetCanBeInstantiatedOnlyOncePerProcess()
	 * @see #setCanBeInstantiatedOnlyOncePerProcess(boolean)
	 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType_CanBeInstantiatedOnlyOncePerProcess()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canBeInstantiatedOnlyOncePerProcess' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanBeInstantiatedOnlyOncePerProcess();

	/**
	 * Sets the value of the '{@link FmiModelV1.CapabilitiesType#isCanBeInstantiatedOnlyOncePerProcess <em>Can Be Instantiated Only Once Per Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Be Instantiated Only Once Per Process</em>' attribute.
	 * @see #isSetCanBeInstantiatedOnlyOncePerProcess()
	 * @see #unsetCanBeInstantiatedOnlyOncePerProcess()
	 * @see #isCanBeInstantiatedOnlyOncePerProcess()
	 * @generated
	 */
	void setCanBeInstantiatedOnlyOncePerProcess(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.CapabilitiesType#isCanBeInstantiatedOnlyOncePerProcess <em>Can Be Instantiated Only Once Per Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanBeInstantiatedOnlyOncePerProcess()
	 * @see #isCanBeInstantiatedOnlyOncePerProcess()
	 * @see #setCanBeInstantiatedOnlyOncePerProcess(boolean)
	 * @generated
	 */
	void unsetCanBeInstantiatedOnlyOncePerProcess();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.CapabilitiesType#isCanBeInstantiatedOnlyOncePerProcess <em>Can Be Instantiated Only Once Per Process</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Be Instantiated Only Once Per Process</em>' attribute is set.
	 * @see #unsetCanBeInstantiatedOnlyOncePerProcess()
	 * @see #isCanBeInstantiatedOnlyOncePerProcess()
	 * @see #setCanBeInstantiatedOnlyOncePerProcess(boolean)
	 * @generated
	 */
	boolean isSetCanBeInstantiatedOnlyOncePerProcess();

	/**
	 * Returns the value of the '<em><b>Can Not Use Memory Management Functions</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Not Use Memory Management Functions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Not Use Memory Management Functions</em>' attribute.
	 * @see #isSetCanNotUseMemoryManagementFunctions()
	 * @see #unsetCanNotUseMemoryManagementFunctions()
	 * @see #setCanNotUseMemoryManagementFunctions(boolean)
	 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType_CanNotUseMemoryManagementFunctions()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canNotUseMemoryManagementFunctions' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanNotUseMemoryManagementFunctions();

	/**
	 * Sets the value of the '{@link FmiModelV1.CapabilitiesType#isCanNotUseMemoryManagementFunctions <em>Can Not Use Memory Management Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Not Use Memory Management Functions</em>' attribute.
	 * @see #isSetCanNotUseMemoryManagementFunctions()
	 * @see #unsetCanNotUseMemoryManagementFunctions()
	 * @see #isCanNotUseMemoryManagementFunctions()
	 * @generated
	 */
	void setCanNotUseMemoryManagementFunctions(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.CapabilitiesType#isCanNotUseMemoryManagementFunctions <em>Can Not Use Memory Management Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanNotUseMemoryManagementFunctions()
	 * @see #isCanNotUseMemoryManagementFunctions()
	 * @see #setCanNotUseMemoryManagementFunctions(boolean)
	 * @generated
	 */
	void unsetCanNotUseMemoryManagementFunctions();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.CapabilitiesType#isCanNotUseMemoryManagementFunctions <em>Can Not Use Memory Management Functions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Not Use Memory Management Functions</em>' attribute is set.
	 * @see #unsetCanNotUseMemoryManagementFunctions()
	 * @see #isCanNotUseMemoryManagementFunctions()
	 * @see #setCanNotUseMemoryManagementFunctions(boolean)
	 * @generated
	 */
	boolean isSetCanNotUseMemoryManagementFunctions();

	/**
	 * Returns the value of the '<em><b>Can Get And Set FM Ustate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Get And Set FM Ustate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Get And Set FM Ustate</em>' attribute.
	 * @see #isSetCanGetAndSetFMUstate()
	 * @see #unsetCanGetAndSetFMUstate()
	 * @see #setCanGetAndSetFMUstate(boolean)
	 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType_CanGetAndSetFMUstate()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canGetAndSetFMUstate' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanGetAndSetFMUstate();

	/**
	 * Sets the value of the '{@link FmiModelV1.CapabilitiesType#isCanGetAndSetFMUstate <em>Can Get And Set FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Get And Set FM Ustate</em>' attribute.
	 * @see #isSetCanGetAndSetFMUstate()
	 * @see #unsetCanGetAndSetFMUstate()
	 * @see #isCanGetAndSetFMUstate()
	 * @generated
	 */
	void setCanGetAndSetFMUstate(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.CapabilitiesType#isCanGetAndSetFMUstate <em>Can Get And Set FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanGetAndSetFMUstate()
	 * @see #isCanGetAndSetFMUstate()
	 * @see #setCanGetAndSetFMUstate(boolean)
	 * @generated
	 */
	void unsetCanGetAndSetFMUstate();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.CapabilitiesType#isCanGetAndSetFMUstate <em>Can Get And Set FM Ustate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Get And Set FM Ustate</em>' attribute is set.
	 * @see #unsetCanGetAndSetFMUstate()
	 * @see #isCanGetAndSetFMUstate()
	 * @see #setCanGetAndSetFMUstate(boolean)
	 * @generated
	 */
	boolean isSetCanGetAndSetFMUstate();

	/**
	 * Returns the value of the '<em><b>Can Serialize FM Ustate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Serialize FM Ustate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Serialize FM Ustate</em>' attribute.
	 * @see #isSetCanSerializeFMUstate()
	 * @see #unsetCanSerializeFMUstate()
	 * @see #setCanSerializeFMUstate(boolean)
	 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType_CanSerializeFMUstate()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canSerializeFMUstate' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanSerializeFMUstate();

	/**
	 * Sets the value of the '{@link FmiModelV1.CapabilitiesType#isCanSerializeFMUstate <em>Can Serialize FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Serialize FM Ustate</em>' attribute.
	 * @see #isSetCanSerializeFMUstate()
	 * @see #unsetCanSerializeFMUstate()
	 * @see #isCanSerializeFMUstate()
	 * @generated
	 */
	void setCanSerializeFMUstate(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.CapabilitiesType#isCanSerializeFMUstate <em>Can Serialize FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanSerializeFMUstate()
	 * @see #isCanSerializeFMUstate()
	 * @see #setCanSerializeFMUstate(boolean)
	 * @generated
	 */
	void unsetCanSerializeFMUstate();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.CapabilitiesType#isCanSerializeFMUstate <em>Can Serialize FM Ustate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Serialize FM Ustate</em>' attribute is set.
	 * @see #unsetCanSerializeFMUstate()
	 * @see #isCanSerializeFMUstate()
	 * @see #setCanSerializeFMUstate(boolean)
	 * @generated
	 */
	boolean isSetCanSerializeFMUstate();

	/**
	 * Returns the value of the '<em><b>Model Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Short class name according to C-syntax, e.g. "A_B_C". Used as prefix for FMI functions if the functions are provided in C source code or in static libraries, but not if the functions are provided by a DLL/SharedObject. modelIdentifier is also used as name of the static library or DLL/SharedObject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Identifier</em>' attribute.
	 * @see #setModelIdentifier(String)
	 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType_ModelIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='modelIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModelIdentifier();

	/**
	 * Sets the value of the '{@link FmiModelV1.CapabilitiesType#getModelIdentifier <em>Model Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Identifier</em>' attribute.
	 * @see #getModelIdentifier()
	 * @generated
	 */
	void setModelIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Needs Execution Tool</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, a tool is needed to execute the model and the FMU just contains the communication to this tool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Needs Execution Tool</em>' attribute.
	 * @see #isSetNeedsExecutionTool()
	 * @see #unsetNeedsExecutionTool()
	 * @see #setNeedsExecutionTool(boolean)
	 * @see FmiModelV1.FmiModelV1Package#getCapabilitiesType_NeedsExecutionTool()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='needsExecutionTool' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isNeedsExecutionTool();

	/**
	 * Sets the value of the '{@link FmiModelV1.CapabilitiesType#isNeedsExecutionTool <em>Needs Execution Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Execution Tool</em>' attribute.
	 * @see #isSetNeedsExecutionTool()
	 * @see #unsetNeedsExecutionTool()
	 * @see #isNeedsExecutionTool()
	 * @generated
	 */
	void setNeedsExecutionTool(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.CapabilitiesType#isNeedsExecutionTool <em>Needs Execution Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeedsExecutionTool()
	 * @see #isNeedsExecutionTool()
	 * @see #setNeedsExecutionTool(boolean)
	 * @generated
	 */
	void unsetNeedsExecutionTool();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.CapabilitiesType#isNeedsExecutionTool <em>Needs Execution Tool</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Needs Execution Tool</em>' attribute is set.
	 * @see #unsetNeedsExecutionTool()
	 * @see #isNeedsExecutionTool()
	 * @see #setNeedsExecutionTool(boolean)
	 * @generated
	 */
	boolean isSetNeedsExecutionTool();

} // CapabilitiesType
