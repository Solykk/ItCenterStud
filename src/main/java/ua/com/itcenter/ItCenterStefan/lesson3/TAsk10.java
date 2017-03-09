package lesson3;

public class TAsk10 {
	public static void main(String[] args) {
		  
		int [] array = new int [10];
		  
		  for (int i = 0; i < array.length; i++){
	      array[i] = 1 + (int)(Math.random() * 9);
	       
	 }
		  
		  for (int i = 0; i < array.length; i++){
		   System.out.print(array[i] + " ");
		  		  }
		  System.out.println();
		  
		  
		  int count = 0;
		  for (int i = 0; i < array.length; i++){
		   if(array[i] % 2 != 0){
		    array[i] = 0;
		   } else {
		    count++;
		   }
		  
		  }
		  for (int i = 0; i < array.length; i++){
		   System.out.print(array[i] + " ");
		   
		  }
		  System.out.println();
		  
		  
		  int [] pairs = new int [count];
		  
//		  int pairIdx = 0;
		  for (int i = 0, j = 0; i < array.length; i++){
		   if(array[i] != 0){
		    pairs[j] = array[i];
		    j++;
		   }
		   
		  }
		  
		  
		  for (int i = 0; i < pairs.length; i++){
		   System.out.print(pairs[i] + " ");
		   
		  }
		  
		 }
	}

