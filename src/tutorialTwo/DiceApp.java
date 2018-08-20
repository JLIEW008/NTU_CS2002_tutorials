package tutorialTwo;

import java.util.*;

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 2 Qns 2
 * Application to test Dice Class
 * 
 * @author Jordan Liew
 */

public class DiceApp {
	
	public static void main(String args[]) {
		Random RNG = new Random();
		Scanner sc = new Scanner(System.in);
		int total; 
		System.out.println("Press <key> to roll the first dice");
		sc.nextLine();
		Dice dice = new Dice();
		dice.setDiceValue(RNG.nextInt(6) + 1);
		dice.printDiceValue();
		total = dice.getDiceValue();
		System.out.println("Press <key> to roll the second dice");
		sc.nextLine();
		dice.setDiceValue(RNG.nextInt(6) + 1);
		dice.printDiceValue();
		total += dice.getDiceValue();
		System.out.println("Your total number is " + total);
		sc.close();
	}
}
