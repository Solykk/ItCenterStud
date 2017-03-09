package week6.lesson2;

import java.util.Date;
import java.util.Scanner;

public class Task1 extends Thread{
	String name;
	
	@ Override
	public void run(){
		
		
		while(true){
			if(isInterrupted()){
				return;
			}
			System.out.println(new Date());
			
 			try {
				
				sleep(2000);
				
			} catch (InterruptedException e) {
				
				
				interrupted();
				break;
				
			}	
		}
	}
	
	public static void main(String[] args){ 
	
		Task1 we = new Task1("Potok");
		we.start();
		 
		
	}

	public Task1(String name) {
		
		this.name = name;
	}
}
