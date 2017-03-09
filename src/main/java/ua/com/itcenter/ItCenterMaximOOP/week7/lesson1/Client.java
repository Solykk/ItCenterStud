package week7.lesson1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/*Task 4. ���������� ��� � �������������. � ������� ������ ��������� ������ � ������.
������� ���������� �����, ���� ����� ������������ ����� ��������.
����� ������:
 - � ������� ��������� ������
 - ���������� ������ ����������� � ��������� ���� � ������������ ������ � ����������� ".cht".
����� ������: 
 - ����� � ���� ������ �����. 
 - ������ 2 ������� ��������� ������� ������������ ����� � ���� "�����" ����� � ����������� ".cht"
 - ��� ���������� "������" ����� ��������� � ������ ����� ������.
 - ����� ������������, ���� ����� "����� ����", �� ������� ���� ������ �� �����.*/
public class Client extends Thread implements Runnable,Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void clientScanAndSurr() throws IOException{
		Scanner key = new Scanner(System.in);
		while(true){
		String g = key.nextLine();
		int e = (int)(Math.random() * 10000);
		String ee = String.valueOf(e);
		FileOutputStream fos = new FileOutputStream("D:\\Server/" + ee + ".cht");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		   try {
		    oos.writeObject(g);
		   } 
		   finally {
		    oos.close();
		   }
		}
		
	}
	
	@Override
	public void run() {
		
			try {
				clientScanAndSurr();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	
}
