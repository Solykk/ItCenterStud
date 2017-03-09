package week1.lesson1;
/*Task9. ���� ������ � ������ �������� 3.
�������� �����, ������� ��������� ��� ����� � ������� ���������� ����� ������ ������.
����������� ���������� (������ ������ ��������� �� ������� �������� �� 3 �������� ������ � � D)
 � ������������ (������ ������ ��������� �� ������� �������� �� 3 �������� ����� E � B)
 ��������: abc15 -> def48
 ���������� ���� �������� ��������� �����. �������� � �������� �� ��������� ������ �� ���������.*/
import java.io.*;
import java.util.*;

public class Task9 {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("file1.txt");
		fw.write("-Privet, kak dela\n");
		fw.write("-normalno\n");
		fw.write("-Vse ok!");
		fw.flush();
		fw.close();
		FileReader fr = new FileReader("file1.txt");
		shyfrOfCezar(fr);
		deshyfrOfCezar(fr);
	}

	public static void shyfrOfCezar(FileReader fr1) throws Exception {
		FileReader fr = new FileReader("file1.txt");
		Scanner scan = new Scanner(fr);
		String a = "";
		int i = 0;
		while (scan.hasNextLine()) {
			a = a + scan.nextLine();

		}
		System.out.println(a);

		scan.close();

		String d = a;
		char[] b = new char[a.length()];
		char y;
		char r;
		int nom;
		int tor;

		for (int j = 0; j < a.length(); j++) {
			y = d.charAt(j);
			nom = (int) y;
			tor = nom + 3;
			r = (char) tor;
			if (y == ' ') {
				r = ' ';
			}
			b[j] = r;

		}
		System.out.print(b);
		FileWriter fw = new FileWriter("file2.txt");
		fw.write(b);
		fw.flush();
		fw.close();
		return;

	}

	public static void deshyfrOfCezar(FileReader fr1) throws Exception {
		FileReader fr = new FileReader("file2.txt");
		Scanner scan = new Scanner(fr);
		String a = "";
		int i = 0;
		while (scan.hasNextLine()) {
			a = a + scan.nextLine();

		}
		System.out.println(a);

		scan.close();

		String d = a;
		char[] b = new char[a.length()];
		char y;
		char r;
		int nom;
		int tor;
		for (int j = 0; j < a.length(); j++) {
			y = d.charAt(j);
			nom = (int) y;
			tor = nom - 3;
			r = (char) tor;
			if (y == ' ') {
				r = ' ';
			}
			b[j] = r;

		}
		System.out.print(b);
		FileWriter fw = new FileWriter("file1.txt");
		fw.write(b);
		fw.flush();
		fw.close();
		return;

	}

}
