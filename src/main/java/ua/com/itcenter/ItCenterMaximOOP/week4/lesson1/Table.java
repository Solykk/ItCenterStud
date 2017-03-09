package week4.lesson1;

public class Table extends AbstractTable {
	
	public Table(boolean dry) {
		super(dry);
		
	}

	private boolean dry;

			
	public boolean isDry() {
		
		if(dry == false){
			System.out.println(" SUHOY ");
		}
		else{
			System.out.println(" MOKRIY ");
		}
		return dry;
	}

	public void setDry(boolean dry) {
		this.dry = dry;
	}
	
}
