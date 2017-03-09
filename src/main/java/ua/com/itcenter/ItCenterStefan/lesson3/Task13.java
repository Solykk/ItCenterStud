package lesson3;

public class Task13 {
	public static void main(String[] args){
		int [] arr1  = {1, 2, 3, 4};
		int [] arr2  = {3, 5, 3, 2, 7, 9};
		print(arr1);
		print(arr2);
	}
	public static void print(int [] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
}
