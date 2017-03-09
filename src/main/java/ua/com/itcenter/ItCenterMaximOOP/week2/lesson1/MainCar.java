package week2.lesson1;

public class MainCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setNumber("HJ 1111 IO");//задаем значение
		car2.setNumber("TY 4568 NM");//задаем значение
		
		car1.setMarka("Opel");//задаем значение
		car2.setMarka("Lotus");//задаем значение
		
		car1.printAboutMe();
		car2.printAboutMe();
	}
}
