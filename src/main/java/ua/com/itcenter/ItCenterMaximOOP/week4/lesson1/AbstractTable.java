package week4.lesson1;

public abstract class AbstractTable implements Tablable{
	
	private boolean dry;
	
	public boolean isDry(){
		return dry;
	}

	public AbstractTable(boolean dry) {
		super();
		this.dry = dry;
	}

	public void setDry(boolean b) {
		this.dry = b;
		
	}
	
	
}
