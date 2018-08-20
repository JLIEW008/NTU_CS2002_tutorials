package tutorialThree;

import java.util.ArrayList;

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 3 Qns 1 Part B
 * Improved implementation of VendingMachine
 * 
 * Javadocs not done
 * 
 * @author Jordan Liew
 */

public class VendingMachineUpgraded {
	private ArrayList<Drinks> drinks = new ArrayList<Drinks>();
	private double coinsInserted;
	private int drinkSelected;
	
	public VendingMachineUpgraded() {
		coinsInserted = 0;
		drinkSelected = -1;
	}
	
	public Drinks getDrink(int index){
		return this.drinks.get(index);
	}
	
	public void addDrink(String name, double price) {
		Drinks newDrink = new Drinks(name, price);
		this.drinks.add(newDrink);
	}
	
	public void removeAllDrinks() {
		this.drinks.clear();
	}
	
	public int getNumberOfDrinks() {
		return this.drinks.size();
	}
	
	public double getDrinkPrice(int index){
		return this.drinks.get(index).getDrinkPrice();
	}
	
	public void insertCoins(double coins) {
		coinsInserted += coins;
		System.out.printf("Coins inserted: %.2f\n", coinsInserted);
	}
	
	public void selectDrink(int index) {
		if (index >= 0 && index < drinks.size()) {
			drinkSelected = index;
		}
		else {System.out.println("Invalid choice.");}
	}
	
	public boolean checkChange() {
		double price = drinks.get(drinkSelected).getDrinkPrice(); boolean sufficientCoinsInserted = false;
		if (sufficientCoinsInserted = (price < coinsInserted)) {
			System.out.printf("Change: %.2f", (coinsInserted - price));
			reset(false);
		}
		return sufficientCoinsInserted;
	}
	
	private void reset(boolean resetDrinksOptions) {
		coinsInserted = 0;
		drinkSelected = -1;
		if (resetDrinksOptions) {removeAllDrinks();}
	}
}