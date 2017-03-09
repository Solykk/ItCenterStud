package week5.lesson2;

import java.util.ArrayList;
import java.util.Arrays;

public class MainProduct {
	public static void main(String[] args) {
		ArrayList<Product> pro = new ArrayList<Product>();
		
		Product fish = new Product("Fihs", 100, null);
		Product tea = new Product("Tea", 80, null);
		Product cheas = new Product("Cheas", 120, null);
		Product milk = new Product("Milk", 50, null);
		Product rice = new Product("Rise", 40, null);
		
		pro.add(rice);
		pro.add(cheas);
		pro.add(tea);
		pro.add(milk);
		pro.add(fish);
		pro.add(fish);
		for(Product g  : pro ){
			System.out.println(g.toString());
		}
		
		
	}
}
