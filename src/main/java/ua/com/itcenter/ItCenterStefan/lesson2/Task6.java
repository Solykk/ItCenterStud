package lesson2;

public class Task6 {
	public static void main(String[] args) {
		  
		//  int [] array = {5, 5, 0, 2, 5, 8, 4, 9, 4, 8};
		  int [] array = new int [15];
		  
		  int idx = 0;
		  while(idx < array.length){
	      array[idx] = 1 + (int)(Math.random() * 9);
	       idx++;
	 }
		  
		  idx = 0;
		  while(idx < array.length){
		   System.out.print(array[idx] + " ");
		   idx++;
		  }
		  System.out.println();
		  
		  idx = 0;
		  int count = 0;
		  while(idx < array.length){
		   if(array[idx] % 2 != 0){
		    array[idx] = 0;
		   } else {
		    count++;
		   }
		   idx++;
		  }
		  
		  idx = 0;
		  while(idx < array.length){
		   System.out.print(array[idx] + " ");
		   idx++;
		  }
		  System.out.println();
		  
		  
		  int [] pairs = new int [count];
		  
		  int pairIdx = 0;
		  idx = 0;
		  while(idx < array.length){
		   if(array[idx] != 0){
		    pairs[pairIdx] = array[idx];
		    pairIdx++;
		   }
		   idx++;
		  }
		  
		  
		  idx = 0;
		  while(idx < pairs.length){
		   System.out.print(pairs[idx] + " ");
		   idx++;
		  }
		  
		 }}