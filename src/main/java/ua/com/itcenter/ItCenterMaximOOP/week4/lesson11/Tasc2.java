package week4.lesson11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tasc2 {
	public static void main(String[] args) throws IOException{
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter directory ");
		String dir = key.nextLine();
		
		File files = new File(dir);
		File[] file = files.listFiles();
		for(File h: file){
			
			System.out.println(files + " - + " + files.isDirectory());
		}
		
		for(int i = 0; i < file.length; i++){
			
			if(file[i].isDirectory() == true){
				File files1 = new File(file[i].toString());
				File[] file1 = files1.listFiles();
				for(int j = 0; j < file1.length; j++){
					if(file1[i].isDirectory() == true){
						File files2 = new File(file1[i].toString());
						File[] file2 = files2.listFiles();
					}
				}
			//	for(int j  = 0; j < file1.length; j++ ){
				//	System.out.println(file1[j].getPath() + " -----------   Whote");
					
			//	}
			}
			System.out.println();
			System.out.println(file[i] + " - + ");
			
		}
	}
}

