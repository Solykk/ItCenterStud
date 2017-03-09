package week3.lesson1;

public class Figura {
	private double xPos;
	private double yPos;
	private double sideA;
	
	public double getSideA() {
		return sideA;
	}
	
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	
	public double getSquare(){
		return 0;
	}
	
	public double getPerimetr(){
		return 0; 
	}

	public Figura(double xPos, double yPos, double sideA) {
		
		this.xPos = xPos;
		this.yPos = yPos;
		this.sideA = sideA;
	}
	
	
}
