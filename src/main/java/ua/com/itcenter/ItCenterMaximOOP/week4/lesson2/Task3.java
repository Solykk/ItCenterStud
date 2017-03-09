package week4.lesson2;

public class Task3 {
	int k;
	static int n = 2;
	
	public static void rek2(int k){
				
		if(k >= 2){
			rek2(k - 1);
			System.out.println(k);
		}
	
}
	public static void main(String[] args) {
		rek2(5);
	}
}

