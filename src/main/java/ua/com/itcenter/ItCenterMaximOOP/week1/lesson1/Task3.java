package week1.lesson1;
/*Task3. Ввести с консоли строку с символами и пробелами. 
Посчитать количество слов в предложении.*/
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String str = key.nextLine();
		System.out.println(str);
		String[] words01 = str.split("[\\s.,:;()/]+");
		System.out.println(str.length());
		int countWord = 0;
		for (int i = 0; i < words01.length; i++) {
			countWord++;
			System.out.print(words01[i] + " ");

		}
		System.out.println();
		System.out.println(countWord);
	}
}