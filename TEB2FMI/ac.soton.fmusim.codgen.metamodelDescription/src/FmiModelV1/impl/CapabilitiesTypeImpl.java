/**
 */
package FmiModelV1.impl;

import FmiModelV1.CapabilitiesType;
import FmiModelV1.FmiModelV1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModelV1.impl.CapabilitiesTypeImpl#isCanHandleVariableCommunicationStepSize <em>Can Handle Variable Communication Step Size</em>}</li>
 *   <li>{@link FmiModelV1.impl.CapabilitiesTypeImpl#isCanHandleEvents <em>Can Handle Events</em>}</li>
 *   <li>{@link FmiModelV1.impl.CapabilitiesTypeImpl#isCanRejectSteps <em>Can Reject Steps</em>}</li>
 *   <li>{@link FmiModelV1.impl.CapabilitiesTypeImpl#isCanInterpolateInputs <em>Can Interpolate Inputs</em>}</li>
 *   <li>{@link FmiModelV1.impl.CapabilitiesTypeImpl#getMaxOutputDerivativeOrder <em>Max Output Derivative Order</em>}</li>
 *   <li>{@link FmiModelV1.impl.CapabilitiesTypeImpl#isCanRunAsynchronuously <em>Can Run Asynchronuously</em>}</li>
 *   <li>{@link FmiModelV1.impl.CapabilitiesTypeImpl#isCanSignalEvents <em>Can Signal Events</em>}</li>
 *   <li>{@link FmiModelV1.impl.CapabilitiesTypeImpl#isCanBeInstantiatedOnlyOncePerProcess <em>Can Be Instantiated Only Once Per Process</em>}</li>
 *   <li>{@link FmiModelV1.impl.CapabilitiesTypeImpl#isCanNotUseMemoryManagementFunctions <em>Can Not Use Memory Management Functions</em>}</li>
 *   <li>{@link FmiModelV1.impl.CapabilitiesTypeImpl#isCanGetAndSetFMUstate <em>Can Get And Set FM Ustate</em>}</li>
 *   <li>{@link FmiModelV1.impl.CapabilitiesTypeImpl#isCanSerializeFMUstate <em>Can Serialize FM Ustate</em>}</li>
 *   <li>{@link FmiModelV1.impl.CapabilitiesTypeImpl#getModelIdentifier <em>Model Identifier</em>}</li>
 *   <li>{@link FmiModelV1.impl.CapabilitiesTypeImpl#isNeedsExecutionTool <em>Needs Execution Tool</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilitiesTypeImpl extends EObjectImpl implements CapabilitiesType {
	/**
	 * The default value of the '{@link #isCanHandleVariableCommunicationStepSize() <em>Can Handle Variable Communication Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanHandleVariableCommunicationStepSize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanHandleVariableCommunicationStepSize() <em>Can Handle Variable Communication Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanHandleVariableCommunicationStepSize()
	 * @generated
	 * @ordered
	 */
	protected boolean canHandleVariableCommunicationStepSize = CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE_EDEFAULT;

	/**
	 * This is true if the Can Handle Variable Communication Step Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canHandleVariableCommunicationStepSizeESet;

	/**
	 * The default value of the '{@link #isCanHandleEvents() <em>Can Handle Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanHandleEvents()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_HANDLE_EVENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanHandleEvents() <em>Can Handle Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanHandleEvents()
	 * @generated
	 * @ordered
	 */
	protected boolean canHandleEvents = CAN_HANDLE_EVENTS_EDEFAULT;

	/**
	 * This is true if the Can Handle Events attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canHandleEventsESet;

	/**
	 * The default value of the '{@link #isCanRejectSteps() <em>Can Reject Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanRejectSteps()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_REJECT_STEPS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanRejectSteps() <em>Can Reject Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanRejectSteps()
	 * @generated
	 * @ordered
	 */
	protected boolean canRejectSteps = CAN_REJECT_STEPS_EDEFAULT;

	/**
	 * This is true if the Can Reject Steps attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canRejectStepsESet;

	/**
	 * The default value of the '{@link #isCanInterpolateInputs() <em>Can Interpolate Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanInterpolateInputs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_INTERPOLATE_INPUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanInterpolateInputs() <em>Can Interpolate Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanInterpolateInputs()
	 * @generated
	 * @ordered
	 */
	protected boolean canInterpolateInputs = CAN_INTERPOLATE_INPUTS_EDEFAULT;

	/**
	 * This is true if the Can Interpolate Inputs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canInterpolateInputsESet;

	/**
	 * The default value of the '{@link #getMaxOutputDerivativeOrder() <em>Max Output Derivative Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOutputDerivativeOrder()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_OUTPUT_DERIVATIVE_ORDER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxOutputDerivativeOrder() <em>Max Output Derivative Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOutputDerivativeOrder()
	 * @generated
	 * @ordered
	 */
	protected long maxOutputDerivativeOrder = MAX_OUTPUT_DERIVATIVE_ORDER_EDEFAULT;

	/**
	 * This is true if the Max Output Derivative Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxOutputDerivativeOrderESet;

	/**
	 * The default value of the '{@link #isCanRunAsynchronuously() <em>Can Run Asynchronuously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanRunAsynchronuously()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_RUN_ASYNCHRONUOUSLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanRunAsynchronuously() <em>Can Run Asynchronuously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanRunAsynchronuously()
	 * @generated
	 * @ordered
	 */
	protected boolean canRunAsynchronuously = CAN_RUN_ASYNCHRONUOUSLY_EDEFAULT;

	/**
	 * This is true if the Can Run Asynchronuously attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canRunAsynchronuouslyESet;

	/**
	 * The default value of the '{@link #isCanSignalEvents() <em>Can Signal Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanSignalEvents()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_SIGNAL_EVENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanSignalEvents() <em>Can Signal Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanSignalEvents()
	 * @generated
	 * @ordered
	 */
	protected boolean canSignalEvents = CAN_SIGNAL_EVENTS_EDEFAULT;

	/**
	 * This is true if the Can Signal Events attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canSignalEventsESet;

	/**
	 * The default value of the '{@link #isCanBeInstantiatedOnlyOncePerProcess() <em>Can Be Instantiated Only Once Per Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanBeInstantiatedOnlyOncePerProcess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanBeInstantiatedOnlyOncePerProcess() <em>Can Be Instantiated Only Once Per Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanBeInstantiatedOnlyOncePerProcess()
	 * @generated
	 * @ordered
	 */
	protected boolean canBeInstantiatedOnlyOncePerProcess = CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS_EDEFAULT;

	/**
	 * This is true if the Can Be Instantiated Only Once Per Process attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canBeInstantiatedOnlyOncePerProcessESet;

	/**
	 * The default value of the '{@link #isCanNotUseMemoryManagementFunctions() <em>Can Not Use Memory Management Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanNotUseMemoryManagementFunctions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanNotUseMemoryManagementFunctions() <em>Can Not Use Memory Management Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanNotUseMemoryManagementFunctions()
	 * @generated
	 * @ordered
	 */
	protected boolean canNotUseMemoryManagementFunctions = CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS_EDEFAULT;

	/**
	 * This is true if the Can Not Use Memory Management Functions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canNotUseMemoryManagementFunctionsESet;

	/**
	 * The default value of the '{@link #isCanGetAndSetFMUstate() <em>Can Get And Set FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanGetAndSetFMUstate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_GET_AND_SET_FM_USTATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanGetAndSetFMUstate() <em>Can Get And Set FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanGetAndSetFMUstate()
	 * @generated
	 * @ordered
	 */
	protected boolean canGetAndSetFMUstate = CAN_GET_AND_SET_FM_USTATE_EDEFAULT;

	/**
	 * This is true if the Can Get And Set FM Ustate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canGetAndSetFMUstateESet;

	/**
	 * The default value of the '{@link #isCanSerializeFMUstate() <em>Can Serialize FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanSerializeFMUstate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_SERIALIZE_FM_USTATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanSerializeFMUstate() <em>Can Serialize FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanSerializeFMUstate()
	 * @generated
	 * @ordered
	 */
	protected boolean canSerializeFMUstate = CAN_SERIALIZE_FM_USTATE_EDEFAULT;

	/**
	 * This is true if the Can Serialize FM Ustate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canSerializeFMUstateESet;

	/**
	 * The default value of the '{@link #getModelIdentifier() <em>Model Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelIdentifier() <em>Model Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String modelIdentifier = MODEL_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsExecutionTool() <em>Needs Execution Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsExecutionTool()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_EXECUTION_TOOL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsExecutionTool() <em>Needs Execution Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsExecutionTool()
	 * @generated
	 * @ordered
	 */
	protected boolean needsExecutionTool = NEEDS_EXECUTION_TOOL_EDEFAULT;

	/**
	 * This is true if the Needs Execution Tool attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean needsExecutionToolESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelV1Package.Literals.CAPABILITIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanHandleVariableCommunicationStepSize() {
		return canHandleVariableCommunicationStepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanHandleVariableCommunicationStepSize(boolean newCanHandleVariableCommunicationStepSize) {
		boolean oldCanHandleVariableCommunicationStepSize = canHandleVariableCommunicationStepSize;
		canHandleVariableCommunicationStepSize = newCanHandleVariableCommunicationStepSize;
		boolean oldCanHandleVariableCommunicationStepSizeESet = canHandleVariableCommunicationStepSizeESet;
		canHandleVariableCommunicationStepSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE, oldCanHandleVariableCommunicationStepSize, canHandleVariableCommunicationStepSize, !oldCanHandleVariableCommunicationStepSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanHandleVariableCommunicationStepSize() {
		boolean oldCanHandleVariableCommunicationStepSize = canHandleVariableCommunicationStepSize;
		boolean oldCanHandleVariableCommunicationStepSizeESet = canHandleVariableCommunicationStepSizeESet;
		canHandleVariableCommunicationStepSize = CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE_EDEFAULT;
		canHandleVariableCommunicationStepSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE, oldCanHandleVariableCommunicationStepSize, CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE_EDEFAULT, oldCanHandleVariableCommunicationStepSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanHandleVariableCommunicationStepSize() {
		return canHandleVariableCommunicationStepSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanHandleEvents() {
		return canHandleEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanHandleEvents(boolean newCanHandleEvents) {
		boolean oldCanHandleEvents = canHandleEvents;
		canHandleEvents = newCanHandleEvents;
		boolean oldCanHandleEventsESet = canHandleEventsESet;
		canHandleEventsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_EVENTS, oldCanHandleEvents, canHandleEvents, !oldCanHandleEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanHandleEvents() {
		boolean oldCanHandleEvents = canHandleEvents;
		boolean oldCanHandleEventsESet = canHandleEventsESet;
		canHandleEvents = CAN_HANDLE_EVENTS_EDEFAULT;
		canHandleEventsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_EVENTS, oldCanHandleEvents, CAN_HANDLE_EVENTS_EDEFAULT, oldCanHandleEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanHandleEvents() {
		return canHandleEventsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanRejectSteps() {
		return canRejectSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanRejectSteps(boolean newCanRejectSteps) {
		boolean oldCanRejectSteps = canRejectSteps;
		canRejectSteps = newCanRejectSteps;
		boolean oldCanRejectStepsESet = canRejectStepsESet;
		canRejectStepsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_REJECT_STEPS, oldCanRejectSteps, canRejectSteps, !oldCanRejectStepsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanRejectSteps() {
		boolean oldCanRejectSteps = canRejectSteps;
		boolean oldCanRejectStepsESet = canRejectStepsESet;
		canRejectSteps = CAN_REJECT_STEPS_EDEFAULT;
		canRejectStepsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_REJECT_STEPS, oldCanRejectSteps, CAN_REJECT_STEPS_EDEFAULT, oldCanRejectStepsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanRejectSteps() {
		return canRejectStepsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanInterpolateInputs() {
		return canInterpolateInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanInterpolateInputs(boolean newCanInterpolateInputs) {
		boolean oldCanInterpolateInputs = canInterpolateInputs;
		canInterpolateInputs = newCanInterpolateInputs;
		boolean oldCanInterpolateInputsESet = canInterpolateInputsESet;
		canInterpolateInputsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_INTERPOLATE_INPUTS, oldCanInterpolateInputs, canInterpolateInputs, !oldCanInterpolateInputsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanInterpolateInputs() {
		boolean oldCanInterpolateInputs = canInterpolateInputs;
		boolean oldCanInterpolateInputsESet = canInterpolateInputsESet;
		canInterpolateInputs = CAN_INTERPOLATE_INPUTS_EDEFAULT;
		canInterpolateInputsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_INTERPOLATE_INPUTS, oldCanInterpolateInputs, CAN_INTERPOLATE_INPUTS_EDEFAULT, oldCanInterpolateInputsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanInterpolateInputs() {
		return canInterpolateInputsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxOutputDerivativeOrder() {
		return maxOutputDerivativeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOutputDerivativeOrder(long newMaxOutputDerivativeOrder) {
		long oldMaxOutputDerivativeOrder = maxOutputDerivativeOrder;
		maxOutputDerivativeOrder = newMaxOutputDerivativeOrder;
		boolean oldMaxOutputDerivativeOrderESet = maxOutputDerivativeOrderESet;
		maxOutputDerivativeOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.CAPABILITIES_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER, oldMaxOutputDerivativeOrder, maxOutputDerivativeOrder, !oldMaxOutputDerivativeOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxOutputDerivativeOrder() {
		long oldMaxOutputDerivativeOrder = maxOutputDerivativeOrder;
		boolean oldMaxOutputDerivativeOrderESet = maxOutputDerivativeOrderESet;
		maxOutputDerivativeOrder = MAX_OUTPUT_DERIVATIVE_ORDER_EDEFAULT;
		maxOutputDerivativeOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.CAPABILITIES_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER, oldMaxOutputDerivativeOrder, MAX_OUTPUT_DERIVATIVE_ORDER_EDEFAULT, oldMaxOutputDerivativeOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxOutputDerivativeOrder() {
		return maxOutputDerivativeOrderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanRunAsynchronuously() {
		return canRunAsynchronuously;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanRunAsynchronuously(boolean newCanRunAsynchronuously) {
		boolean oldCanRunAsynchronuously = canRunAsynchronuously;
		canRunAsynchronuously = newCanRunAsynchronuously;
		boolean oldCanRunAsynchronuouslyESet = canRunAsynchronuouslyESet;
		canRunAsynchronuouslyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_RUN_ASYNCHRONUOUSLY, oldCanRunAsynchronuously, canRunAsynchronuously, !oldCanRunAsynchronuouslyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanRunAsynchronuously() {
		boolean oldCanRunAsynchronuously = canRunAsynchronuously;
		boolean oldCanRunAsynchronuouslyESet = canRunAsynchronuouslyESet;
		canRunAsynchronuously = CAN_RUN_ASYNCHRONUOUSLY_EDEFAULT;
		canRunAsynchronuouslyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_RUN_ASYNCHRONUOUSLY, oldCanRunAsynchronuously, CAN_RUN_ASYNCHRONUOUSLY_EDEFAULT, oldCanRunAsynchronuouslyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanRunAsynchronuously() {
		return canRunAsynchronuouslyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanSignalEvents() {
		return canSignalEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanSignalEvents(boolean newCanSignalEvents) {
		boolean oldCanSignalEvents = canSignalEvents;
		canSignalEvents = newCanSignalEvents;
		boolean oldCanSignalEventsESet = canSignalEventsESet;
		canSignalEventsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_SIGNAL_EVENTS, oldCanSignalEvents, canSignalEvents, !oldCanSignalEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanSignalEvents() {
		boolean oldCanSignalEvents = canSignalEvents;
		boolean oldCanSignalEventsESet = canSignalEventsESet;
		canSignalEvents = CAN_SIGNAL_EVENTS_EDEFAULT;
		canSignalEventsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_SIGNAL_EVENTS, oldCanSignalEvents, CAN_SIGNAL_EVENTS_EDEFAULT, oldCanSignalEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanSignalEvents() {
		return canSignalEventsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanBeInstantiatedOnlyOncePerProcess() {
		return canBeInstantiatedOnlyOncePerProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanBeInstantiatedOnlyOncePerProcess(boolean newCanBeInstantiatedOnlyOncePerProcess) {
		boolean oldCanBeInstantiatedOnlyOncePerProcess = canBeInstantiatedOnlyOncePerProcess;
		canBeInstantiatedOnlyOncePerProcess = newCanBeInstantiatedOnlyOncePerProcess;
		boolean oldCanBeInstantiatedOnlyOncePerProcessESet = canBeInstantiatedOnlyOncePerProcessESet;
		canBeInstantiatedOnlyOncePerProcessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS, oldCanBeInstantiatedOnlyOncePerProcess, canBeInstantiatedOnlyOncePerProcess, !oldCanBeInstantiatedOnlyOncePerProcessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanBeInstantiatedOnlyOncePerProcess() {
		boolean oldCanBeInstantiatedOnlyOncePerProcess = canBeInstantiatedOnlyOncePerProcess;
		boolean oldCanBeInstantiatedOnlyOncePerProcessESet = canBeInstantiatedOnlyOncePerProcessESet;
		canBeInstantiatedOnlyOncePerProcess = CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS_EDEFAULT;
		canBeInstantiatedOnlyOncePerProcessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS, oldCanBeInstantiatedOnlyOncePerProcess, CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS_EDEFAULT, oldCanBeInstantiatedOnlyOncePerProcessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanBeInstantiatedOnlyOncePerProcess() {
		return canBeInstantiatedOnlyOncePerProcessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanNotUseMemoryManagementFunctions() {
		return canNotUseMemoryManagementFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanNotUseMemoryManagementFunctions(boolean newCanNotUseMemoryManagementFunctions) {
		boolean oldCanNotUseMemoryManagementFunctions = canNotUseMemoryManagementFunctions;
		canNotUseMemoryManagementFunctions = newCanNotUseMemoryManagementFunctions;
		boolean oldCanNotUseMemoryManagementFunctionsESet = canNotUseMemoryManagementFunctionsESet;
		canNotUseMemoryManagementFunctionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS, oldCanNotUseMemoryManagementFunctions, canNotUseMemoryManagementFunctions, !oldCanNotUseMemoryManagementFunctionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanNotUseMemoryManagementFunctions() {
		boolean oldCanNotUseMemoryManagementFunctions = canNotUseMemoryManagementFunctions;
		boolean oldCanNotUseMemoryManagementFunctionsESet = canNotUseMemoryManagementFunctionsESet;
		canNotUseMemoryManagementFunctions = CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS_EDEFAULT;
		canNotUseMemoryManagementFunctionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS, oldCanNotUseMemoryManagementFunctions, CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS_EDEFAULT, oldCanNotUseMemoryManagementFunctionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanNotUseMemoryManagementFunctions() {
		return canNotUseMemoryManagementFunctionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanGetAndSetFMUstate() {
		return canGetAndSetFMUstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanGetAndSetFMUstate(boolean newCanGetAndSetFMUstate) {
		boolean oldCanGetAndSetFMUstate = canGetAndSetFMUstate;
		canGetAndSetFMUstate = newCanGetAndSetFMUstate;
		boolean oldCanGetAndSetFMUstateESet = canGetAndSetFMUstateESet;
		canGetAndSetFMUstateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_GET_AND_SET_FM_USTATE, oldCanGetAndSetFMUstate, canGetAndSetFMUstate, !oldCanGetAndSetFMUstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanGetAndSetFMUstate() {
		boolean oldCanGetAndSetFMUstate = canGetAndSetFMUstate;
		boolean oldCanGetAndSetFMUstateESet = canGetAndSetFMUstateESet;
		canGetAndSetFMUstate = CAN_GET_AND_SET_FM_USTATE_EDEFAULT;
		canGetAndSetFMUstateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_GET_AND_SET_FM_USTATE, oldCanGetAndSetFMUstate, CAN_GET_AND_SET_FM_USTATE_EDEFAULT, oldCanGetAndSetFMUstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanGetAndSetFMUstate() {
		return canGetAndSetFMUstateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanSerializeFMUstate() {
		return canSerializeFMUstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanSerializeFMUstate(boolean newCanSerializeFMUstate) {
		boolean oldCanSerializeFMUstate = canSerializeFMUstate;
		canSerializeFMUstate = newCanSerializeFMUstate;
		boolean oldCanSerializeFMUstateESet = canSerializeFMUstateESet;
		canSerializeFMUstateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_SERIALIZE_FM_USTATE, oldCanSerializeFMUstate, canSerializeFMUstate, !oldCanSerializeFMUstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanSerializeFMUstate() {
		boolean oldCanSerializeFMUstate = canSerializeFMUstate;
		boolean oldCanSerializeFMUstateESet = canSerializeFMUstateESet;
		canSerializeFMUstate = CAN_SERIALIZE_FM_USTATE_EDEFAULT;
		canSerializeFMUstateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.CAPABILITIES_TYPE__CAN_SERIALIZE_FM_USTATE, oldCanSerializeFMUstate, CAN_SERIALIZE_FM_USTATE_EDEFAULT, oldCanSerializeFMUstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanSerializeFMUstate() {
		return canSerializeFMUstateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelIdentifier() {
		return modelIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelIdentifier(String newModelIdentifier) {
		String oldModelIdentifier = modelIdentifier;
		modelIdentifier = newModelIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.CAPABILITIES_TYPE__MODEL_IDENTIFIER, oldModelIdentifier, modelIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsExecutionTool() {
		return needsExecutionTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsExecutionTool(boolean newNeedsExecutionTool) {
		boolean oldNeedsExecutionTool = needsExecutionTool;
		needsExecutionTool = newNeedsExecutionTool;
		boolean oldNeedsExecutionToolESet = needsExecutionToolESet;
		needsExecutionToolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.CAPABILITIES_TYPE__NEEDS_EXECUTION_TOOL, oldNeedsExecutionTool, needsExecutionTool, !oldNeedsExecutionToolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNeedsExecutionTool() {
		boolean oldNeedsExecutionTool = needsExecutionTool;
		boolean oldNeedsExecutionToolESet = needsExecutionToolESet;
		needsExecutionTool = NEEDS_EXECUTION_TOOL_EDEFAULT;
		needsExecutionToolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.CAPABILITIES_TYPE__NEEDS_EXECUTION_TOOL, oldNeedsExecutionTool, NEEDS_EXECUTION_TOOL_EDEFAULT, oldNeedsExecutionToolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNeedsExecutionTool() {
		return needsExecutionToolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE:
				return isCanHandleVariableCommunicationStepSize();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_EVENTS:
				return isCanHandleEvents();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_REJECT_STEPS:
				return isCanRejectSteps();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_INTERPOLATE_INPUTS:
				return isCanInterpolateInputs();
			case FmiModelV1Package.CAPABILITIES_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER:
				return getMaxOutputDerivativeOrder();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_RUN_ASYNCHRONUOUSLY:
				return isCanRunAsynchronuously();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_SIGNAL_EVENTS:
				return isCanSignalEvents();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
				return isCanBeInstantiatedOnlyOncePerProcess();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
				return isCanNotUseMemoryManagementFunctions();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_GET_AND_SET_FM_USTATE:
				return isCanGetAndSetFMUstate();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_SERIALIZE_FM_USTATE:
				return isCanSerializeFMUstate();
			case FmiModelV1Package.CAPABILITIES_TYPE__MODEL_IDENTIFIER:
				return getModelIdentifier();
			case FmiModelV1Package.CAPABILITIES_TYPE__NEEDS_EXECUTION_TOOL:
				return isNeedsExecutionTool();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE:
				setCanHandleVariableCommunicationStepSize((Boolean)newValue);
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_EVENTS:
				setCanHandleEvents((Boolean)newValue);
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_REJECT_STEPS:
				setCanRejectSteps((Boolean)newValue);
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_INTERPOLATE_INPUTS:
				setCanInterpolateInputs((Boolean)newValue);
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER:
				setMaxOutputDerivativeOrder((Long)newValue);
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_RUN_ASYNCHRONUOUSLY:
				setCanRunAsynchronuously((Boolean)newValue);
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_SIGNAL_EVENTS:
				setCanSignalEvents((Boolean)newValue);
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
				setCanBeInstantiatedOnlyOncePerProcess((Boolean)newValue);
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
				setCanNotUseMemoryManagementFunctions((Boolean)newValue);
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_GET_AND_SET_FM_USTATE:
				setCanGetAndSetFMUstate((Boolean)newValue);
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_SERIALIZE_FM_USTATE:
				setCanSerializeFMUstate((Boolean)newValue);
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__MODEL_IDENTIFIER:
				setModelIdentifier((String)newValue);
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__NEEDS_EXECUTION_TOOL:
				setNeedsExecutionTool((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE:
				unsetCanHandleVariableCommunicationStepSize();
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_EVENTS:
				unsetCanHandleEvents();
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_REJECT_STEPS:
				unsetCanRejectSteps();
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_INTERPOLATE_INPUTS:
				unsetCanInterpolateInputs();
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER:
				unsetMaxOutputDerivativeOrder();
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_RUN_ASYNCHRONUOUSLY:
				unsetCanRunAsynchronuously();
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_SIGNAL_EVENTS:
				unsetCanSignalEvents();
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
				unsetCanBeInstantiatedOnlyOncePerProcess();
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
				unsetCanNotUseMemoryManagementFunctions();
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_GET_AND_SET_FM_USTATE:
				unsetCanGetAndSetFMUstate();
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_SERIALIZE_FM_USTATE:
				unsetCanSerializeFMUstate();
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__MODEL_IDENTIFIER:
				setModelIdentifier(MODEL_IDENTIFIER_EDEFAULT);
				return;
			case FmiModelV1Package.CAPABILITIES_TYPE__NEEDS_EXECUTION_TOOL:
				unsetNeedsExecutionTool();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE:
				return isSetCanHandleVariableCommunicationStepSize();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_EVENTS:
				return isSetCanHandleEvents();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_REJECT_STEPS:
				return isSetCanRejectSteps();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_INTERPOLATE_INPUTS:
				return isSetCanInterpolateInputs();
			case FmiModelV1Package.CAPABILITIES_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER:
				return isSetMaxOutputDerivativeOrder();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_RUN_ASYNCHRONUOUSLY:
				return isSetCanRunAsynchronuously();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_SIGNAL_EVENTS:
				return isSetCanSignalEvents();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
				return isSetCanBeInstantiatedOnlyOncePerProcess();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
				return isSetCanNotUseMemoryManagementFunctions();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_GET_AND_SET_FM_USTATE:
				return isSetCanGetAndSetFMUstate();
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_SERIALIZE_FM_USTATE:
				return isSetCanSerializeFMUstate();
			case FmiModelV1Package.CAPABILITIES_TYPE__MODEL_IDENTIFIER:
				return MODEL_IDENTIFIER_EDEFAULT == null ? modelIdentifier != null : !MODEL_IDENTIFIER_EDEFAULT.equals(modelIdentifier);
			case FmiModelV1Package.CAPABILITIES_TYPE__NEEDS_EXECUTION_TOOL:
				return isSetNeedsExecutionTool();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (canHandleVariableCommunicationStepSize: ");
		if (canHandleVariableCommunicationStepSizeESet) result.append(canHandleVariableCommunicationStepSize); else result.append("<unset>");
		result.append(", canHandleEvents: ");
		if (canHandleEventsESet) result.append(canHandleEvents); else result.append("<unset>");
		result.append(", canRejectSteps: ");
		if (canRejectStepsESet) result.append(canRejectSteps); else result.append("<unset>");
		result.append(", canInterpolateInputs: ");
		if (canInterpolateInputsESet) result.append(canInterpolateInputs); else result.append("<unset>");
		result.append(", maxOutputDerivativeOrder: ");
		if (maxOutputDerivativeOrderESet) result.append(maxOutputDerivativeOrder); else result.append("<unset>");
		result.append(", canRunAsynchronuously: ");
		if (canRunAsynchronuouslyESet) result.append(canRunAsynchronuously); else result.append("<unset>");
		result.append(", canSignalEvents: ");
		if (canSignalEventsESet) result.append(canSignalEvents); else result.append("<unset>");
		result.append(", canBeInstantiatedOnlyOncePerProcess: ");
		if (canBeInstantiatedOnlyOncePerProcessESet) result.append(canBeInstantiatedOnlyOncePerProcess); else result.append("<unset>");
		result.append(", canNotUseMemoryManagementFunctions: ");
		if (canNotUseMemoryManagementFunctionsESet) result.append(canNotUseMemoryManagementFunctions); else result.append("<unset>");
		result.append(", canGetAndSetFMUstate: ");
		if (canGetAndSetFMUstateESet) result.append(canGetAndSetFMUstate); else result.append("<unset>");
		result.append(", canSerializeFMUstate: ");
		if (canSerializeFMUstateESet) result.append(canSerializeFMUstate); else result.append("<unset>");
		result.append(", modelIdentifier: ");
		result.append(modelIdentifier);
		result.append(", needsExecutionTool: ");
		if (needsExecutionToolESet) result.append(needsExecutionTool); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CapabilitiesTypeImpl
