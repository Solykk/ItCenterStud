package week3.lesson1;

public class Triangle extends Figura {
	
	private double sideB;
	
	@Override
	public double getSquare(){
		double res = sideB * getSideA()/2;
		return res;
	}
	
	@Override
	public double getPerimetr(){
		double rez = sideB + getSideA() + Math.sqrt((sideB*sideB) + (getSideA()*getSideA())); 
		return rez;
	}
	
	public Triangle(double xPos, double yPos, double sideA) {
		super(xPos, yPos, sideA);
		this.sideB = sideB;
	}
}
