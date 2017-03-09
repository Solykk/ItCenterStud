package lesson3;
import java.util.Scanner;
public class Task7 {
	public static void main(String[] args){
		int [] array = new int [100];
		Scanner key = new Scanner(System.in);
		int idx = 0;
		array [idx] = (int)(Math.random() * 100);
		System.out.println("Угадайте число от 0 до 100");
		System.out.println("Вводите свое число");
		int c = 0;
		while (c < 1000){
		int val = key.nextInt();
		if (val < 0 || val > 100){
			System.out.println("Ошибка, введено не корректное число");
			System.out.println("Попробуйте еща раз");
		} else if (val > array[idx]){
			System.out.println("Подсказка:");
			System.out.println("Введенное число больше, чем загаданное");
			System.out.println("Попробуйте еща раз");
		} else if (val < array[idx]){
			System.out.println("Подсказка:");
			System.out.println("Введенное число меньше, чем загаданное");
			System.out.println("Попробуйте еща раз");
			c++;
		} else if (val == array[idx]){
			System.out.println("Подравляю, Вы угадали");
		}
      }
    }
}

					
	


	
		
	

