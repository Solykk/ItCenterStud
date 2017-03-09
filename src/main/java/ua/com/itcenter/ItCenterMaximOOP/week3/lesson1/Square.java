package week3.lesson1;

public class Square extends Figura {
	private double sideB;
	
	@Override
	public double getSquare(){
		double res = getSideA() * sideB;
		return res;
	}
	
	@Override
	public double getPerimetr(){
		double rez = (getSideA() + sideB) * 2; 
		return rez;
	}
	
	public Square (double xPos, double yPos, double sideA) {
		super(xPos, yPos, sideA);
		this.sideB = sideA;
	}
}

