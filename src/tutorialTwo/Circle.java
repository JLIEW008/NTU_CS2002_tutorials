package tutorialTwo;

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 1 Qns 3
 * 
 * @author Jordan Liew
 */


public class Circle {
	private double radius;	//radius of circle
	private static final double PI = 3.14159;
	
	/**
	 * Generate Circle
	 * 
	 * @param radius
	 */
	public Circle(double radius) {
		this.radius = radius; 
	}
	
	/**
	 * Updates radius of Circle
	 * 
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Returns radius of Circle
	 * 
	 * @return radius
	 */
	public double getRadius() {
		return this.radius;
	}
	
	/**
	 * Returns area of Circle
	 * 
	 * @return area
	 */
	public double area() {
		return PI*this.radius*this.radius;
	}
	
	/**
	 * Returns circumference of Circle
	 * @return
	 */
	public double circumference() {
		return 2*PI*this.radius;
	}
	
	/**
	 * Prints area of Circle
	 */
	public void printArea() {
		System.out.print(area());
	}
	
	/**
	 * Prints circumference of Circle
	 */
	public void printCircumference() {
		System.out.print(circumference());
	}
}
