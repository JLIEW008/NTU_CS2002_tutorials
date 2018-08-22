package tutorialThree;

public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}
	
	public double volume() {
		return PI*this.radius*this.radius*this.height;
	}
	
	@Override
	public double area() {
		return 2.0*PI*this.radius*this.height;
	}
}
