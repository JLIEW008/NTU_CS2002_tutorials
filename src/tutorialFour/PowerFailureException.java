package tutorialFour;

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 4 Qns 2
 * 
 * @author Jordan Liew
 */

public class PowerFailureException extends Exception{
	
	/**
	 * Constructs PowerFailureException with default message "Power Failure!"
	 */
	public PowerFailureException() {
		super("Power Failure!");
	}
	
	/**
	 * Constructs PowerFailureException with message defined in parameter
	 * 
	 * @param message - error message to print
	 */
	public PowerFailureException(String message) {
		super(message);
	}
}
