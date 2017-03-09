package week6.lesson1;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task5Exept {
	
	public static void trytry(FileReader g){
		
		try {
			
		
			
		}
		catch(Exception e){
			 throw new ArithmeticException("Fuck You");
		}
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
				FileReader g = new FileReader("file1.txt");
		
					trytry(g);
				}
}
