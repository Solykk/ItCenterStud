package hWPhonesWeek3.lesson2;

import java.util.ArrayList;
import java.util.Scanner;


public class MainPhone {
	private int indexOfPhone;
	
	
	public static void main(String[] args) {
		
		 ArrayList<Phone> phones = new ArrayList<Phone>();
		 
		 
		 Phone p1 = new Nokia("093 704 26 74", false, 5);
		 Phone p2 = new Nokia("095 774 06 56", true, 6);
		 
		 Phone p3 = new Samsung("097 767 86 00", true, 6);
		 Phone p4 = new Samsung("066 674 36 12", false, 3);
		 
		 IPhone p5 = new IPhone4("037 700 46 00", true, 4, 1567);
		 IPhone p6 = new IPhone4("067 444 67 12", true, 4, 1909);
		 
		 IPhone p7 = new IPhone5("047 660 99 10", true, 5, 1789);
		 IPhone p8 = new IPhone5("097 777 54 32", true, 5, 1222);
		 
		 phones.add(p1);
		 phones.add(p2);
		 phones.add(p3);
		 phones.add(p4);
		 
		 phones.add(p5);
		 phones.add(p6);
		 phones.add(p7);
		 phones.add(p8);
		 
		 phones.get(0).printModel();
		 
		 	 		 
	}


	public int getIndexOfPhone() {
		return indexOfPhone;
	}


	public void setIndexOfPhone(int indexOfPhone) {
		this.indexOfPhone = indexOfPhone;
	}
	
	public int indexOfPhone(){
		
		Scanner oto = new Scanner(System.in);
		boolean runWhile2 = true;
				
		while (runWhile2){
			System.out.println("Введите индес телефона:");
			if(oto.hasNextInt()){
				indexOfPhone = oto.nextInt();
					if (indexOfPhone < 0 || indexOfPhone >= phones.size()){
						System.out.println("Телефона с таким индексом не существует, попробуйте еще раз ");
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
		return indexOfPhone;
	}
	
}
