package hw5;

import java.util.Arrays;

public class BinarySearch {
	
	
	public static int binarySearch(int[] vector, int element) {
		Arrays.sort(vector);
		int startEl = 0;
		int stopEl = vector.length - 1;
		
		while(startEl <= stopEl){
			if(element == vector[startEl]){
				return startEl;
			}
						
				int centr = (startEl + stopEl)/2;
				
				if(element < vector[centr]){
					stopEl = centr - 1;
				} 
				else{
					if(element > vector[centr]){
						startEl = centr + 1;
					} else{
						stopEl = centr;
						startEl++;
					}
				}
						
		}
	    return -1;
	}
	
	
	public static void main(String[] args) {
		int [] pp = new int[25];
		int c = 1;
		for(int i = 0; i < pp.length; i++){
			pp[i] = c++;
			
		}
		for(int r: pp){
			System.out.print(r + " ");
		}
		System.out.println();
		System.out.println(binarySearch(pp,15));
		//int [] cc = {2, 10, 11, 23, 25, 65, 123, 667, 777};
		//int [] bb = {25,78};
		//System.out.println(binarySearch(bb,78));
	//	System.out.println(binarySearch(cc,777));
	}
}
