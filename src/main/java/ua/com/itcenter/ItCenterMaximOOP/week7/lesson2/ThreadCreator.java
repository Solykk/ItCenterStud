package week7.lesson2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThreadCreator extends Thread implements Runnable{
	
	public void scanAndWrite() throws IOException{
		
	Scanner key  = new Scanner(System.in);
	String s = key.nextLine();
	
	FileWriter i = new FileWriter("D:\\" + s);
	
	}
	
	@Override
	public void run() {
		try {
			scanAndWrite();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
