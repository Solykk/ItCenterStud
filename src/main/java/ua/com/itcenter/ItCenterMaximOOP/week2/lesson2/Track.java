package week2.lesson2;

public class Track {
	String number;
	int state = 0;
	private Car car;
	public Track(){
		number = "default";
	}
	public Track(String number){
		this.number = number;
	}
	
	
	public void roll(){
		if(state == 0){
			System.out.println("������� ");
			state = 1; 
		} else {
			System.out.println("��� ������� ");
		}
	}
	public void stop(){
		if(state == 1){
			System.out.println("����������� ");
			state = 2; 
		} else {
			System.out.println("��� ����� ");
		}
	}
	public void printAboutMe(){
		System.out.println(number);
		
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
	public Car getCar() {
		return car;
	}

}
