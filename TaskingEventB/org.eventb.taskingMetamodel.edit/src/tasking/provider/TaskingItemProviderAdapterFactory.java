/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tasking.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eventb.emf.core.Annotation;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.util.CoreSwitch;

import tasking.TaskingFactory;
import tasking.TaskingPackage;
import tasking.util.TaskingAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskingItemProviderAdapterFactory extends TaskingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(TaskingEditPlugin.INSTANCE, TaskingPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link tasking.Main} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainItemProvider mainItemProvider;

	/**
	 * This creates an adapter for a {@link tasking.Main}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMainAdapter() {
		if (mainItemProvider == null) {
			mainItemProvider = new MainItemProvider(this);
		}

		return mainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tasking.AutoTask_Machine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoTask_MachineItemProvider autoTask_MachineItemProvider;

	/**
	 * This creates an adapter for a {@link tasking.AutoTask_Machine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAutoTask_MachineAdapter() {
		if (autoTask_MachineItemProvider == null) {
			autoTask_MachineItemProvider = new AutoTask_MachineItemProvider(this);
		}

		return autoTask_MachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tasking.Tasking_Machine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tasking_MachineItemProvider tasking_MachineItemProvider;

	/**
	 * This creates an adapter for a {@link tasking.Tasking_Machine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTasking_MachineAdapter() {
		if (tasking_MachineItemProvider == null) {
			tasking_MachineItemProvider = new Tasking_MachineItemProvider(this);
		}

		return tasking_MachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tasking.Environ_Machine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Environ_MachineItemProvider environ_MachineItemProvider;

	/**
	 * This creates an adapter for a {@link tasking.Environ_Machine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnviron_MachineAdapter() {
		if (environ_MachineItemProvider == null) {
			environ_MachineItemProvider = new Environ_MachineItemProvider(this);
		}

		return environ_MachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tasking.FMU_Machine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMU_MachineItemProvider fmU_MachineItemProvider;

	/**
	 * This creates an adapter for a {@link tasking.FMU_Machine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFMU_MachineAdapter() {
		if (fmU_MachineItemProvider == null) {
			fmU_MachineItemProvider = new FMU_MachineItemProvider(this);
		}

		return fmU_MachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tasking.Shared_Machine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Shared_MachineItemProvider shared_MachineItemProvider;

	/**
	 * This creates an adapter for a {@link tasking.Shared_Machine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShared_MachineAdapter() {
		if (shared_MachineItemProvider == null) {
			shared_MachineItemProvider = new Shared_MachineItemProvider(this);
		}

		return shared_MachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tasking.Implementation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationItemProvider implementationItemProvider;

	/**
	 * This creates an adapter for a {@link tasking.Implementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImplementationAdapter() {
		if (implementationItemProvider == null) {
			implementationItemProvider = new ImplementationItemProvider(this);
		}

		return implementationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tasking.ParameterType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterTypeItemProvider parameterTypeItemProvider;

	/**
	 * This creates an adapter for a {@link tasking.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterTypeAdapter() {
		if (parameterTypeItemProvider == null) {
			parameterTypeItemProvider = new ParameterTypeItemProvider(this);
		}

		return parameterTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tasking.SimpleTaskType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTaskTypeItemProvider simpleTaskTypeItemProvider;

	/**
	 * This creates an adapter for a {@link tasking.SimpleTaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleTaskTypeAdapter() {
		if (simpleTaskTypeItemProvider == null) {
			simpleTaskTypeItemProvider = new SimpleTaskTypeItemProvider(this);
		}

		return simpleTaskTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tasking.PeriodicTaskType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicTaskTypeItemProvider periodicTaskTypeItemProvider;

	/**
	 * This creates an adapter for a {@link tasking.PeriodicTaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPeriodicTaskTypeAdapter() {
		if (periodicTaskTypeItemProvider == null) {
			periodicTaskTypeItemProvider = new PeriodicTaskTypeItemProvider(this);
		}

		return periodicTaskTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tasking.AddressedVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressedVariableItemProvider addressedVariableItemProvider;

	/**
	 * This creates an adapter for a {@link tasking.AddressedVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddressedVariableAdapter() {
		if (addressedVariableItemProvider == null) {
			addressedVariableItemProvider = new AddressedVariableItemProvider(this);
		}

		return addressedVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tasking.Typing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypingItemProvider typingItemProvider;

	/**
	 * This creates an adapter for a {@link tasking.Typing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypingAdapter() {
		if (typingItemProvider == null) {
			typingItemProvider = new TypingItemProvider(this);
		}

		return typingItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (mainItemProvider != null) mainItemProvider.dispose();
		if (autoTask_MachineItemProvider != null) autoTask_MachineItemProvider.dispose();
		if (tasking_MachineItemProvider != null) tasking_MachineItemProvider.dispose();
		if (environ_MachineItemProvider != null) environ_MachineItemProvider.dispose();
		if (fmU_MachineItemProvider != null) fmU_MachineItemProvider.dispose();
		if (shared_MachineItemProvider != null) shared_MachineItemProvider.dispose();
		if (implementationItemProvider != null) implementationItemProvider.dispose();
		if (parameterTypeItemProvider != null) parameterTypeItemProvider.dispose();
		if (simpleTaskTypeItemProvider != null) simpleTaskTypeItemProvider.dispose();
		if (periodicTaskTypeItemProvider != null) periodicTaskTypeItemProvider.dispose();
		if (addressedVariableItemProvider != null) addressedVariableItemProvider.dispose();
		if (typingItemProvider != null) typingItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link CorePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class CoreChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends CoreSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseEventBElement(EventBElement object) {
			
			EAnnotation annotation = null;
				
				annotation = TaskingPackage.Literals.AUTO_TASK_MACHINE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
							 TaskingFactory.eINSTANCE.createAutoTask_Machine()));

				
				annotation = TaskingPackage.Literals.TASKING_MACHINE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
							 TaskingFactory.eINSTANCE.createTasking_Machine()));

				
				annotation = TaskingPackage.Literals.ENVIRON_MACHINE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
							 TaskingFactory.eINSTANCE.createEnviron_Machine()));

				
				annotation = TaskingPackage.Literals.FMU_MACHINE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
							 TaskingFactory.eINSTANCE.createFMU_Machine()));

				
				annotation = TaskingPackage.Literals.SHARED_MACHINE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
							 TaskingFactory.eINSTANCE.createShared_Machine()));

				
				annotation = TaskingPackage.Literals.IMPLEMENTATION.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
							 TaskingFactory.eINSTANCE.createImplementation()));

				
				annotation = TaskingPackage.Literals.PARAMETER_TYPE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
							 TaskingFactory.eINSTANCE.createParameterType()));

				
				annotation = TaskingPackage.Literals.ADDRESSED_VARIABLE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
							 TaskingFactory.eINSTANCE.createAddressedVariable()));

				
				annotation = TaskingPackage.Literals.TYPING.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
							 TaskingFactory.eINSTANCE.createTyping()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseAnnotation(Annotation object) {
			
			EAnnotation annotation = null;
				
				annotation = TaskingPackage.Literals.AUTO_TASK_MACHINE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 TaskingFactory.eINSTANCE.createAutoTask_Machine()));

				
				annotation = TaskingPackage.Literals.TASKING_MACHINE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 TaskingFactory.eINSTANCE.createTasking_Machine()));

				
				annotation = TaskingPackage.Literals.ENVIRON_MACHINE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 TaskingFactory.eINSTANCE.createEnviron_Machine()));

				
				annotation = TaskingPackage.Literals.FMU_MACHINE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 TaskingFactory.eINSTANCE.createFMU_Machine()));

				
				annotation = TaskingPackage.Literals.SHARED_MACHINE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 TaskingFactory.eINSTANCE.createShared_Machine()));

				
				annotation = TaskingPackage.Literals.IMPLEMENTATION.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 TaskingFactory.eINSTANCE.createImplementation()));

				
				annotation = TaskingPackage.Literals.PARAMETER_TYPE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 TaskingFactory.eINSTANCE.createParameterType()));

				
				annotation = TaskingPackage.Literals.SIMPLE_TASK_TYPE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 TaskingFactory.eINSTANCE.createSimpleTaskType()));

				
				annotation = TaskingPackage.Literals.PERIODIC_TASK_TYPE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 TaskingFactory.eINSTANCE.createPeriodicTaskType()));

				
				annotation = TaskingPackage.Literals.ADDRESSED_VARIABLE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 TaskingFactory.eINSTANCE.createAddressedVariable()));

				
				annotation = TaskingPackage.Literals.TYPING.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 TaskingFactory.eINSTANCE.createTyping()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
		   new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
		   return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return TaskingEditPlugin.INSTANCE;
		}
	}

}
