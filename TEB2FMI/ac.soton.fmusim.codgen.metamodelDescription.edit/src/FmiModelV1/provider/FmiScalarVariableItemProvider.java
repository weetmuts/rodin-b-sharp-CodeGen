/**
 */
package FmiModelV1.provider;


import FmiModelV1.FmiModelV1Factory;
import FmiModelV1.FmiModelV1Package;
import FmiModelV1.FmiScalarVariable;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link FmiModelV1.FmiScalarVariable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FmiScalarVariableItemProvider
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
	public FmiScalarVariableItemProvider(AdapterFactory adapterFactory) {
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

			addAliasPropertyDescriptor(object);
			addCausalityPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addValueReferencePropertyDescriptor(object);
			addVariabilityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Alias feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAliasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiScalarVariable_alias_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiScalarVariable_alias_feature", "_UI_FmiScalarVariable_type"),
				 FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__ALIAS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Causality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCausalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiScalarVariable_causality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiScalarVariable_causality_feature", "_UI_FmiScalarVariable_type"),
				 FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__CAUSALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiScalarVariable_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiScalarVariable_description_feature", "_UI_FmiScalarVariable_type"),
				 FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiScalarVariable_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiScalarVariable_name_feature", "_UI_FmiScalarVariable_type"),
				 FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiScalarVariable_valueReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiScalarVariable_valueReference_feature", "_UI_FmiScalarVariable_type"),
				 FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__VALUE_REFERENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiScalarVariable_variability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiScalarVariable_variability_feature", "_UI_FmiScalarVariable_type"),
				 FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__VARIABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__REAL);
			childrenFeatures.add(FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__INTEGER);
			childrenFeatures.add(FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__BOOLEAN);
			childrenFeatures.add(FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__STRING);
			childrenFeatures.add(FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__ENUMERATION);
			childrenFeatures.add(FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__DIRECT_DEPENDENCY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FmiScalarVariable.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FmiScalarVariable"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FmiScalarVariable)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FmiScalarVariable_type") :
			getString("_UI_FmiScalarVariable_type") + " " + label;
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

		switch (notification.getFeatureID(FmiScalarVariable.class)) {
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__ALIAS:
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__CAUSALITY:
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__DESCRIPTION:
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__NAME:
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__VALUE_REFERENCE:
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__VARIABILITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__REAL:
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__INTEGER:
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__BOOLEAN:
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__STRING:
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__ENUMERATION:
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__DIRECT_DEPENDENCY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__REAL,
				 FmiModelV1Factory.eINSTANCE.createRealType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__INTEGER,
				 FmiModelV1Factory.eINSTANCE.createIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__BOOLEAN,
				 FmiModelV1Factory.eINSTANCE.createBooleanType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__STRING,
				 FmiModelV1Factory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__ENUMERATION,
				 FmiModelV1Factory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE__DIRECT_DEPENDENCY,
				 FmiModelV1Factory.eINSTANCE.createDirectDependencyType()));
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
