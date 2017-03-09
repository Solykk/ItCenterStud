package hWPhonesWeek3.lesson2;

public abstract class IPhone extends Phone{
	private int appleid;

	public int getAppleid() {
		return appleid;
	}

	public void setAppleid(int appleid) {
		this.appleid = appleid;
	}

	public IPhone(String number, boolean isCamera, int sideSize, int appleid) {
		super(number, isCamera, sideSize);
		this.appleid = appleid;
	}
	
	
}
