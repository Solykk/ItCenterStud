package week4.lesson1;

public class GlassSquare extends AbstractGlass{
	
	public GlassSquare(int stateOfGlass) {
		super(stateOfGlass);
		
	}

	final private String nameOfGlass = "SQUEARE";

	public String getNameOfGlass() {
		return nameOfGlass;
	}
	
	@Override
	public void pourFromMe(){
		if(this.getStateOfGlass() == 1){
			System.out.println("I am glass " + this.getNameOfGlass() + " poured");
			this.setStateOfGlass(0);
		}
		else if(this.getStateOfGlass() == 0){
			System.out.println("I am glass " + this.getNameOfGlass() + " can not poured because i am empty");
			System.out.println();
		}
		
	}
	
}
