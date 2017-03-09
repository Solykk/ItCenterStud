package hw4week;

/*Написать собственную реализацию динамического массива MyArrayList,
содержащего целые числа. Реализовать следующие методы
- void add(int value)
- int get(int index)
- boolean set(int index, int value)
- boolean add(int index, int value)
- int indexOf(int value)
- int size()
- int remove(int index)*/

public class MyArrayList {

	private int[] MyMas;
	private int countElements;

	private int[] newMyArray;

	public MyArrayList() {
		MyMas = new int[0];
		countElements = 0;
	}

	public void add(int value) {

		if (countElements == MyMas.length) {
			newMyArray = new int[MyMas.length + 1];

			for (int i = 0; i < countElements; i++)
				newMyArray[i] = MyMas[i];
			MyMas = newMyArray;
		}
		
		MyMas[countElements] = value;
		countElements++;

	}

	public int get(int index) {

		if (MyMas.length != 0) {
			System.out.println("Element Whis Index - " + index + "  -  " + MyMas[index]);
			return MyMas[index];
		}

		else {
			System.out.println("У элемента с индексом " + index + " нет значения");
			return 0;
		}

	}

	public boolean set(int index, int value) {
		if (countElements > 0 && index < countElements) {
			MyMas[index] = value;
			return true;
		}

		else {

			return false;
		}

	}

	public boolean add(int index, int value) {
		
		if(index > countElements){
			newMyArray = new int[index + 1];
			for(int i = 0; i < MyMas.length; i++){
				newMyArray[i] = MyMas[i];
			}
			newMyArray[index] = value;
			MyMas = newMyArray;
			countElements = index + 1;
			return true;
			
		} else if(index < 0){
			System.out.println("Error");
			return false;
			
		} else if(index < countElements){
			newMyArray = new int[countElements + 1];
			countElements += 1;
			for(int i = 0; i < index; i++){
				newMyArray[i] = MyMas[i];
			}
			newMyArray[index] = value;
			for(int i = index + 1; i < countElements; i++){
				newMyArray[i] = MyMas[index++];
			}
			MyMas = newMyArray;
			return true;
		}
		
		else if(index == countElements){
			add(value);
			return true;
		}
		  else{
		
				return false;
		}
	}

	public int indexOf(int value) {
		int c = 0;
		for (int i = 0; i < MyMas.length; i++) {
			System.out.println("Element Of MAssyve  " + MyMas[i]);
			if (MyMas[i] == value) {
				c = i;

			}

		}

		if (c != MyMas.length) {
			System.out.println("Such ELement Is  = " + c);
		} else {
			System.out.println("No Such Element");
		}
		return c;
	}

	public int size() {

		if (countElements == 0) {
			System.out.println("Массив пустой ");
			return 0;
		} else {
			System.out.println(countElements + " - CountElements");
			return countElements;
		}

	}

	public int remove(int index) {
		
		int temp;
		
		if (index < countElements && index >= 0) {
			temp = MyMas[index];
			newMyArray = new int[countElements - 1];
			for (int i = 0; i < index; i++) {
				newMyArray[i] = MyMas[i];

			}
			countElements--;
			for (int i = index; i < newMyArray.length; i++) {

				newMyArray[index] = MyMas[++index];

			}

			MyMas = newMyArray;
			
		} else {
			 temp = 0;
			System.out.println("Error ");

		}

		return temp;
	}

	public void printMyMas() {
		for (int j = 0; j < countElements; j++) {
			System.out.print("<" + MyMas[j] + ">");
		}
		System.out.println();
		System.out.println(MyMas.length + " - Lengs "+ "   " + countElements + " - CountElements");
	}

	public static void main(String[] args) {
		MyArrayList d = new MyArrayList();
		MyArrayList c = new MyArrayList();
		d.printMyMas();
		d.size();
		d.printMyMas();
		d.printMyMas();
		d.add(5, 111111);
		d.printMyMas();
		d.add(8);
		d.printMyMas();
		d.get(0);
		d.printMyMas();
		d.size();
		d.add(6);
		d.printMyMas();
		d.get(1);
		d.printMyMas();
		d.size();
		d.printMyMas();
		d.add(355);
		d.printMyMas();
		d.get(2);
		d.size();
		d.printMyMas();
		d.add(78);
		d.get(3);
		d.size();
		d.printMyMas();
		d.remove(5);
		d.size();
		d.printMyMas();
		c.add(15, 987654);
		c.size();
		c.printMyMas();
		c.indexOf(987654);
		//d.indexOf(36);
		//d.indexOf(78);
		//d.indexOf(355);
		//d.indexOf(55);
		//d.printMyMas();
	/*	d.set(0, 159);
		d.printMyMas();
		d.remove(2);
		d.printMyMas();
		d.size();
		d.add(3609);
		d.size();
		d.printMyMas();
		d.remove(1);
		d.printMyMas();
		d.remove(4);
		d.printMyMas();
		d.add(4, 555);
		d.size();
		d.printMyMas();
		d.size();
		d.add(3, 242424);
		d.printMyMas();
		d.size();
		d.add(5, 111111);
		d.printMyMas();
		d.size();
		d.remove(1);
		d.printMyMas();
		d.size();
		d.remove(0);
		d.printMyMas();
		d.size();
		d.remove(2);
		d.printMyMas();
		d.size();
		d.add(0, 12);
		d.printMyMas();
		d.add(1, 1999);
		d.printMyMas();
		d.add(7, 45654);
		d.printMyMas();
		d.add(1, 555);
		d.printMyMas();
		d.remove(0);
		d.printMyMas();*/
	}
}
