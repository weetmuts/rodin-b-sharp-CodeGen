/**
 */
package FmiModelV1.provider;


import FmiModelV1.CapabilitiesType;
import FmiModelV1.FmiModelV1Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link FmiModelV1.CapabilitiesType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilitiesTypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCanHandleVariableCommunicationStepSizePropertyDescriptor(object);
			addCanHandleEventsPropertyDescriptor(object);
			addCanRejectStepsPropertyDescriptor(object);
			addCanInterpolateInputsPropertyDescriptor(object);
			addMaxOutputDerivativeOrderPropertyDescriptor(object);
			addCanRunAsynchronuouslyPropertyDescriptor(object);
			addCanSignalEventsPropertyDescriptor(object);
			addCanBeInstantiatedOnlyOncePerProcessPropertyDescriptor(object);
			addCanNotUseMemoryManagementFunctionsPropertyDescriptor(object);
			addCanGetAndSetFMUstatePropertyDescriptor(object);
			addCanSerializeFMUstatePropertyDescriptor(object);
			addModelIdentifierPropertyDescriptor(object);
			addNeedsExecutionToolPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Can Handle Variable Communication Step Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanHandleVariableCommunicationStepSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilitiesType_canHandleVariableCommunicationStepSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilitiesType_canHandleVariableCommunicationStepSize_feature", "_UI_CapabilitiesType_type"),
				 FmiModelV1Package.Literals.CAPABILITIES_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Handle Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanHandleEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilitiesType_canHandleEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilitiesType_canHandleEvents_feature", "_UI_CapabilitiesType_type"),
				 FmiModelV1Package.Literals.CAPABILITIES_TYPE__CAN_HANDLE_EVENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Reject Steps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanRejectStepsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilitiesType_canRejectSteps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilitiesType_canRejectSteps_feature", "_UI_CapabilitiesType_type"),
				 FmiModelV1Package.Literals.CAPABILITIES_TYPE__CAN_REJECT_STEPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Interpolate Inputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanInterpolateInputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilitiesType_canInterpolateInputs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilitiesType_canInterpolateInputs_feature", "_UI_CapabilitiesType_type"),
				 FmiModelV1Package.Literals.CAPABILITIES_TYPE__CAN_INTERPOLATE_INPUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Output Derivative Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxOutputDerivativeOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilitiesType_maxOutputDerivativeOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilitiesType_maxOutputDerivativeOrder_feature", "_UI_CapabilitiesType_type"),
				 FmiModelV1Package.Literals.CAPABILITIES_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Run Asynchronuously feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanRunAsynchronuouslyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilitiesType_canRunAsynchronuously_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilitiesType_canRunAsynchronuously_feature", "_UI_CapabilitiesType_type"),
				 FmiModelV1Package.Literals.CAPABILITIES_TYPE__CAN_RUN_ASYNCHRONUOUSLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Signal Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanSignalEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilitiesType_canSignalEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilitiesType_canSignalEvents_feature", "_UI_CapabilitiesType_type"),
				 FmiModelV1Package.Literals.CAPABILITIES_TYPE__CAN_SIGNAL_EVENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Be Instantiated Only Once Per Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanBeInstantiatedOnlyOncePerProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilitiesType_canBeInstantiatedOnlyOncePerProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilitiesType_canBeInstantiatedOnlyOncePerProcess_feature", "_UI_CapabilitiesType_type"),
				 FmiModelV1Package.Literals.CAPABILITIES_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Not Use Memory Management Functions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanNotUseMemoryManagementFunctionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilitiesType_canNotUseMemoryManagementFunctions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilitiesType_canNotUseMemoryManagementFunctions_feature", "_UI_CapabilitiesType_type"),
				 FmiModelV1Package.Literals.CAPABILITIES_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Get And Set FM Ustate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanGetAndSetFMUstatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilitiesType_canGetAndSetFMUstate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilitiesType_canGetAndSetFMUstate_feature", "_UI_CapabilitiesType_type"),
				 FmiModelV1Package.Literals.CAPABILITIES_TYPE__CAN_GET_AND_SET_FM_USTATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Serialize FM Ustate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanSerializeFMUstatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilitiesType_canSerializeFMUstate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilitiesType_canSerializeFMUstate_feature", "_UI_CapabilitiesType_type"),
				 FmiModelV1Package.Literals.CAPABILITIES_TYPE__CAN_SERIALIZE_FM_USTATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilitiesType_modelIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilitiesType_modelIdentifier_feature", "_UI_CapabilitiesType_type"),
				 FmiModelV1Package.Literals.CAPABILITIES_TYPE__MODEL_IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Needs Execution Tool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeedsExecutionToolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CapabilitiesType_needsExecutionTool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CapabilitiesType_needsExecutionTool_feature", "_UI_CapabilitiesType_type"),
				 FmiModelV1Package.Literals.CAPABILITIES_TYPE__NEEDS_EXECUTION_TOOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CapabilitiesType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CapabilitiesType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		CapabilitiesType capabilitiesType = (CapabilitiesType)object;
		return getString("_UI_CapabilitiesType_type") + " " + capabilitiesType.isCanHandleVariableCommunicationStepSize();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CapabilitiesType.class)) {
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE:
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_HANDLE_EVENTS:
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_REJECT_STEPS:
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_INTERPOLATE_INPUTS:
			case FmiModelV1Package.CAPABILITIES_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER:
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_RUN_ASYNCHRONUOUSLY:
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_SIGNAL_EVENTS:
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_GET_AND_SET_FM_USTATE:
			case FmiModelV1Package.CAPABILITIES_TYPE__CAN_SERIALIZE_FM_USTATE:
			case FmiModelV1Package.CAPABILITIES_TYPE__MODEL_IDENTIFIER:
			case FmiModelV1Package.CAPABILITIES_TYPE__NEEDS_EXECUTION_TOOL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FmiModelV1EditPlugin.INSTANCE;
	}

}
