package ac.soton.fmusim.codegen;

public class FMUTranslatorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6076032918216651789L;

	public FMUTranslatorException(String string) {
		super(string);
	}

	/**
	 * 
	 */

	@Override
	public String getMessage() {
		String initialMessage = super.getMessage() + "\n";
		StackTraceElement[] stackTraceArray = getStackTrace();
		for (int idx = 0; idx < stackTraceArray.length; idx++) {
			initialMessage = initialMessage + stackTraceArray[idx] + "\n";
		}
		return initialMessage;
	}
	
	public static String extractFullExceptionMessage(Exception e) {
		String initialMessage = e.getMessage() + "\n";
		StackTraceElement[] stackTraceArray = e.getStackTrace();
		for (int idx = 0; idx < stackTraceArray.length; idx++) {
			initialMessage = initialMessage + stackTraceArray[idx] + "\n";
		}
		return initialMessage;
	}
}
