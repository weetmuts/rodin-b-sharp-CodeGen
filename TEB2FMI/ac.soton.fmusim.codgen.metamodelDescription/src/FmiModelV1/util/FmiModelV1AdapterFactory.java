/**
 */
package FmiModelV1.util;

import FmiModelV1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see FmiModelV1.FmiModelV1Package
 * @generated
 */
public class FmiModelV1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FmiModelV1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiModelV1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FmiModelV1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiModelV1Switch<Adapter> modelSwitch =
		new FmiModelV1Switch<Adapter>() {
			@Override
			public Adapter caseAnnotationType(AnnotationType object) {
				return createAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseDefaultExperimentType(DefaultExperimentType object) {
				return createDefaultExperimentTypeAdapter();
			}
			@Override
			public Adapter caseDirectDependencyType(DirectDependencyType object) {
				return createDirectDependencyTypeAdapter();
			}
			@Override
			public Adapter caseDisplayUnitDefinitionType(DisplayUnitDefinitionType object) {
				return createDisplayUnitDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEnumerationType(EnumerationType object) {
				return createEnumerationTypeAdapter();
			}
			@Override
			public Adapter caseEnumerationTypeType(EnumerationTypeType object) {
				return createEnumerationTypeTypeAdapter();
			}
			@Override
			public Adapter caseFmiBaseUnit(FmiBaseUnit object) {
				return createFmiBaseUnitAdapter();
			}
			@Override
			public Adapter caseFmiModelDescriptionType(FmiModelDescriptionType object) {
				return createFmiModelDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseFmiScalarVariable(FmiScalarVariable object) {
				return createFmiScalarVariableAdapter();
			}
			@Override
			public Adapter caseFmiType(FmiType object) {
				return createFmiTypeAdapter();
			}
			@Override
			public Adapter caseIntegerType(IntegerType object) {
				return createIntegerTypeAdapter();
			}
			@Override
			public Adapter caseIntegerTypeType(IntegerTypeType object) {
				return createIntegerTypeTypeAdapter();
			}
			@Override
			public Adapter caseItemType(ItemType object) {
				return createItemTypeAdapter();
			}
			@Override
			public Adapter caseModelVariablesType(ModelVariablesType object) {
				return createModelVariablesTypeAdapter();
			}
			@Override
			public Adapter caseRealType(RealType object) {
				return createRealTypeAdapter();
			}
			@Override
			public Adapter caseRealTypeType(RealTypeType object) {
				return createRealTypeTypeAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseToolType(ToolType object) {
				return createToolTypeAdapter();
			}
			@Override
			public Adapter caseTypeDefinitionsType(TypeDefinitionsType object) {
				return createTypeDefinitionsTypeAdapter();
			}
			@Override
			public Adapter caseUnitDefinitionsType(UnitDefinitionsType object) {
				return createUnitDefinitionsTypeAdapter();
			}
			@Override
			public Adapter caseCapabilitiesType(CapabilitiesType object) {
				return createCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseImplementationType(ImplementationType object) {
				return createImplementationTypeAdapter();
			}
			@Override
			public Adapter caseCoSimulation_StandAloneType(CoSimulation_StandAloneType object) {
				return createCoSimulation_StandAloneTypeAdapter();
			}
			@Override
			public Adapter caseVendorAnnotationsType(VendorAnnotationsType object) {
				return createVendorAnnotationsTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.AnnotationType
	 * @generated
	 */
	public Adapter createAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.DefaultExperimentType <em>Default Experiment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.DefaultExperimentType
	 * @generated
	 */
	public Adapter createDefaultExperimentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.DirectDependencyType <em>Direct Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.DirectDependencyType
	 * @generated
	 */
	public Adapter createDirectDependencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.DisplayUnitDefinitionType <em>Display Unit Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.DisplayUnitDefinitionType
	 * @generated
	 */
	public Adapter createDisplayUnitDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.EnumerationType
	 * @generated
	 */
	public Adapter createEnumerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.EnumerationTypeType <em>Enumeration Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.EnumerationTypeType
	 * @generated
	 */
	public Adapter createEnumerationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.FmiBaseUnit <em>Fmi Base Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.FmiBaseUnit
	 * @generated
	 */
	public Adapter createFmiBaseUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.FmiModelDescriptionType <em>Fmi Model Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.FmiModelDescriptionType
	 * @generated
	 */
	public Adapter createFmiModelDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.FmiScalarVariable <em>Fmi Scalar Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.FmiScalarVariable
	 * @generated
	 */
	public Adapter createFmiScalarVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.FmiType <em>Fmi Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.FmiType
	 * @generated
	 */
	public Adapter createFmiTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.IntegerType
	 * @generated
	 */
	public Adapter createIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.IntegerTypeType <em>Integer Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.IntegerTypeType
	 * @generated
	 */
	public Adapter createIntegerTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.ItemType
	 * @generated
	 */
	public Adapter createItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.ModelVariablesType <em>Model Variables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.ModelVariablesType
	 * @generated
	 */
	public Adapter createModelVariablesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.RealType
	 * @generated
	 */
	public Adapter createRealTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.RealTypeType <em>Real Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.RealTypeType
	 * @generated
	 */
	public Adapter createRealTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.ToolType <em>Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.ToolType
	 * @generated
	 */
	public Adapter createToolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.TypeDefinitionsType <em>Type Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.TypeDefinitionsType
	 * @generated
	 */
	public Adapter createTypeDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.UnitDefinitionsType <em>Unit Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.UnitDefinitionsType
	 * @generated
	 */
	public Adapter createUnitDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.CapabilitiesType <em>Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.CapabilitiesType
	 * @generated
	 */
	public Adapter createCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.ImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.ImplementationType
	 * @generated
	 */
	public Adapter createImplementationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.CoSimulation_StandAloneType <em>Co Simulation Stand Alone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.CoSimulation_StandAloneType
	 * @generated
	 */
	public Adapter createCoSimulation_StandAloneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModelV1.VendorAnnotationsType <em>Vendor Annotations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModelV1.VendorAnnotationsType
	 * @generated
	 */
	public Adapter createVendorAnnotationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FmiModelV1AdapterFactory
