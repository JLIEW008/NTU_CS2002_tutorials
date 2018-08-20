package tutorialThree;

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 3 Qns 1 Part B
 * Used in VendingMachineUpgraded Class
 * 
 * javadocs not done
 * 
 * @author Jordan Liew
 */

public class Drinks {
	private String name; double price;
	
	public Drinks(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getDrinkName() {
		return this.name;
	}
	
	public double getDrinkPrice() {
		return this.price;
	}
	
}
