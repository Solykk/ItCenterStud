package week2.lesson2;

public class Car {
	String number;
	String color;
	int countHuman;
	
	private Track track;
	
	int state = 0;
	
	public void setTrack(Track track){
		
		if(this.track == null){
			this.track = track;
			
		System.out.println("������ �����������");
		} else {
			System.out.println("��� ���� ������");
		}
		
	}
	public void unSetTrack(){
		
		 track = null;
		 System.out.println("������ ����������");
	
		 
	}	
	public void start(){
		
		if(state == 0){
			System.out.println("������ ��������");
			state = 1; 
		} else {
			System.out.println(" ��� �������� ");
		}
	}
	public void move(){
		if(state == 1){
			System.out.println("������ �������");
			state = 2; 
		} else {
			System.out.println(" ��� ���� ");
		}
	}
	public void stop(){
		if(state == 2){
			System.out.println("������ ������������");
			state = 0;
		} else {
			System.out.println(" ��� ����� ");
		}
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
	
}
