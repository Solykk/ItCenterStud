package week5.lesson1;

public class Lotery {
	public static void main(String[] args) {
		int [] lot = new int[6];
		int k = 0;
		for(int i = 0; i < lot.length; i++){
			
			k = (int)(Math.random() * 60);
			lot[i] = k;
		}
			
		for(int c: lot){
			System.out.print("<" + c + ">");
		}
		
	}
}
