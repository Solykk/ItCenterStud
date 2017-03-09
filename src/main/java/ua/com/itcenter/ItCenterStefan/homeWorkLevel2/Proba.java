package homeWorkLevel2;
import java.lang.String;
import java.util.Scanner;
public class Proba {
		public static void main(String [] args){
		System.out.println();
		Scanner key = new Scanner(System.in);
		System.out.println("Enter height of square");
		     int aarr = key.nextInt();
		if (aarr <= 0 || (aarr % 1) > 0 ){
			System.out.println("Error. Enter correct");
			return; // break;
		} 
		System.out.println("Enter width of square");
		    int bbrr = key.nextInt();
		if (bbrr <= 0){
			System.out.println("Error. Enter correct");
			return;
			}
		while(!key.hasNextInt()){
			System.out.println("Error");
			key.next();
		}
           // int intKey = key.nextInt(); Scanner.close;
           // System.out.println(intKey);
		drawRectangle(aarr, bbrr);	
}
	

	public static void drawRectangle(int height, int width){
	
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


