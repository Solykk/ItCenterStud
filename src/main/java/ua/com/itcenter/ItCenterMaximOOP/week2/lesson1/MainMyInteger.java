package week2.lesson1;

public class MainMyInteger {
	public static void main(String[] args) {
		MyInteger a = new MyInteger(50);
		  MyInteger b = new MyInteger(20);
		  MyInteger c = a.plus( b );
		  System.out.println(a.getValue() + " + " + b.getValue() + " = " + c.getValue());
		 }
	}

