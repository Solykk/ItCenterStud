package week1.lesson1;

/*Task5. Написать метод boolean myEquals, который принимает две строки.(не используя equals)*/
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String first1 = key.nextLine();
		String second2 = key.nextLine();
		myEqueals(first1, second2);
	}

	public static boolean myEqueals(String first1, String second2) {
		for (int i = 0; i < first1.length(); i++) {
			if (first1.charAt(i) == second2.charAt(i)) {
				boolean rezult = true;
				System.out.println("true");
				return true;
			} else {
				System.out.println("false");
				return false;
			}
		}
		return true;

	}

}
