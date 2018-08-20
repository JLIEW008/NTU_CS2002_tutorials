package tutorialTwo;

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 2 Qns 2
 * 
 * @author Jordan Liew
 */

public class Dice {
	private int valueOfDice;
	
	/**
	 * Generate Dice
	 */
	public Dice() {}
	
	/**
	 * Set dice value
	 * 
	 * @param desired value of dice
	 */
	public void setDiceValue(int valueOfDice) {
		this.valueOfDice = valueOfDice;
	}
	
	/**
	 * Returns value of dice
	 * 
	 * @return value of the dice
	 */
	public int getDiceValue() {
		return this.valueOfDice;
	}
	
	/**
	 * Prints the current value of the dice
	 */
	public void printDiceValue() {
		System.out.println("Current Value is " + this.valueOfDice);
	}
}
