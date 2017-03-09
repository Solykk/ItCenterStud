package week1.lesson2;
/*Пользователь вводит число. Считать в виде строки. Определить сумму цифр числа.
Считывание строки выполнить в методе main.
Написать метод определения суммы и результат вывести на экран.
public boolean calcDigitsCount(String number)
Пример:
calcDigitsCount("131")
5*/
import java.util.Scanner;
public class HomeWork1 {
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		String number = key.nextLine();
		calcDigitsCount(number);
		
	}
	public static int calcDigitsCount(String number){
		int rezalt =  0;
		int r = new Integer(number);
		
			System.out.println(r);
				while(r != 0){
					
					rezalt = rezalt +  (r % 10) ;
					r = (r / 10);
					
				}
				System.out.println(rezalt);
			/*for(int i = 0; i < number.length(); i++){
				rezalt = Integer.parseInt(number);
			}
			System.out.println(rezalt);
			int rtyu = Integer.valueOf(number).intValue();
			System.out.println(rtyu);*/
		return rezalt;
		
	}
}
