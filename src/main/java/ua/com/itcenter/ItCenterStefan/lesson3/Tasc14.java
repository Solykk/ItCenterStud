package lesson3;

public class Tasc14 {
	public static void main(String[] args){
		int [] arr1  = new int [10];
		
		int [] arr2  = new int [10];
		
	
		zapoln(arr1);
		copy(arr1, arr2);
		boolean res =  equals(arr1, arr2);
		System.out.print(res);
		//int count = countOfNonPair(arr1);
		//zapoln(arr2);
		//print(arr1);
		//print(arr2);
		//System.out.print(count);
		
	}
	public static boolean equals(int [] arr1, int [] arr2){
		if(arr1.length != arr2.length){
			return false;
		}
		for (int i = 0; i < arr1.length; i++ ){
			if(arr1[i] != arr2[i]){
				return false;
			}
		}
		return true;
			 
	}
	
	 public static int copy (int [] arr1, int [] arr2){
		 if(arr1.length != arr2.length){
			 System.out.print("ERROR");
			 return;
		 }
			 for (int i = 0; i < arr1.length; i++ ){
				 arr2[i] = arr1[i]; 
			 	
		 }
	 } 
	public static int countOfNonPair (int [] array){
		int count = 0;
	for(int i = 0; i < array.length; i++ ){
		if(array[i] % 2 != 0){
			count++;
		}
	}
	return count;
	}
	
	public static void zapoln(int [] array){
		for(int i = 0; i < array.length; i++){
		array [i] = 1 + (int)(Math.random() * 9);
		}
	}
		
	public static void print(int [] array){
		System.out.print("[");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]);
				if (i != array.length - 1 ){
				System.out.print(", ");
				
			} 
		System.out.println("]");
	}
	
	}}


