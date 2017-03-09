package lesson3;
import java.util.Scanner;
public class Tasc11 {
			public static void main(String[] args){
			Scanner key = new Scanner(System.in);
			System.out.print("VVedite chislo");
			int vall = key.nextInt();
			int vall2 = key.nextInt();
			for (int i = 1, j = vall2; i <= vall; i++){
			System.out.print( (int)(Math.pow(i, j)) + " ");
			      
			}
}}
