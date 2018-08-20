package tutorialThree;

import java.util.Scanner;
/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 3 Qns 1 Part A
 * Bad implementation as requested by question
 * 
 * Javadocs not done
 * 
 * @author Jordan Liew
 */
public class VendingMachine {
	double amount, drinkCost;
	static Scanner sc = new Scanner(System.in);
	
	public VendingMachine() {}
	
	public double selectDrink() {
		double price = 0;
		int choice;
		do {
			System.out.println("Please enter selection: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				price = 3;
				break;
			case 2:
				price = 1;
				break;
			case 3: 
				price = 5;
				break;
		}
		
		} while (choice > 3 || choice < 1);
		return price;
	}
	
	public double insertCoins(double drinkCost) {
		double coinsInserted, totalCoinsInserted = 0;
		String userCoinInput;
		System.out.println("Please insert coins:"
				+ "\n========== Coins Input ==========="
				+ "\n|Enter 'Q' for ten cents input   |"
				+ "\n|Enter 'T' for twenty cents input|"
				+ "\n|Enter 'F' for fifty cents input |"
				+ "\n|Enter 'N' for a dollar input    |"
				+ "\n==================================");
		while(totalCoinsInserted < drinkCost) {
			userCoinInput = sc.nextLine();
			if (!userCoinInput.isEmpty()) {
				switch(userCoinInput.toLowerCase()) {
				case "q":
					coinsInserted = 0.1;
					break;
				case "t":
					coinsInserted = 0.2;
					break;
				case "f":
					coinsInserted = 0.5;
					break;
				case "n":
					coinsInserted = 1.0;
					break;
				default:
					System.out.println("Invalid input.");
					coinsInserted = 0;
				}
				System.out.println("Coins inserted: " + coinsInserted);
				totalCoinsInserted += coinsInserted;
			}
		}
		return totalCoinsInserted;
	}
	
	public void checkChange(double amount, double drinkCost) {
		System.out.printf("Change: %.2f\n", (amount - drinkCost));
	}
	
	public void printReceipt() {
		System.out.println("Please collect your drink"
				+ "\nThank You !!");
	}
	
}
