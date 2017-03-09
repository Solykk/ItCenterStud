package hWPhonesWeek3.lesson2;

public class Nokia extends Phone {
	private String marka = "Nokia";

	public String getMarka() {
		return this.marka;
	}
	
	public Nokia(String number, boolean isCamera, int sideSize) {
		super(number, isCamera, sideSize);
		
	}

	@Override
	public void printModel() {
		System.out.println("Telephone " + this.marka);
		System.out.println();
	}
	
	
}