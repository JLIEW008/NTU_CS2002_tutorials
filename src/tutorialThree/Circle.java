package tutorialThree;

public class Circle extends Point{
	protected double radius;
	protected final static double PI = 3.14159;
	
	public Circle(double radius) {
		super(0, 0);
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double area() {
		return PI*this.radius*this.radius;
	}
	
}
