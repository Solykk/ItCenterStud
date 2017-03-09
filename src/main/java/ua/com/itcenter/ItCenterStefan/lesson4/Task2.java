package lesson4;
import java.util.ArrayList;//import java.util.*;
public class Task2 {
	public static void main(String [] args){
		int[] arr = new int[10];// Collections Framework(Frray list)
		
		ArrayList list = new ArrayList();
		list.add(13);
		list.add(15);
		list.add("test");
		list.add(2.51);
		System.out.println(list);
		System.out.println(list.size());
		list.add(1, "test01");
		System.out.println(list);
		System.out.println(list.size());
		Object obj = list.get(1);
		System.out.println(obj);
		list.set(2, "Change");
		System.out.println(list);
		System.out.println(list.size());
		Object val = list.set(2, "Change");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(val);
		list.remove(0);
		list.remove("Change");
		System.out.println(list);
		System.out.println(list.size());
		
		//int value = list.get(5);
		ArrayList <Integer> collection = new ArrayList<Integer>();
		collection.add(34);
		collection.add(24);
		collection.add(54);
		collection.add(354);
		list.addAll(collection);
		list.addAll(2, collection);
		System.out.println(list);
		
		ArrayList find = new ArrayList();
		find.add(24);
		find.add(356);
		System.out.println("Cont: " + list.containsAll(find));
		
		ArrayList <Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		
		Object[] ints2 = ints.toArray();
		
		
		ArrayList <Integer> tot = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
		tot.add((int)(Math.random() * 10));
			}
		System.out.print(tot);
		int count;
		count = 0;
		for (int i = 0; i < tot.size(); i++){
			int t = tot.get(i) % 2;
			if( t != 0){
			count++;
		 }
	}
		System.out.println(count);
		
	
	ArrayList <Integer> pop = new ArrayList<Integer>();
	for(int i = 0; i < 10; i++){
	pop.add((int)(Math.random() * 10));
		}
	System.out.println(pop);
	
	for (int i = 0; i < pop.size(); i++){
		
		if( pop.get(i) % 2 != 0){
			pop.remove(i--);
		
	 }
} 
	
	System.out.println(pop);
	int t = pop.get(0);
		for (int i = 0; i < pop.size(); i++){
			if(pop.get(i) == t){
				pop.remove(i);
			}
		}
	System.out.println(pop);
}	
	
}

