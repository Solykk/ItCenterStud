package hw2;

public class Factorial {
	public static void main(String[] args) {
		int num = 5;
		int rez = 1;
		for(int i = 1; i <= num; i++){
			rez = rez * i; 
    		System.out.println(rez);
    	}
		System.out.println(rez);
	}
}

