package week4.lesson11;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Task1 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter directory ");
		String dir = key.nextLine();
		
		System.out.println("Enter extension of file");
		String ext = key.nextLine();
		
		File files = new File(dir);
		File[] file = files.listFiles();
		
		for(int i = 0; i < file.length; i++){
			if(file[i].toString().endsWith(ext)){
			System.out.println(file[i]);
			}
		}
	}
}

