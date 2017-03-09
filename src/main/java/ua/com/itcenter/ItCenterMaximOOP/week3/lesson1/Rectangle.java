package week3.lesson1;

public class Rectangle extends Square{
	
	private double sideB;
	
		
	public Rectangle (double xPos, double yPos, double sideA, double sideB) {
		super(xPos, yPos, sideA);
		this.setSideB(sideB);
	}


	public double getSideB() {
		return sideB;
	}


	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
}
