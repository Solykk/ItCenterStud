package lesson3;
import java.util.Scanner;
public class Task7 {
	public static void main(String[] args){
		int [] array = new int [100];
		Scanner key = new Scanner(System.in);
		int idx = 0;
		array [idx] = (int)(Math.random() * 100);
		System.out.println("�������� ����� �� 0 �� 100");
		System.out.println("������� ���� �����");
		int c = 0;
		while (c < 1000){
		int val = key.nextInt();
		if (val < 0 || val > 100){
			System.out.println("������, ������� �� ���������� �����");
			System.out.println("���������� ��� ���");
		} else if (val > array[idx]){
			System.out.println("���������:");
			System.out.println("��������� ����� ������, ��� ����������");
			System.out.println("���������� ��� ���");
		} else if (val < array[idx]){
			System.out.println("���������:");
			System.out.println("��������� ����� ������, ��� ����������");
			System.out.println("���������� ��� ���");
			c++;
		} else if (val == array[idx]){
			System.out.println("���������, �� �������");
		}
      }
    }
}

					
	


	
		
	

