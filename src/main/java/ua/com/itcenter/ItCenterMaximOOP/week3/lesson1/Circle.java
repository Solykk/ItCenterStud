package week3.lesson1;

public class Circle extends Figura{
	
	private double radiusOfCircle;
	
	@Override
	public double getSquare(){
		double resSquareOfCircle = Math.PI * (radiusOfCircle * radiusOfCircle);
		System.out.println(resSquareOfCircle);
		return resSquareOfCircle;
	}
	
	@Override
	public double getPerimetr(){
		double resPerimetrOfCircle = 2 * Math.PI * radiusOfCircle;
		System.out.println(resPerimetrOfCircle);
		return resPerimetrOfCircle;
	}

	public Circle(double xPos, double yPos, double radiusOfCircle) {
		super(xPos, yPos, radiusOfCircle);
		this.radiusOfCircle = radiusOfCircle;
	}
	
}
