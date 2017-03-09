package week5.lesson2;


import java.util.Date;
import java.util.GregorianCalendar;

public class Product implements Comparable<Product>{
	
	private String name;
	private int price;
	private Date date = new Date();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	

	@Override
	public int compareTo(Product arg0) {
		return this.name.compareTo(arg0.getName());
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product(String name, int price, GregorianCalendar date) {
		date = new GregorianCalendar();
		this.name = name;
		this.price = price;
		this.date = date.getTime();
	}

	@Override
	public String toString() {
		return "\n" + "Продукт [Название = " + name + ", Цена = " + price + ", Дата закупки = " + date + "]";
	}
	
	
	
	
	
}