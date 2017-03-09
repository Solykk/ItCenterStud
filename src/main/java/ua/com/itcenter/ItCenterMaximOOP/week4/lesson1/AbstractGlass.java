package week4.lesson1;

public abstract class AbstractGlass implements Glassable{
	
	private int stateOfGlass = 1;
	
	public void pourFromMe(){
		
	}

	public int getStateOfGlass() {
		return stateOfGlass;
	}

	public void setStateOfGlass(int stateOfGlass) {
		this.stateOfGlass = stateOfGlass;
	}

	public AbstractGlass(int stateOfGlass) {
		super();
		this.stateOfGlass = stateOfGlass;
	}

	public String getNameOfGlass() {
		return getNameOfGlass();
	}
	
	
}
