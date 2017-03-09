package week1.lesson2;

public class MainCAr {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		/*car1.number = "AA 1111 HH";
		car2.number = "BB 1111 AH";
		car1.color = "Blue";
		car2.color = "Red";
		car3.number = "SS 7896 GU";
		car3.color = "White";
		car1.countHuman = 2;
		car2.countHuman = 3;
		car3.countHuman = 4;
		car1.AddHuman(2);
		car2.AddHuman(-1);
		car3.AddHuman(0);*/
			System.out.print("Car 1: ");
		car1.start();
			System.out.print("Car 2: ");
		car2.start();
			System.out.print("Car 3: ");
		car3.start();
		System.out.print("Car 1: ");
			car1.move();
		System.out.print("Car 2: ");
			car2.move();
		System.out.print("Car 1: ");
			car1.stop();
		System.out.print("Car 2: ");
			car2.stop();
		System.out.print("Car 3: ");
			car3.stop();
		
		//car1.printAboutMe();
		//car2.printAboutMe();
		//car3.printAboutMe();
	}
}
