package hw2;
/*Написать калькулятор (класс hw2.ConsoleCalc) в виде консольного меню
- сложение двух чисел
- вычитание двух чисел
- умножение двух чисел
- деление двух чисел*/
import java.util.Scanner;


public class ConsoleCalc {
	private static String[] operationNames = { "Сложени(+) - 1", 
											   "Вычитание(-) - 2",
											   "Умножение(*) - 3",
											   "Деление(/) - 4" };
	
	public static void printMenu() {
		for (String e : operationNames)
			System.out.println(e);
	}
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		
		boolean runWhile = true;
		int k;
		while (runWhile) {
			
			printMenu();
			
			System.out.println("Выберите операцию:");
			
			
			
			if(key.hasNextInt()) { 
				
		          k = key.nextInt(); 
		          if(k >= 5 || k <= 0 ){
						System.out.println("Такой операции НЕТ!, Попробуй еще раз");
						break;
					}
		          
		       } else {
		          System.out.println("Не корректный ввод");
		          break;
		       }
						
	
			System.out.println("Введите два числа через пробел");
			
			int num1;
			if(key.hasNextInt()) { 
				
		          num1 = key.nextInt(); 
		       } else {
		          System.out.println("Вы ввели не целое число");
		          break;
		       }
			
			int num2;
			if(key.hasNextInt()) { 
		          num2 = key.nextInt(); 
		       } else {
		          System.out.println("Вы ввели не целое число");
		          break;
		       }
		
		
		
			switch (k) {
			
			case 1:
				
				summa( num1,  num2);
				break;
			case 2:
				
				razn( num1,  num2);
				break;
			case 3:
				
				 umnojet( num1, num2);
				break;
			case 4:
				
				delenie( num1,  num2);
				break;
			}
		
		}
		
				
	
	}
	
	private static int rezult;
	
	
	
	public static int summa(int num1, int num2){
		rezult = num1 + num2;
		System.out.println(rezult);
		return rezult;
	}
	public static int razn(int num1, int num2){
		rezult = num1 - num2;
		System.out.println(rezult);
		return rezult;
	}
	public static int umnojet(int num1, int num2){
		rezult = num1 * num2;
		System.out.println(rezult);
		return rezult;
	}
	public static int delenie(int num1, int num2){
		rezult = num1 / num2;
		System.out.println(rezult);
		return rezult;
	}
	
}