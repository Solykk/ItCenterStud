package week1.lesson2;

public class Car {
	String number;
	String color;
	int countHuman;
	boolean start = true;
	boolean move = true;
	boolean stop = true;
	public void start(){
		start = true;
		System.out.println(" завелась! ");
	}
	public void move(){
		move = true;
		System.out.println(" поехала! ");
	}
	public void stop(){
		stop = true;
		System.out.println(" остановилась! ");
	}
	public void printAboutMe(){
		System.out.println(number);
		System.out.println(color);
		System.out.println(countHuman);
	}
	public Car(){
		number = "default";
	}
	public Car(String number){
		this.number = number;
	}
	public Car(String number, String color){
		this.number = number;
		this.color = color;
		countHuman = 0;
	}
	public void AddHuman(int count){
		countHuman += count;
	}
	public void state(boolean v){
		
	}
}
