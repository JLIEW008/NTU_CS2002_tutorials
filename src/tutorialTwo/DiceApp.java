package tutorialTwo;

import java.util.Scanner;

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 2 Qns 2
 * 
 * @author Jordan Liew
 */

public class DiceApp {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int total; 
		System.out.println("Press <key> to roll the first dice");
		sc.nextLine();
		Dice dice = new Dice();
		System.out.println("Current Value is " + (total = dice.getDiceValue()));
		System.out.println("Press <key> to roll the second dice");
		sc.nextLine();
		dice.setDiceValue();
		System.out.println("Current Value is " + dice.getDiceValue());
		System.out.println("Your total number is " + (total += dice.getDiceValue()));
		sc.close();
	}
	
	
}
