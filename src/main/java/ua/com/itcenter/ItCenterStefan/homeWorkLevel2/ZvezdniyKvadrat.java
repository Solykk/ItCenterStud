package homeWorkLevel2;
import java.util.Scanner;
import java.lang.String;
public class ZvezdniyKvadrat {
	
	public static void main(String [] args){
		System.out.println();
		drawRectangle(4, 5);	}
	
		
	public static void drawRectangle(int height, int width){
		Scanner key = new Scanner(System.in);
		System.out.println("Enter height of square");
		height = key.nextInt();
			if (height <= 0){
				System.out.println("Error. Enter correct");
			} else {
			
		System.out.println("Enter width of square");}
		width = key.nextInt();
		if (width <= 0){
			System.out.println("Error. Enter correct");
			} else{
		String [] array  = new String [width];
		for (int i = 0; i < height; i++){
				
			for(int k = 0; k < array.length; k++){
				String j = "*";
				array [k] = j;
				System.out.print(array[k]);
			}
			System.out.println();
		}
	  }
   }
}