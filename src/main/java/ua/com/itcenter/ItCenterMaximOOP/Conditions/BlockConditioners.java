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
	
	
	private String[] menuList = {"���������� ��������� ���� ������������� - 1",
			 "�������� ����������� - 2",
			 "��������� ���������� - 3",
			 "���������� ����������� ��� ������������ - 4",
			 "����� - 5"}; 
	
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
		
				System.out.println("�������� ��������: ");
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
			System.out.println("������� ����� ������������:");
			if(oto.hasNextInt()){
				indexOfConditioner = oto.nextInt();
					if (indexOfConditioner < 0 || indexOfConditioner >= cond.size()){
						System.out.println("������������ � ����� �������� �� ����������, ���������� ��� ��� ");
						System.out.println();
							
					} else {
						
							break;
					}
			} else {
		          System.out.println("�� ���������� ����, ������� ������!");
		          System.out.println();
		          break;
		      }
			
		}
		return indexOfConditioner;
	}
	
	public void printArrayListConditioners(){
		for ( int i = 0; i < cond.size(); i++){
			System.out.println(cond.get(i) + " - ������ " + i);
		}
		System.out.println();
	}
}
