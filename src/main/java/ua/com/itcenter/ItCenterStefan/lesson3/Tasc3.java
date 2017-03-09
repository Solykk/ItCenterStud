package lesson3;

public class Tasc3 {
	public static void main(String[] args) {
		int val2 = 1;
		
		while (val2 < 10){
		int val1 = 0;
		while (val1 < 10){
			System.out.println(val1 * val2);
			val1++;
		}
		System.out.println(val1 * val2);
		val2++;
		}
	}
}