package hWPhonesWeek3.lesson2;

public class Samsung extends Phone{
	private String marka = "Samsung";

	public String getMarka() {
		return this.marka;
	}

	public Samsung(String number, boolean isCamera, int sideSize) {
		super(number, isCamera, sideSize);
		
	}

	@Override
	public void printModel() {
		System.out.println("Telephone " + this.marka);
		System.out.println();
	}
	
	
		
	
}
