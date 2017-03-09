package lesson3;

public class Tasc6 {
	
		 public static void main(String[] args) {
		  
		  int [] array = new int[10];
		  
		  int idx = 0;
		  while(idx < 10){
		   array[idx] = 1 + (int)(Math.random() * 9);
		   idx++;
		  }
		  
		  idx = 0;
		  while(idx < 10){
		   System.out.print(array[idx] + " ");
		   idx++;
		  }
		  System.out.println();
		  
		  idx = 0;
		  int count = 0;
		  while(idx < 10){
		   if(array[idx] % 2 != 0){
		    array[idx] = 0;
		   } else{
			   count++;
		   }
		   idx++;
		  }
		  int [] pairs =  
		  idx = 0;
		  while(idx < 10){
		   System.out.print(array[idx] + " ");
		   idx++;
		  }
		  
		 }

		}

