package week4.lesson11;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {
	public static void main(String[] args) throws IOException {
		
		
		
		File f = new File("d://java/");
		File[] files = f.listFiles();
		System.out.println(files.length);
		for(int i = 0; i < files.length; i++){
			if(files[i].toString().endsWith(".txt")){
			System.out.println(files[i]);
			}
		}
		System.out.println(f.getCanonicalPath());
		System.out.println(File.separatorChar);
		if (f.isDirectory())
			System.out.println("Это директория");
		if (!f.exists())
			f.createNewFile();
	}
}
