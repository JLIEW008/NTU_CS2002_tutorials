package tutorialThree;

import java.util.Scanner;

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 3 Qns 1 Part A
 * Application to test class VendingMachineUpgraded
 * Improved implementation of VendingMachineUpgradedApp
 * 
 * @author Jordan Liew
 */

public class VendingMachineUpgradedApp {
	// Initialise variables
	static VendingMachineUpgraded VM = new VendingMachineUpgraded();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Adding drinks to VM
		VM.addDrink("Beer", 3.0);
		VM.addDrink("Coke", 1.0);
		VM.addDrink("Green Tea", 5.0);
		
		printVendingMachineOptions();
		userSelectDrink();
		printPaymentOptions();
		userPayment();
		
		
	}
	
	public static void printVendingMachineOptions() {
		System.out.println("====== Vending Machine ======"
				+ "\n|1.Buy Beer ($3.00)         |"
				+ "\n|2.Buy Coke ($1.00)         |"
				+ "\n|3.Buy Green Tea ($5.00)    |");
	}
	
	public static void userSelectDrink() {
		int choice; 
		do {
			System.out.println("Please enter selection: ");
			choice = sc.nextInt();
			VM.selectDrink(choice - 1);
		} while (choice > VM.getNumberOfDrinks() || choice < 1);
	}
	
	public static void printPaymentOptions() {
		System.out.println("Please insert coins:"
				+ "\n========== Coins Input ==========="
				+ "\n|Enter 'Q' for ten cents input   |"
				+ "\n|Enter 'T' for twenty cents input|"
				+ "\n|Enter 'F' for fifty cents input |"
				+ "\n|Enter 'N' for a dollar input    |"
				+ "\n==================================");
	}
	
	public static void userPayment() {
		String userCoinInput;
		while(!VM.checkChange()) {
			userCoinInput = sc.nextLine();
			if (!userCoinInput.isEmpty()) {
				switch(userCoinInput.toLowerCase()) {
				case "q":
					VM.insertCoins(0.1);
					break;
				case "t":
					VM.insertCoins(0.2);
					break;
				case "f":
					VM.insertCoins(0.5);
					break;
				case "n":
					VM.insertCoins(1.0);
					break;
				default:
					System.out.println("Invalid input.");
				}
			}
		}
	}
	
}
