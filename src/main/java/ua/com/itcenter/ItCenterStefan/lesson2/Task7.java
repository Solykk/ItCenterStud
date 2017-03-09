package lesson2;
import java.util.Scanner;
public class Task7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vvedite stroku");
		String str = scan.nextLine();
		System.out.println("Vi vveli: ");
		System.out.println(str);
		System.out.println("Vvedite stroku");
		String str1 = scan.nextLine();
		System.out.println("Vi vveli: " + str1);
		System.out.println(str1);
	}
}
