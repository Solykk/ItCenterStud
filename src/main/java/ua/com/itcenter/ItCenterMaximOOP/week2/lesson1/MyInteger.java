package week2.lesson1;

public class MyInteger {
	
	private int value;
	
	public MyInteger (int val){
		this.value = val;
	}
	
	public int getValue(){
		return this.value;
	}
	public MyInteger plus(MyInteger val){
		return new MyInteger(this.getValue() + val.getValue());
		
	}
}