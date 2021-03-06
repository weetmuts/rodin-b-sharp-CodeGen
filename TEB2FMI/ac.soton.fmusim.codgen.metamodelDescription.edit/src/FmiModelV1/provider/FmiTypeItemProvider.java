/**
 */
package FmiModelV1.provider;


import FmiModelV1.FmiModelV1Factory;
import FmiModelV1.FmiModelV1Package;
import FmiModelV1.FmiType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

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
 * This is the item provider adapter for a {@link FmiModelV1.FmiType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FmiTypeItemProvider
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
	public FmiTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_FmiType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiType_description_feature", "_UI_FmiType_type"),
				 FmiModelV1Package.Literals.FMI_TYPE__DESCRIPTION,
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
				 getString("_UI_FmiType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiType_name_feature", "_UI_FmiType_type"),
				 FmiModelV1Package.Literals.FMI_TYPE__NAME,
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
			childrenFeatures.add(FmiModelV1Package.Literals.FMI_TYPE__REAL_TYPE);
			childrenFeatures.add(FmiModelV1Package.Literals.FMI_TYPE__INTEGER_TYPE);
			childrenFeatures.add(FmiModelV1Package.Literals.FMI_TYPE__BOOLEAN_TYPE);
			childrenFeatures.add(FmiModelV1Package.Literals.FMI_TYPE__STRING_TYPE);
			childrenFeatures.add(FmiModelV1Package.Literals.FMI_TYPE__ENUMERATION_TYPE);
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
	 * This returns FmiType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FmiType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FmiType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FmiType_type") :
			getString("_UI_FmiType_type") + " " + label;
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

		switch (notification.getFeatureID(FmiType.class)) {
			case FmiModelV1Package.FMI_TYPE__DESCRIPTION:
			case FmiModelV1Package.FMI_TYPE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FmiModelV1Package.FMI_TYPE__REAL_TYPE:
			case FmiModelV1Package.FMI_TYPE__INTEGER_TYPE:
			case FmiModelV1Package.FMI_TYPE__BOOLEAN_TYPE:
			case FmiModelV1Package.FMI_TYPE__STRING_TYPE:
			case FmiModelV1Package.FMI_TYPE__ENUMERATION_TYPE:
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
				(FmiModelV1Package.Literals.FMI_TYPE__REAL_TYPE,
				 FmiModelV1Factory.eINSTANCE.createRealTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_TYPE__INTEGER_TYPE,
				 FmiModelV1Factory.eINSTANCE.createIntegerTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_TYPE__BOOLEAN_TYPE,
				 FmiModelV1Factory.eINSTANCE.createFmiBaseUnit()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_TYPE__BOOLEAN_TYPE,
				 FmiModelV1Factory.eINSTANCE.createFmiScalarVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_TYPE__BOOLEAN_TYPE,
				 FmiModelV1Factory.eINSTANCE.createFmiType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_TYPE__BOOLEAN_TYPE,
				 FmiModelV1Factory.eINSTANCE.createCoSimulation_StandAloneType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_TYPE__BOOLEAN_TYPE,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_TYPE__STRING_TYPE,
				 FmiModelV1Factory.eINSTANCE.createFmiBaseUnit()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_TYPE__STRING_TYPE,
				 FmiModelV1Factory.eINSTANCE.createFmiScalarVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_TYPE__STRING_TYPE,
				 FmiModelV1Factory.eINSTANCE.createFmiType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_TYPE__STRING_TYPE,
				 FmiModelV1Factory.eINSTANCE.createCoSimulation_StandAloneType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_TYPE__STRING_TYPE,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelV1Package.Literals.FMI_TYPE__ENUMERATION_TYPE,
				 FmiModelV1Factory.eINSTANCE.createEnumerationTypeType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == FmiModelV1Package.Literals.FMI_TYPE__BOOLEAN_TYPE ||
			childFeature == FmiModelV1Package.Literals.FMI_TYPE__STRING_TYPE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
