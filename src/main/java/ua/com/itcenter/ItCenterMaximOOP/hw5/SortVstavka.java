package hw5;

public class SortVstavka {
	public static void sortInsertion(int[] vector) {
	    for(int i = 1; i < vector.length; i++){
	        
	            while((i - 1) >= 0 && vector[i - 1] > vector[i]){
	            	System.out.println((i - 1) + " " + i);
	                vector[(i - 1) + 1] = vector[i - 1];
	                vector[i - 1] = vector[i];
	                
	                i -= 1;
	            }
	    }
	}
	
	public static void main(String[] args) {
		int[] gotr = new int[10];
		for(int i = 0; i < gotr.length; i++){
			gotr[i] = (int)(Math.random() *100);
		}
		
		for(int y : gotr){
			System.out.print("<" + y + ">");
			
		}
		System.out.println();
		
		sortInsertion(gotr);
		
		for(int y : gotr){
			System.out.print("<" + y + ">");

		}
		System.out.println();

		int[] gh = {3, 1, 2, 3};
		sortInsertion(gh);
		
	}
		
		
	
	
	 
	
}
