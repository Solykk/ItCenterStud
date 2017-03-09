import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;
public class Tasc34 {

		public static void main(String [] args) throws IOException {
			FileWriter writer = new FileWriter("src\\Stadddiii.txt");
			
			writer.write("Hello");//\r\n
			writer.flush();
			//FileReader reader = new FileReader("D:\\Stadddiii.txt"); //polniy put
			//FileReader reader2 = new FileReader("src\\Stadddiii.txt");
			//Scanner scanFromFile = new Scanner(reader2);
			//String line = scanFromFile.nextLine();
			//System.out.println(line);
		//	while(scanFromFile.hasNextLine()){
			//	System.out.println(scanFromFile.nextLine() );
			//
			//}
		//	ArrayList <String> words = new ArrayList<>();
		//	scanFromFile.useDelimiter("[\\s,.!&$%&]+");
		//	while(scanFromFile.hasNext()){
		//		words.add(scanFromFile.next().toUpperCase());
				
		//				}
		//	System.out.println(words);
	//	}
	}
}
