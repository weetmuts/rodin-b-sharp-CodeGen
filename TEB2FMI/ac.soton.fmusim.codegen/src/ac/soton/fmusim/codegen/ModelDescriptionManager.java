package ac.soton.fmusim.codegen;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import FmiModelV1.DocumentRoot;
import FmiModelV1.FmiScalarVariable;
import FmiModelV1.ModelVariablesType;

public class ModelDescriptionManager {

	private List<DocumentRoot> docRootList = new ArrayList<DocumentRoot>();
	private static ModelDescriptionManager manager;

	private ModelDescriptionManager(){
		// This forces the use of getDefault - which sets up the singleton manager
	}
	
	public static ModelDescriptionManager getDefault() {
		if (manager == null) {
			manager = new ModelDescriptionManager();
		}
		return manager;
	}

	public List<DocumentRoot> getDocumentRootList() {
		return docRootList;
	}
	
	public void setDocumentRootList(List<DocumentRoot> docRoot) {
		this.docRootList = docRoot;
	}

	public List<FmiScalarVariable> getScalarVariables() {
		List<FmiScalarVariable> scalarVarList = new ArrayList<FmiScalarVariable>();
		for(DocumentRoot documentRoot: docRootList){
		ModelVariablesType modelVars = documentRoot.getFmiModelDescription()
				.getModelVariables();
		EList<FmiScalarVariable> scalars = modelVars.getScalarVariable();
		scalarVarList.addAll(scalars);
	}
		return scalarVarList;
	}

}
