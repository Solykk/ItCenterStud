package hWPhonesWeek3.lesson2;

public class IPhone4 extends IPhone{
	private String marka = "IPhone4";

	public String getMarka() {
		return this.marka;
	}

	public IPhone4(String number, boolean isCamera, int sideSize, int appleid) {
		super(number, isCamera, sideSize, appleid);
		
	}

	@Override
	public void printModel() {
		System.out.println("Telephone " + this.marka);
		System.out.println();
	}
	
	
	
	
}
