package week1.lesson2;

/*Task 4. Метод, который вставляет элемент внутрь списка и возвращает его.
insertElement(ArrayList<Integer> vector, int index, Integer element)*/
import java.util.ArrayList;

public class Task4 {
	public static void main(String[] args) {
		ArrayList<Integer> vector = new ArrayList<Integer>();
		insertElement(vector, 0, 8);
	}

	public static Integer insertElement(ArrayList<Integer> vector, int index, Integer element) {

		vector.add(index, element);
		System.out.println(element);
		return element;

	}

}
