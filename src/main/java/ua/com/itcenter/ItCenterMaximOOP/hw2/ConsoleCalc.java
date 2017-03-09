package hw2;
/*�������� ����������� (����� hw2.ConsoleCalc) � ���� ����������� ����
- �������� ���� �����
- ��������� ���� �����
- ��������� ���� �����
- ������� ���� �����*/
import java.util.Scanner;


public class ConsoleCalc {
	private static String[] operationNames = { "�������(+) - 1", 
											   "���������(-) - 2",
											   "���������(*) - 3",
											   "�������(/) - 4" };
	
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
			
			System.out.println("�������� ��������:");
			
			
			
			if(key.hasNextInt()) { 
				
		          k = key.nextInt(); 
		          if(k >= 5 || k <= 0 ){
						System.out.println("����� �������� ���!, �������� ��� ���");
						break;
					}
		          
		       } else {
		          System.out.println("�� ���������� ����");
		          break;
		       }
						
	
			System.out.println("������� ��� ����� ����� ������");
			
			int num1;
			if(key.hasNextInt()) { 
				
		          num1 = key.nextInt(); 
		       } else {
		          System.out.println("�� ����� �� ����� �����");
		          break;
		       }
			
			int num2;
			if(key.hasNextInt()) { 
		          num2 = key.nextInt(); 
		       } else {
		          System.out.println("�� ����� �� ����� �����");
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