package week7.lesson1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

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
public class Server extends Thread implements Runnable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 ArrayList<String> masseg  = new ArrayList<String>();
	
	public  void serverScanAndPrint() throws  IOException, ClassNotFoundException{
		File f = new File("d://Server/");
		File[] files = f.listFiles();
		
		for(int i = 0; i < files.length; i++){
			
		if(files[i].toString().endsWith(".cht")){
			FileInputStream fis = new FileInputStream(files[i]);
			 ObjectInputStream oin = new ObjectInputStream(fis);
				   try {
				    masseg.add( (String) oin.readObject());
				    				    
				   } finally {
				    oin.close();
				   }
			}
		}
		
		for(String c: masseg){
			System.out.println(c);
		}
	}
	
	
	@Override
	public void run() {
		while(true){
		try {
			serverScanAndPrint();
			sleep(5000);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	
	}	
	
}
