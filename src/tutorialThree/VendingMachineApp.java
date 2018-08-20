package tutorialThree;

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 3 Qns 1 Part A
 * Application to test class VendingMachine
 * Bad implementation as requested by question
 * 
 * Javadocs not done
 * 
 * @author Jordan Liew
 */

public class VendingMachineApp {
	
	public static void main(String[] args) {
		double price, coinsInserted;
		VendingMachine VM = new VendingMachine();
		printVendingMachineOptions();
		price = VM.selectDrink();
		coinsInserted = VM.insertCoins(price);
		VM.checkChange(coinsInserted, price);
		VM.printReceipt();
	}
	
	public static void printVendingMachineOptions() {
		System.out.println("====== Vending Machine ======"
				+ "\n|1.Buy Beer ($3.00)         |"
				+ "\n|2.Buy Coke ($1.00)         |"
				+ "\n|3.Buy Green Tea ($5.00)    |");
	}
}
