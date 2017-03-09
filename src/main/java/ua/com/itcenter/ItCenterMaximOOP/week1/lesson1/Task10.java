package week1.lesson1;
/*Task10.

1) Написать метод, который в качестве параметра принимает имя файла.
Метод1 возвращает двухмерный массив (String): имена переменных и значение.

В файле набор переменных указаны так:
;v=[156],ghg,hg;m=[12],tytuyr894848;vector=[qwe]; 
Существуют правила форматирования текста в файле:
 - имя переменной всегда стоит между симвоами ';' и '='
 - значение переменной всегда идет после знака '=' и заключено в квадратные кавычки
 - все что идет после квадратных кавычек до ';' являются служебными символами и в данной задаче они игнорируются

Метод2 принимает двухмерный массив и имя файла, метод записывает в файл эти переменные согласно формату.

Метод 3 выводит двухмерный массив на экран.*/
import java.util.*;
import java.io.FileReader;
import java.lang.*;
public class Task10 {
	public static void main (String[] args)throws Exception {
		 FileReader fr = new FileReader("D://Java//workspace2//Base25//Base25//file3.txt");
		 dvumerniyMassiv(fr);
	    
}
	public static void dvumerniyMassiv(FileReader fr) throws Exception{
		Scanner scan = new Scanner(fr);
		String a = "";
		int i = 0;
		while (scan.hasNextLine()) {
			a = a + scan.nextLine();
		}
		System.out.println(a);
		scan.close();
		int tz = (int)(';');
		int rav = (int)('=');
		String b = ""; 
		char[] g = new char[b.length()];
		int[] intov = new int[a.length()];
			for(int j = 0; j < a.length(); j++){
				intov[j] = (int)a.charAt(j);
				//System.out.println(intov[j]);
			}
			for(int k = 0; k < a.length(); k++){
				b = b + (int)a.charAt(k);
				
			}
			
			System.out.print(b);
			System.out.println();
			int c;
			for(int k = 0; k < b.length(); k++){
				//b = (char) b.substring(tz, rav);
				
				System.out.print(g[k] + " ");
			}
			
		//String[][] dvuMas = new String[][];	
	}
}
