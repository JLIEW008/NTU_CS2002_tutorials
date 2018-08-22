package tutorialThree;

import java.util.Scanner;

public class ShapeApp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Select shape to create: \n1.Circle\n2.Cylinder ");
		int choice = sc.nextInt();
		if (choice == 1) {
			circlePrompt();
		} else if(choice == 2) {
			cylinderPrompt();
		} else {System.out.println("Error");}
		
		sc.close();
	}
	
	public static void circlePrompt() {
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		Circle circle = new Circle(radius);
		System.out.print("Area of circle with radius " + radius + " is " + circle.area());
	}
	
	public static void cylinderPrompt() {
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		System.out.println("Enter height: ");
		double height = sc.nextDouble();
		Cylinder cylinder = new Cylinder(radius, height);
		System.out.println("Choose an option: \n1.Area\n2.Volume");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.print(cylinder.area());
		} else if (choice == 2) {
			System.out.print(cylinder.volume());
		} else {System.out.print("Error");}
	}
}
