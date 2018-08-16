package tutorialTwo;

import java.util.Random;

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 2 Qns 2
 * 
 * @author Jordan Liew
 */

public class Dice {
	private int valueOfDice;
	static Random RNG = new Random();
	
	/**
	 * Generate Dice
	 */
	public Dice() {
		this.valueOfDice = RNG.nextInt(6) + 1;
	}
	
	/**
	 * Set dice value randomly
	 */
	public void setDiceValue() {
		this.valueOfDice = RNG.nextInt(6) + 1;
	}
	
	/**
	 * Returns value of dice
	 * 
	 * @return valueOfDice
	 */
	public int getDiceValue() {
		return this.valueOfDice;
	}
}
