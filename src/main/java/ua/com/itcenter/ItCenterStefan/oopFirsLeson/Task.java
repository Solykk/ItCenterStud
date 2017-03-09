import java.util.ArrayList;
import java.util.Scanner;
public class Task {
	public static void main(String [] args){
		ArrayList <Integer> list = new ArrayList<>();
		fill(list);
		System.out.println(list);
		filter(list);
		System.out.println(list);
	}
	public static void fill( ArrayList <Integer> list){
		Scanner key = new Scanner(System.in);
		for (int i = 0; i < 10; i++ ){
			int tr = key.nextInt();
			list.add(tr);
		}
		
		
	}
	public static void filter(ArrayList <Integer> list){
			for(int i = 0; i < list.size(); i++ ){
			int yu = list.get(i);
			if(yu < 5){
			list.remove(i);// удаляет элемент и (смещается массив)-
			i--;// если удаляет возвращается на 1 элемнт и
			}
			
		}
		
	}
}
