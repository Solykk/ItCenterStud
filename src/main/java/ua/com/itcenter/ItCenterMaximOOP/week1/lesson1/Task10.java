package week1.lesson1;
/*Task10.

1) �������� �����, ������� � �������� ��������� ��������� ��� �����.
�����1 ���������� ���������� ������ (String): ����� ���������� � ��������.

� ����� ����� ���������� ������� ���:
;v=[156],ghg,hg;m=[12],tytuyr894848;vector=[qwe]; 
���������� ������� �������������� ������ � �����:
 - ��� ���������� ������ ����� ����� �������� ';' � '='
 - �������� ���������� ������ ���� ����� ����� '=' � ��������� � ���������� �������
 - ��� ��� ���� ����� ���������� ������� �� ';' �������� ���������� ��������� � � ������ ������ ��� ������������

�����2 ��������� ���������� ������ � ��� �����, ����� ���������� � ���� ��� ���������� �������� �������.

����� 3 ������� ���������� ������ �� �����.*/
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
