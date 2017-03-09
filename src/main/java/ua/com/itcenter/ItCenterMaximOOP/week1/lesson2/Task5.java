package week1.lesson2;
/*Task 5. Метод, который ищет элемент в списке и возвращает кол-во этих элементов.
getCountElementByArrayList(ArrayList<Integer> vector, Integer element)*/

import java.util.ArrayList;

public class Task5 {
	public static void main(String[] args) {
		ArrayList<Integer> vector = new ArrayList<Integer>();
			int k = 0;
		for(int i = 0; i < 10; i++){
			k = (int)(Math.random() * 10);
			vector.add(k);
		}
			System.out.println(vector);
			
		getCountElementByArrayList(vector, 8);
	}

	public static void getCountElementByArrayList(ArrayList<Integer> vector, Integer element){
		int countElement = 0;
		
			for(int i = 0; i < vector.size(); i++){
				if(vector.get(i) == element){
					countElement++;
				}
			}
			System.out.println(countElement);
		return;

	}

}


