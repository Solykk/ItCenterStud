package week4.lesson2;

public class Task2 {
	int k;	
	
	public static int rek(int k){
		if(k > 2 ){
			System.out.println(k + "   " + System.nanoTime());
			
			return  k + rek(k - 1);
		
		}
		
		System.out.println(k + "   " +  System.nanoTime());
		
		return k;
		
	}
	public static void main(String[] args) {
		rek(5);
	}
}