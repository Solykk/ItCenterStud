package hw3;

public class Product {
	private String nameOfProduct;
	private double price;
	private int bar;
	private String storageLife;
	
	public String getName() {
		return nameOfProduct;
	}

	public void setName(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getBar() {
		return bar;
	}
	
	public void setBar(int bar) {
		this.bar = bar;
	}

	public String getStorageLife() {
		return storageLife;
	}

	public void setStorageLife(String storageLife) {
		this.storageLife = storageLife;
	}

		
	public Product(String nameOfProduct, double price, int bar, String storageLife) {
		super();
		this.nameOfProduct = nameOfProduct;
		this.price = price;
		this.bar = bar;
		this.storageLife = storageLife;
	}

	public void printPrice(){
		System.out.println(this.getPrice());
		System.out.println();
	}
	
	public void printStoragePeriod(){
		System.out.println(this.getStorageLife());
		System.out.println();
	}
	
	public void printBarAndPrice(){
		System.out.println("Fish " + this.getName() + " - " + this.getBar() + " : " + this.getPrice() + " EVRO");
		System.out.println();
	}
		
	
	public static void main(String[] args) {
		Product fish1 = new Fish("Some", 79.98, 235456,"before 20.12.2015");
		Product fish2 = new Fish("Seld", 15.90, 890338,"before 02.12.2015");
		
		fish1.getName();
		fish1.printPrice();
		fish1.getStorageLife();
		fish1.printBarAndPrice();
		fish1.printStoragePeriod();
		((Fish) fish1).swim();
		((Fish) fish1).cannibalism((Fish) fish2);
		
		fish2.getName();
		fish2.printPrice();
		fish2.getStorageLife();
		fish2.printBarAndPrice();
		fish2.printStoragePeriod();
		((Fish) fish2).swim();
		
	}

	
}	
	class Fish extends Product{
		
		public Fish(String nameOfProduct, double price, int bar, String storageLife) {
			super(nameOfProduct, price, bar, storageLife);
			
		}

		public void swim(){
			System.out.println( this.getName() + " swim");
			System.out.println();
		}
		
		public void cannibalism(Fish fish){
			System.out.println( this.getName() + " " +this.getBar() + " eat " + fish.getName() + " " + fish.getBar());
			System.out.println();
		}
	}
	

