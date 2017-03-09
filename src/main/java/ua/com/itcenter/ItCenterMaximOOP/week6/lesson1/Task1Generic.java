package week6.lesson1;

import java.util.ArrayList;



public class Task1Generic {
	
	public static <T> void convert(T[] a){
	if(a.getClass().getName().toString().endsWith("Integer;")){	
	System.out.println("True");	
	}
	ArrayList<String> arr = new ArrayList<String>();	
		
		for(int i = 0; i < a.length; i++){
			
			arr.add(a[i].toString());
		}
		
		System.out.println(arr);
	}
	
	
	public static void main(String[] args) {
		
		Integer [] gh =  {2,45,567,8,9,12};
		System.out.println(gh.getClass().getName().toString());
		convert(gh);
	}
}
