package week1.lesson2;
/*Task 3. Метод, который выводит список на экран. 
Формат вывода:
[0] = 10
[1] = 20
[2] = 30*/

import java.util.ArrayList;

public class Task3 {
	public static void main(String[] args) {

		randVall();
		printVall();
	}

	public static void randVall() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int k = 0;
		for (int i = 0; i < 100; i++) {
			k = (int) (Math.random() * 100);
			list.add(k);
		}
		System.out.print(list);
	}

	public static void printVall() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int k = 0;
		for (int i = 0; i < 100; i++) {
			k = (int) (Math.random() * 100);
			list.add(k);
		}
		int c = 0;
		for (int i = 0; i < list.size(); i++) {
			c = list.get(i);
			System.out.println("[" + i + "]" + " = " + c);
		}
	}
}