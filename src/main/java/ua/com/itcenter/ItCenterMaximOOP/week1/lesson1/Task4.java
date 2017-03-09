package week1.lesson1;
/*Task4. Написать программу состоящую из методов:

	 - метод, считывает с консоли строку и возвращает ее
	 - метод, считывает с консоли символ и возращает его
	 - метод, принимает строку и символ, делает поиск символа в строке, возвращает индекс последнего вхождения символа в строке
	 - главный метод, только вызовы методов.*/
import java.util.Scanner;

public class Task4 {
	public static String inputString() {
		Scanner key = new Scanner(System.in);
		System.out.println("Vvedite text");
		String str = key.nextLine();
		System.out.println("Vi vveli: " + str);
		return str;
	}

	public static char inputSymvol() {
		Scanner key = new Scanner(System.in);
		System.out.println("Vvedite simvol");
		char fit = key.next().charAt(0);
		System.out.println("Vi vveli: " + fit);
		return fit;
	}

	public static int getCountSymvolByString(String s, char f) {
		int countVall = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == f) {
				countVall++;
			}
		}
		System.out.println(countVall);
		return countVall;
	}

	public static void main(String[] args) {
		String str = inputString();
		char d = inputSymvol();
		int res = getCountSymvolByString(str, d);
		System.out.println("кол-во символов [" + d + "] в строке [" + str + "] = " + res);
	}

}