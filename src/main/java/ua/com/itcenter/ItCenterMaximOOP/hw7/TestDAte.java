package hw7;

import java.util.Date;
import java.util.GregorianCalendar;

public class TestDAte {
	public static void main(String[] args) {
		
		GregorianCalendar dateT = new GregorianCalendar(2010, 6, 14);
		Date rty = dateT.getTime();
		GregorianCalendar dateR = new GregorianCalendar(2014, 10, 5);
		Date vbn = dateR.getTime();
		int c = vbn.getYear() - rty.getYear();
		
		
		
		System.out.println(c);
	}
}
