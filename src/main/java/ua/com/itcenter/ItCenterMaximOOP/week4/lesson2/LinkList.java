package week4.lesson2;


/*Написать класс LinkList, содержащий элементы типа int, реалзизующем связанный список с классом элемента Node.
Для класса LinkList написать методы:

1. Замена значения элемента по индексу, метод void set(int index, int element)
2. Удаление элемента по индексу, метод void remove(int index)
3. Поиск элемента по значению, метод int indexOf(int element)
4. Поменять местами первый и последний элементы, метод void swapFirstLast()
5. Перестроить элементы в списке в обратном порядке, метод void revert()
6. Поменять местами наибольший и наименьший элементы, в случае если реализован интерфейс Comparable, метод void swapMaxMin()
7. Частично упорядочить элементы списка, в случае если реализован интерфейс Comparable, метод void sortPartial(int index)
8. Сравнение двух списков, метод boolean equals(LinkList list)
9. Сложение двух списков, метод LinkList concat(LinkList list)
10*. Отсортировать список, в случае если реализован интерфейс Comparable, метод void sort()
11*. Удалить повторяющиеся элементы из списка, в случае если реализован интерфейс Comparable, метод void removeDuplicates()*/
public class LinkList implements Comparable<Node>{
	
	
	class Node{
		Node nextElement;    
	    int data; 
	}
	
	
	 private Node firstElement;       
	 private Node lastElement;  
	 
	 
	 public void set(int index, int element){
		 
	 }
	 
	public  void remove(int index){
		
	}
	
	public int indexOf(int element){
		return 0;
	}
	
	public void swapFirstLast(){
		
	}
	
	public void revert(){
		
	}
	
	public void swapMaxMin(){
		
	}
	
	public void sortPartial(int index){
		
	}
	
	public boolean equals(LinkList list){
		return true;
	}
	
	public LinkList concat(LinkList list){
		return  list;
	}
	
	public void sort(){
		
	}
	
	public void removeDuplicates(){
		
	}
	
}


