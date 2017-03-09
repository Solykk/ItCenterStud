package hWPhonesWeek3.lesson2;

public abstract class Phone {
	private String number;
	private boolean isCamera;
	private int sideSize;
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}

	
	public boolean isCamera() {
		return isCamera;
	}

	public void setCamera(boolean isCamera) {
		this.isCamera = isCamera;
	}

	public int getSideSize() {
		return sideSize;
	}

	public void setSideSize(int sideSize) {
		this.sideSize = sideSize;
	}

	public Phone(String number, boolean isCamera, int sideSize) {
		super();
		this.number = number;
		this.isCamera = isCamera;
		this.sideSize = sideSize;
	}
	
	public abstract void printModel();
		
	
	
	
	
	
}
