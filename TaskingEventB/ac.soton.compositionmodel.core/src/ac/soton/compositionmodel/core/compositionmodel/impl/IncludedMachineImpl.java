/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ac.soton.compositionmodel.core.compositionmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.impl.EventBCommentedElementImpl;
import org.eventb.emf.core.impl.EventBElementImpl;
import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachineFactory;

import ac.soton.compositionmodel.core.compositionmodel.CompositionmodelPackage;
import ac.soton.compositionmodel.core.compositionmodel.IncludedMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Included Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.compositionmodel.core.compositionmodel.impl.IncludedMachineImpl#getMachine <em>Machine</em>}</li>
 *   <li>{@link ac.soton.compositionmodel.core.compositionmodel.impl.IncludedMachineImpl#getMachineName <em>Machine Name</em>}</li>
 *   <li>{@link ac.soton.compositionmodel.core.compositionmodel.impl.IncludedMachineImpl#getProjectName <em>Project Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludedMachineImpl extends EventBCommentedElementImpl implements IncludedMachine {
	/**
	 * The cached value of the '{@link #getMachine() <em>Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachine()
	 * @generated
	 * @ordered
	 */
	protected Machine machine;

	/**
	 * The default value of the '{@link #getMachineName() <em>Machine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineName()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMachineName() <em>Machine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineName()
	 * @generated
	 * @ordered
	 */
	protected String machineName = MACHINE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludedMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionmodelPackage.eINSTANCE.getIncludedMachine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getMachine() {
		if (machine != null && machine.eIsProxy()) {
			InternalEObject oldMachine = (InternalEObject)machine;
			machine = (Machine)eResolveProxy(oldMachine);
			if (machine != oldMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionmodelPackage.INCLUDED_MACHINE__MACHINE, oldMachine, machine));
			}
		}
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine basicGetMachine() {
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachine(Machine newMachine) {
		Machine oldMachine = machine;
		machine = newMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionmodelPackage.INCLUDED_MACHINE__MACHINE, oldMachine, machine));
	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public String getMachineName() {
//		return machineName;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getMachineName() {
		Machine e = getMachine();

		if (e == null)
		{
			return null;
		}

		return e.getName();
	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public void setMachineName(String newMachineName) {
//		String oldMachineName = machineName;
//		machineName = newMachineName;
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, CompositionmodelPackage.COMBINED_EVENT_MACHINE__MACHINE_NAME, oldMachineName, machineName));
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setMachineName(String newName) {

			//get the current Event
			Machine proxy = getMachine();

			if (proxy == null)
			{
				addMachineName(newName);
			}
			else
			{
				//if currently has a proxy at that index, re-use it for the new reference otherwise create a new one.
				if (!proxy.eIsProxy()) proxy = MachineFactory.eINSTANCE.createMachine();
				//set the proxy uri to a dummy with fragment set to newName
				((InternalEObject)proxy).eSetProxyURI(CorePackage.dummyURI.appendFragment(Machine.class.getName()+"."+newName));
				//set the proxy at the given index (using setUnique to avoid checking uniqueness because it involves resolving and loading)
				setMachine(proxy);
			}

			machineName = newName;


			//	Set the machine name as the comment
		//	proxy.setComment(machineName);
	}


	/**
	 * <!-- begin-user-doc -->
	 * Adds a new proxy referencing the given machine name at the given index in the refines list.
	 * This method does not check to see whether the new referenced machine exists,
	 * nor whether the reference is unique within the collection.
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param newName - name of the element referenced
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected void addMachineName(String newName) {
		Machine proxy = MachineFactory.eINSTANCE.createMachine();
		//add the new proxy (using setUnique to avoid checking uniqueness because it involves resolving and loading)
		((InternalEObject)proxy).eSetProxyURI(CorePackage.dummyURI.appendFragment(Machine.class.getName()+"."+newName));
		setMachine(proxy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionmodelPackage.INCLUDED_MACHINE__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionmodelPackage.INCLUDED_MACHINE__MACHINE:
				if (resolve) return getMachine();
				return basicGetMachine();
			case CompositionmodelPackage.INCLUDED_MACHINE__MACHINE_NAME:
				return getMachineName();
			case CompositionmodelPackage.INCLUDED_MACHINE__PROJECT_NAME:
				return getProjectName();
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
			case CompositionmodelPackage.INCLUDED_MACHINE__MACHINE:
				setMachine((Machine)newValue);
				return;
			case CompositionmodelPackage.INCLUDED_MACHINE__MACHINE_NAME:
				setMachineName((String)newValue);
				return;
			case CompositionmodelPackage.INCLUDED_MACHINE__PROJECT_NAME:
				setProjectName((String)newValue);
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
			case CompositionmodelPackage.INCLUDED_MACHINE__MACHINE:
				setMachine((Machine)null);
				return;
			case CompositionmodelPackage.INCLUDED_MACHINE__MACHINE_NAME:
				setMachineName(MACHINE_NAME_EDEFAULT);
				return;
			case CompositionmodelPackage.INCLUDED_MACHINE__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
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
			case CompositionmodelPackage.INCLUDED_MACHINE__MACHINE:
				return machine != null;
			case CompositionmodelPackage.INCLUDED_MACHINE__MACHINE_NAME:
				return MACHINE_NAME_EDEFAULT == null ? machineName != null : !MACHINE_NAME_EDEFAULT.equals(machineName);
			case CompositionmodelPackage.INCLUDED_MACHINE__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
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
		result.append(" (machineName: ");
		result.append(machineName);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(')');
		return result.toString();
	}










	/**
	 * Resolves a proxy associated with this element.
	 * URI's are constructed lazily. A dummy URI with just a fragment holding the name of the referenced item, is used
	 * until this point. When a proxy is resolved, the URI is constructed based on this elements resource URI.
	 * Therefore, proxies will not resolve until this element has been associated with a resource.
	 *
	 * Following construction of the URI, the proxy resolution is deferred to super
	 *
	 * @custom
	 */

	@Override
	public EObject eResolveProxy(InternalEObject proxy){
	  if (proxy != null && proxy.eIsProxy()){
		  if (eResource()==null) return proxy;
		  try{
			 String reference = proxy.eProxyURI().fragment();

			 // if resolved already in the parent, do not resolve again
			 if (eContainer() != null)
				 for (EObject component : eContainer().eContents())
				 {
					 //	CJL - Adding instanceof to prevent exception being thrown when Events are passed through here
					 if (component instanceof EventBNamedCommentedElementImpl && ((EventBNamedCommentedElementImpl) component).getReference().equals(reference))
						 return component;
					//	CJL - Adding check for wider range of objects
					 else if (component instanceof EventBElementImpl && ((EventBElementImpl) component).getReference().equals(reference))
						 return component;
				 }

			 // attempt to construct a suitable proxy URI
			 URI uri=null;
			 String projectName = getURI().trimSegments(getURI().segmentCount()-2).lastSegment();
			 String resourceName = reference.substring(reference.lastIndexOf(".")+1);



			if (proxy instanceof Machine && machine.equals(proxy)){

				//	Get project name from saved version
				projectName = getProjectName();

				 uri = URI.createPlatformResourceURI(projectName, true)
								 	.appendSegment(resourceName)
//								 	.appendFileExtension(External.getString("FileExtensions.machine"))
								 	.appendFileExtension("bum")
								 	.appendFragment(reference);


			}
			 if (uri!=null) proxy.eSetProxyURI(uri);
		  }catch (Exception e){
		//		RodinCore.getPlugin().getLog().log(new Status(Status.ERROR, "org.eventb.emf.core", "Cannot resolve: " + proxy, e));
			  return proxy;
		  }
	  }
	  return super.eResolveProxy(proxy);
	}


	/**
	 * Overrides to always require notification. This is to ensure that changes to derived features can be reflected in the
	 * main features from which they are derived
	 */
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotificationRequired()
	 */
	@Override
	public boolean eNotificationRequired(){return true;}




	/**
	 * Intercepts notification to reflect any changes made to the 'refinesNames' and 'seesNames' lists into
	 * the 'refines' and 'sees' collections from which they are derived.
	 * Then defers to super.
	 */
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotify(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void eNotify(Notification notification){
		if (notification.getFeatureID(this.getClass()) == CompositionmodelPackage.INCLUDED_MACHINE__MACHINE_NAME){
			switch (notification.getEventType()){
			case Notification.SET:
				setMachineName(notification.getNewStringValue());
				break;
			case Notification.UNSET:
				setMachine(null);	//not expected to be used
				break;
			case Notification.ADD: {
				addMachineName(notification.getNewStringValue());
				break;
			}
			case Notification.REMOVE: {
				setMachine(null);
				break;
			}
			case Notification.ADD_MANY: {
	//			for (String newName : (List<String>)notification.getNewValue()){
	//				addEventName(newName);
	//			}
				//	can't be many
				addMachineName(notification.getNewStringValue());
				break;
			}
			case Notification.REMOVE_MANY: {
				if (notification.getNewValue()==null && notification.getPosition()==-1){
					setMachine(null);
				}
				break;
			}
			case Notification.MOVE:
				//N.B decided it is better NOT to prevent exceptions, otherwise the names list will be out of sync with the references
				//if (!(notification.getOldValue() instanceof Integer)) break;
		//		int oldpos = ((Integer)notification.getOldValue()).intValue();
		//		int newpos = notification.getPosition();
				//if (oldpos<0 || newpos<0 || oldpos >= getSees().size() || newpos >= getSees().size() ) break;
		//		getRefines().move(newpos, oldpos);
				break;
			default: break;
			}
		}
		super.eNotify(notification);
	}


} //IncludedMachineImpl
