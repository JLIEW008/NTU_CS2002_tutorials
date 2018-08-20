package tutorialTwo;

import java.util.Scanner;

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 2 Qns 1
 * 
 * @author Jordan Liew
 */

public class CircleApp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		printUserOptions();
		userSelection();
		}
	
	private static void printUserOptions() {
		System.out.println("==== Circle Computation ====="
				+ "\n|1. Create a new Circle     |"
				+ "\n|2. Print Area              |"
				+ "\n|3. Print circumference     |"
				+ "\n|4. Quit                    |"
				+ "\n=============================");
	}
	
	private static void userSelection() {
		int userSelection;
		Circle circle = new Circle(0);
		boolean circleCreated = false;
		do {
			System.out.println("Choose option 1-3 (4 to exit): ");
			userSelection = sc.nextInt();
			
			if (userSelection == 1) {
				circleCreated = true;
			}
			
			if ((userSelection < 5) && (userSelection > 0)) {
				if (circleCreated) {
					circle = executeUserSelection(userSelection, circle);
				}
				else if(!circleCreated && (userSelection != 4)) {
					System.out.println("Please create a circle first");
				}
			}
			else {
				System.out.println("Invalid selection. Please choose from the options below: ");
				printUserOptions();
			}
		}
		while(userSelection != 4);
		System.out.println("Thank you!");
	}
	
	private static Circle executeUserSelection(int userSelection, Circle circle) {
		switch(userSelection) {
		case 1: 
			System.out.println("Enter the radius to compute area and circumference");
			int radius = sc.nextInt();
			circle = new Circle(radius);
			System.out.println("A new circle is created");
			break;
			
		case 2:
			System.out.printf("Area of circle"
					+ "\nRadius: " + circle.getRadius()
					+ "\nArea: %.3f\n", circle.area());
			break;
			
		case 3:
			System.out.printf("Circumference of circle"
					+ "\nRadius: " + circle.getRadius()
					+ "\nCircumference: %.3f\n", circle.circumference());
			break;
		
		}
		return circle;
	}
}
