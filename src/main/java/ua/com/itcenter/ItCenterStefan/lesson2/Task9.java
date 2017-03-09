package lesson2;
import java.util.Scanner;
public class Task9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("введите первое число:");
			int vall = scan.nextInt();
			System.out.println("введите второе число:");
			int vall2 = scan.nextInt();
			int res = vall + vall2;
			System.out.println("результат = " + res);
	}
	
}
