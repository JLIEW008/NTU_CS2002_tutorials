package tutorialFour;

public class UnknownOperatorException extends Exception{
	
	public UnknownOperatorException() {}
	
	public UnknownOperatorException(char op) {}
	
	public UnknownOperatorException(String message) {
		super(message);
	}
}
