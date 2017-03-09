package week5.lesson2;

import java.util.Comparator;

public class ProductSortPrice implements Comparator<Product> {

	@Override
	public int compare(Product arg0, Product arg1) {
		
		return arg0.getPrice().compareTo(arg1.getPrice());
	}

}
