package tutorialFour;

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 4 Qns 4
 * Calculator App to do primary operations including +,-,*,/
 * Enter 'Q' or 'q' to exit
 * 
 * @author Jordan Liew
 */

import java.util.Scanner;

public class CalculatorApp {
	private double result = 0;
	public static Scanner sc = new Scanner(System.in);
	private char userChoice = 'a';
	private double userNumber;
	
	public static void main(String[] args) {
		CalculatorApp calculator = new CalculatorApp();
		System.out.println("Calculator is on\nresult = " + calculator.resultValue());
		
		while (calculator.userChoice != 'q') {
				calculator.userChoice = Character.toLowerCase(sc.next().charAt(0)); //Extract first character from next line
				calculator.userNumber = sc.nextDouble();
				calculator.doCalculation();
		}
		System.out.println("Final result = " + calculator.resultValue());
		sc.close();
	}
	
	/**
	 * Return current value of cal
	 * 
	 * @return result - current value stored in cal
	 */
	public double resultValue() {
		return this.result;
	}
	
	/**
	 * Do calculations according to user inputs
	 */
	public void doCalculation() {
		try {
			if (this.userChoice != 'q') {
				this.result = evaluate(this.userChoice, this.resultValue(), this.userNumber);
				System.out.println("updated result "+ this.userChoice + " " + this.userNumber + " = " + this.result);
			}
		}catch(UnknownOperatorException uoe) {
			System.out.println(uoe.getMessage());
			this.handleUnknownOpException();
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			this.handleUnknownOpException(); //Should create another function but lazy
		}
	}
	
	/**
	 * Evaluate the mathematical operation of the first vs the second operand depending on the operator
	 * E.g. op = +, n1 = 2, n3 = 3, return value will be 5.
	 * 
	 * @param op - operator
	 * @param n1 - first operand
	 * @param n2 - second operand
	 * @return result of operation
	 * @throws UnknownOperatorException
	 * @throws ArithmeticException
	 */
	public double evaluate(char op, double n1, double n2) throws UnknownOperatorException, ArithmeticException{
		switch(op) {
		case '+':
			this.result = n1 + n2;
			break;
		case '-':
			this.result = n1 - n2;
			break;
		case '*':
			this.result = n1 * n2;
			break;
		case '/':
			if (n2 == 0)
				throw new ArithmeticException("You cannot divide by zero.\nPlease reenter: ");
			this.result = n1 / n2;
			break;
		default:
			throw new UnknownOperatorException(userChoice + " is an unknown operator\nPlease reenter: ");
		}
		return this.resultValue();
	}
	
	/**
	 * Handles the exception cases, including UnknownOperatorException & ArithmeticException.
	 * Prompts user for valid input
	 * 
	 * @return result of the operation
	 */
	public double handleUnknownOpException() {
		this.userChoice = Character.toLowerCase(sc.next().charAt(0)); //Extract first character from next line
		this.userNumber = sc.nextDouble();
		this.doCalculation();
		return this.resultValue();
	}
}
