package lesson2;
import java.util.Scanner;
public class Task11 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("1 - Сложить");
		System.out.println("2 - Вычесть");
		System.out.println("3 - Поделить");
		System.out.println("4 - Умножить");
		int choice = scan.nextInt();
		if(choice > 0 && choice < 5){
		System.out.println("введите первое число");
		int val = scan.nextInt();
		System.out.println("введите второе число");
		int val2 = scan.nextInt();
		if(choice == 1){
			System.out.println(val + "+" + val2 + " = " + (val + val2));
		}		else if(choice == 2){
			System.out.println(val + "-" + val2 + " = " + (val - val2));
		}		else if(choice == 3){
			System.out.println(val + "/" + val2 + " = " + (val / val2));
		}		else if(choice == 4){
			System.out.println(val + "*" + val2 + " = " + (val * val2));
		}	}	else{
			System.out.println("не верно");
		}
		}
	}


