package week1.lesson2;

/*Task 2. Написать метод заполнения списка случайными целыми числами от 0 до 100.
Метод принимает список и кол-во элементов.*/
import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args) {

		randVall();
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
}