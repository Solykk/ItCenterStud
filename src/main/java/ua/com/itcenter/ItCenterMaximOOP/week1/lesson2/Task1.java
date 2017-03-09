package week1.lesson2;

import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(20);// boxing (prim v objekt) index 0 
			
			Integer p = new Integer(25);
			list.add(p);// index 1
			
			System.out.println(list.size());
			
			Integer k = list.get(0);
			int k1 = list.get(0); // anboxing
			
			System.out.println(list);
			
	}
}
