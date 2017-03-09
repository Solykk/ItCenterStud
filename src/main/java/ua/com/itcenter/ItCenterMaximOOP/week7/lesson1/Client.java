package week7.lesson1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/*Task 4. Консольный чат с сериализацией. В главном методе запустить сервер и клиент.
Заранее определить папку, куда будут складываться файлы объектов.
Класс клиент:
 - с консоли считывает строку
 - полученную строку сериализует в отдельный файл с определенным именем и расширением ".cht".
Класс сервер: 
 - имеет в себе список строк. 
 - каждые 2 секунды сканирует заранее определенную папку и ищет "новые" файлы с расширением ".cht"
 - при нахождении "нового" файла добавляет в список новую строку.
 - после сканирования, если нашел "новый файл", то выводит весь список на экран.*/
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
