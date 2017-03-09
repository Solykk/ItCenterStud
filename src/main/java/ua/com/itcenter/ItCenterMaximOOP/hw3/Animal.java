package hw3;

public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printName(){
		System.out.println(this.getName());
		System.out.println();
	}

	public Animal(String name) {
		
		this.name = name;
	}
	
	public static void main(String[] args) {
		Animal cat1 = new Cat("MUHTAR");
		Animal cat2 = new Cat("Valera");
	cat1.printName();;
	((Cat) cat1).eat();
	((Cat) cat1).say();
	((Cat) cat1).riseHair();
	((Cat) cat1).yellIfNotGorged();
	
	cat2.printName();;
	((Cat) cat2).eat();
	((Cat) cat2).say();
	((Cat) cat2).riseHair();
	((Cat) cat2).yellIfNotGorged();
	
	}
}	
	
	class Cat extends Animal{

		public Cat(String name) {
			super(name);
			
		}
			
	public  void say(){	
		System.out.println(this.getName() + " Cat is say ");
		System.out.println();
	}
	
	public void riseHair(){
		System.out.println(this.getName() + " Cat is riseHair ");
		System.out.println();
	}
	
	public void eat(){
		System.out.println(this.getName() + " Cat is eat ");
		System.out.println();
		
	}
		
	public void yellIfNotGorged(){
		System.out.println(this.getName() + " Cat is not gorged ");
		System.out.println();
	}
	
	
}
