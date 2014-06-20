package org.eventb.codegen.templates.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;

public class CodeFiler {
	// the default filer
	protected static CodeFiler filer = new CodeFiler();
	protected enum FormatterType {JAVA, C};
	protected FormatterType formatterType = null;
	// Return the default instance
	public static CodeFiler getDefault() {
		return filer;
	}
	
	// Save the code to file given a directory path and filename.
	// Use this if there is a translation manager.
	public void save(List<String> codeToSave, String directoryPath,
			String filename, String language) {
		if(language.equalsIgnoreCase("fmi_c")) formatterType = FormatterType.C;
		else if(language.equalsIgnoreCase("java")) formatterType = FormatterType.JAVA;
		doSave(codeToSave, directoryPath, filename, formatterType);
	}
	
	protected void doSave(List<String> codeToSave, String directoryName,
			String filename, FormatterType formatterType) {
		
		org.eclipse.jdt.core.formatter.CodeFormatter javaCodeFormatter = org.eclipse.jdt.core.ToolFactory.createCodeFormatter(null);
		org.eclipse.cdt.core.formatter.CodeFormatter C_CodeFormatter = org.eclipse.cdt.core.ToolFactory.createCodeFormatter(null);

	    StringBuffer code = new StringBuffer();
	    for(String s: codeToSave){
	    	code.append(s + "\n"); 
	    }
	    
	    TextEdit textEdit = null;
	    
	    if(formatterType == FormatterType.JAVA){
	    	textEdit = javaCodeFormatter.format(org.eclipse.jdt.core.formatter.CodeFormatter.K_UNKNOWN, code.toString(), 0,code.length(),0,null);
	    }
	    else if(formatterType == FormatterType.C){
	    	textEdit = C_CodeFormatter.format(org.eclipse.cdt.core.formatter.CodeFormatter.K_UNKNOWN, code.toString(), 0,code.length(),0,null);
	    }
	    IDocument doc = new Document(code.toString());
	    try {
	    	if(textEdit != null){
	    		textEdit.apply(doc);
	    	}
	    	else{
	    		System.out.println("Tried To format code in CodeFiler.java but failed.");
	    	}
	    } catch (MalformedTreeException e) {
	        e.printStackTrace();
	    } catch (BadLocationException e) {
			e.printStackTrace();
		}   
		// End of Formatting
		String formattedCode = doc.get();
		// write to the file
		String fullName = directoryName + filename;
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fullName));
			out.write(formattedCode);
		out.close();
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}
}
