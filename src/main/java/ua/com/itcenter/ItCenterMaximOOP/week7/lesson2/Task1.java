package week7.lesson2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task1 {
	public static void main(String[] args) throws IOException {
		 Reader isr = new InputStreamReader(System.in);
	     BufferedReader d = new BufferedReader(isr);
	        
	     String a = d.readLine();
	     
	     InputStream is = new FileInputStream(a);
	     int len = is.available();
	     byte[] buf = new byte[len];
	     int k = is.read(buf);
	     String t = "";
	     String h = "";
	     for(byte b : buf){
	     t = String.valueOf((char)b);
	     h+=t;
	     System.out.print(t);
	     }
	     System.out.println();
	     System.out.print(h);
	     System.out.println();
	     String [] ui = h.split("[1-9]");
	     for(int i = 0; i < ui.length; i++){
				System.out.print(ui[i] + i);
			}
	     String[] ty = h.split("[\\s[A-Z_a-z].;/]+");
	    System.out.println();
			for(int i = 0; i < ty.length; i++){
				System.out.println(Integer.valueOf(ty[i]) * 2);
			}
	   //  System.out.println("k="+ k);
	    // for(byte b : buf) System.out.print((b) + " ");
	     
	     
	}
}