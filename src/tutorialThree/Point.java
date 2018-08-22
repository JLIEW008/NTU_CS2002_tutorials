package tutorialThree;

/**
 * NTU CS2002 Object Oriented Programming
 * Tutorial 3 Qns 2
 * 
 * @author Jordan Liew
 */

public class Point {
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "[ " + this.x + "," + " " + this.y + "]";
	}
	
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}