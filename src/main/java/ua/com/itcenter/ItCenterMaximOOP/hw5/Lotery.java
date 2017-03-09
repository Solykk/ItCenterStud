package hw5;

import java.util.Arrays;

public class Lotery {
	
	public static boolean testForTrue(int[] p ){
		boolean t = false;
		for(int i = 0; i < p.length; i++ ){
			for (int k = i + 1; k < p.length; k++){
				if(p[i] == p[k]){
					t = true;
					break;
				}
				
			}
		}
		
		return t;
	}
	
	
	
	public static void suchElementExeption(int[] p){
		for(int i = 0; i < p.length; i++ ){
			for (int k = i + 1; k < p.length; k++){
				if(p[i] == p[k]){
					
					p[k] = (int)(Math.random() * 52);
					if(p[k] == 0){
						p[k] = nullPointBilet(p[k]);
					}
					
				}
			}
		}
		
	}
	
	public static int nullPointBilet(int c){
		c = (int)(Math.random() * 52);
		if (c == 0){
			c++;
		}
		return c;
	}
	public static void loteryBilet(){
		int [] mas = new int[6];
		for(int i = 0; i< mas.length; i++){
			int tmp = (int)(Math.random() * 52);
			if (tmp == 0){
				tmp = nullPointBilet(tmp);
				}	
			mas[i] = tmp;
		}
		while(testForTrue(mas) != false){
		suchElementExeption(mas);
		}
	 Arrays.sort(mas);
		for(int y : mas){
			System.out.print("<" + y + ">");
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++){
		loteryBilet();
		System.out.println();
		}
	}
}
