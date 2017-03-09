package Conditions;

import java.util.ArrayList;
import java.util.Scanner;

public class BlockConditioners {
	private int indexOfConditioner;
	public ArrayList<Conditioner> cond = new ArrayList<Conditioner>();
	
	Conditioner con1 = new Conditioner(false);
	Conditioner con2 = new Conditioner(false);
	Conditioner con3 = new Conditioner(false);
	Conditioner con4 = new Conditioner(false);
	Conditioner con5 = new Conditioner(false);
	Conditioner con6 = new Conditioner(false);
	Conditioner con7 = new Conditioner(false);
	Conditioner con8 = new Conditioner(false);
	Conditioner con9 = new Conditioner(false);
	Conditioner con10 = new Conditioner(false);
	
	
	private String[] menuList = {"Отобразить состояние всех кондиционеров - 1",
			 "Включить кондиционер - 2",
			 "Выключить кондицинер - 3",
			 "Установить температуру для кондиционера - 4",
			 "Выход - 5"}; 
	
	public  BlockConditioners(){
		
		cond.add(con1);
		cond.add(con2);
		cond.add(con3);
		cond.add(con4);
		cond.add(con5);
		cond.add(con6);
		cond.add(con7);
		cond.add(con8);
		cond.add(con9);
		cond.add(con10);
		
		
	}
	public void printBlockConditioners() {
		
		for (String consol : menuList)
			System.out.println(consol);
		
	}
	public void start(){
		
		Scanner key = new Scanner(System.in);
		boolean runWhile = true;
		int numberOfOperation;
		
		while (runWhile) {
			
			printBlockConditioners();
		
				System.out.println("Выберите операцию: ");
				numberOfOperation = key.nextInt();
				
				
				switch (numberOfOperation) {
				
				case 1:	numberAuto();
					    colorAuto();
					    createNewCar(numb, col);
										     break;
										     
				case 2:	printArrayListConditioners();
						indexOfConditioner();	
						
										     break;
										     
				case 3:printArrayListConditioners();
						indexOfConditioner();
										     break;
										     
				case 4:	printArrayListConditioners();
						indexOfConditioner();
										     break;
										     
				
				case 5: runWhile = false;
									         break;
				}
				
			}
		}
	
	public int indexOfConditioner(){
		
		Scanner oto = new Scanner(System.in);
		boolean runWhile2 = true;
				
		while (runWhile2){
			System.out.println("Введите индес кондиционера:");
			if(oto.hasNextInt()){
				indexOfConditioner = oto.nextInt();
					if (indexOfConditioner < 0 || indexOfConditioner >= cond.size()){
						System.out.println("Кондиционера с таким индексом не существует, попробуйте еще раз ");
						System.out.println();
							
					} else {
						
							break;
					}
			} else {
		          System.out.println("Не корректный ввод, начиная сначал!");
		          System.out.println();
		          break;
		      }
			
		}
		return indexOfConditioner;
	}
	
	public void printArrayListConditioners(){
		for ( int i = 0; i < cond.size(); i++){
			System.out.println(cond.get(i) + " - индекс " + i);
		}
		System.out.println();
	}
}
