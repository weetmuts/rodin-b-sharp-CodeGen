package org.eventb.codegen.il1.translator.core;

import java.util.ArrayList;

import org.eventb.codegen.il1.Declaration;
import org.eventb.codegen.il1.IL1Element;
import org.eventb.codegen.il1.PeriodicTaskType;
import org.eventb.codegen.il1.SimpleTaskType;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.Task;
import org.eventb.codegen.il1.TaskType;
import org.eventb.codegen.il1.TaskTypeEnum;
import org.eventb.codegen.il1.translator.AbstractIL1Translator;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.IL1TranslationUnhandledTypeException;
import org.eventb.codegen.il1.translator.TargetLanguage;

/**
 * This handles Task and AutoTask machines. 
 * 
 * @author Chris
 *
 */
public abstract class AbstractTaskIL1Translator extends AbstractIL1Translator {

	@Override
	public ArrayList<String> translate(IL1Element source,
			IL1TranslationManager translationManager,
			TargetLanguage targetLanguage)
			throws IL1TranslationUnhandledTypeException {
		
		Task actualSource = (Task)source;		
		
		//	Translate the declarations - must happen first otherwise theory translator will break.
		//	Each decl translation will be put in a separate ArrayList<String> so that they can be easily
		//	identified individually if needed.
		ArrayList<ArrayList<String>> declList = new ArrayList<ArrayList<String>>();
		for (Declaration decl : actualSource.getDecls())
		{
			ArrayList<String> declStringList = translationManager.translateIL1ElementToCode(decl, targetLanguage);
			ArrayList<String> enumNames = translationManager.getEnumTypeNameList();
			// if this declared type is an enum, we add a suffix
			String declType = decl.getType();
			if(enumNames.contains(declType)){
				// get the declaration from the returned array. An var with an enum type should be the first
				// in the list
				String thisDecl = declStringList.get(0);
				// add the suffix
				int insertAt = thisDecl.lastIndexOf(declType)+declType.length();
				String firstPart = thisDecl.substring(0, insertAt);
				String lastPart = thisDecl.substring(insertAt);
				declStringList.remove(0);
				declStringList.add(firstPart+"Enum"+lastPart);
				
			}
			declList.add(declStringList);
		}
		
		//	Translate the subroutines.
		//	Each subroutine translation will be put in a separate ArrayList<String> so that they can be easily
		//	identified individually if needed.
		ArrayList<ArrayList<String>> subroutineList = new ArrayList<ArrayList<String>>();
		for (Subroutine subroutine : actualSource.getSubroutines())
		{
			ArrayList<String> subStr = translationManager.translateIL1ElementToCode(subroutine, targetLanguage);
			subroutineList.add(subStr);			
		}
		
		//	Translate the task body
		ArrayList<String> taskBody = translationManager.translateIL1ElementToCode(actualSource.getBody(), targetLanguage);
		
		
		//	See if periodic or repeating
		boolean isPeriodic = false;
		boolean isRepeating = false;	//	additional flag on periodic
		int period = -1;				//	default for not periodic
		
		if (actualSource.getTaskType() != null)
		{
			if (actualSource.getTaskType() instanceof PeriodicTaskType)
			{
				isPeriodic = true;
				period = ((PeriodicTaskType)actualSource.getTaskType()).getPeriod();
			}
			if (actualSource.getTaskType() instanceof SimpleTaskType && ((SimpleTaskType)actualSource.getTaskType()).getType() == TaskTypeEnum.REPEATING)
			{
				isRepeating = true;
			}
		}

		//	Get the concrete TaskIL1Translator to put it all together
		ArrayList<String> outCode = this.generateTaskCode(actualSource
				.getName().replaceAll(" ", "").trim(),
				actualSource.getTaskType(), isPeriodic, isRepeating,
				actualSource.getPriority(), period, declList, subroutineList,
				taskBody, actualSource, translationManager, targetLanguage);
		
		
		return outCode;
	}
	

	/**
	 * Puts together all the translations provided into the form required for the target language.
	 * 
	 * @param taskName The name of the task, which will most likely be the name of the function being created for the task.
	 * @param taskType Either SimpleTaskType or PeriodicTaskType.
	 * @param isPeriodic True if periodic, false otherwise.
	 * @param isRepeating True if repeating, false otherwise.
	 * @param priority The priority of the task.
	 * @param period Value greater than 0 if the task is periodic, -1 otherwise.
	 * @param declList The translated declarations. Each ArrayList(String) represents a single declaration that was translated.
	 * @param subroutineList The translated subroutines. Each ArrayList(String) represents a single subroutine that was translated.
	 * @param taskBody The task body that was translated.
	 * @param actualSource The actual Task (or AutoTask) that was being translated.
	 * @param translationManager The translation manager.
	 * @param targetLanguage The actual target language if required.
	 * @return The code for the Task with each line in a separate entry in the ArrayList.
	 */
	protected abstract ArrayList<String> generateTaskCode(String taskName, TaskType taskType, boolean isPeriodic, boolean isRepeating, int priority, int period, ArrayList<ArrayList<String>> declList, ArrayList<ArrayList<String>> subroutineList, ArrayList<String> taskBody, Task actualSource, IL1TranslationManager translationManager, TargetLanguage targetLanguage);

}
