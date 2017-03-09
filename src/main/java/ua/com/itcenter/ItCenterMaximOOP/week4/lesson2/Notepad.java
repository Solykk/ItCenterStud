package week4.lesson2;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.xml.crypto.Data;

public class Notepad {
	
	ArrayList<Data> datas = new ArrayList<Data>();
	
	
	public void printByDate(GregorianCalendar d){
		System.out.println(d.getTime());
	}
	
	public void add(GregorianCalendar dd, String ss){
		datas.add(dd);
		
	}
	
	

	public class Data{
		
		ArrayList<String> list = new ArrayList<String>();
		
		private GregorianCalendar date;
		

		public Date(GregorianCalendar date ,ArrayList<String> list) {
			super();
			this.date = date;
			this.list = list;
		}
		
			
		
		
		
		
	}
	
	public static class NotepadMain{
		 public static void main(String[] args) {
			  Notepad n = new Notepad();
			  GregorianCalendar date1 = new GregorianCalendar(2015,01,20);
			  GregorianCalendar date2 = new GregorianCalendar(2015,01,21);
			  n.add(date1, "Первая строка");
			  n.add(date1, "Вторая строка");
			  n.add(date2, "Третья строка");
			  n.printByDate(date1);
			 }
	}
}
