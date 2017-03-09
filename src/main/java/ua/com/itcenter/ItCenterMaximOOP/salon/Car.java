package salon;

public class Car {
	
	private String numberOfCar;
	private String colorOfCar;
	private Track track;
	private int stateOfCar = 0;
	
	public Car(String numberOfCar, String colorOfCar, Track track){
		this.setNumberOfCar(numberOfCar);
		this.setColorOfCar(colorOfCar);
		this.setTrack(track);
	}
	
	public String getNumberOfCar() {
		return numberOfCar;
	}

	public void setNumberOfCar(String numberOfCar) {
		this.numberOfCar = numberOfCar;
	}

	public String getColorOfCar() {
		return colorOfCar;
	}

	public void setColorOfCar(String colorOfCar) {
		this.colorOfCar = colorOfCar;
	}
	
	public void printAboutCar(){
		System.out.println("������ � ������� " + this.numberOfCar + " " + "���� " + this.colorOfCar);
	}

	public Track getTrack() {
		return track;
	}

	public void setTrack(Track track) {
		if(this.track == null){
		this.track = track;
		} else if(this.track != null){
			this.track = track;
		}
		
	

	}
	
	public void start(){
		
		if(this.stateOfCar == 0){
			System.out.println("������ � ������� " + this.numberOfCar + " ��������");
			System.out.println();
			this.stateOfCar = 1; 
		} else {
			System.out.println("������ � ������� " + this.numberOfCar + " ��� ��������");
			System.out.println();
		}
	}
	
	public void move(){
		if(this.getTrack() == null ){
			if(this.stateOfCar == 1){
				
				System.out.println("������ � ������� " + this.numberOfCar + " �������");
				System.out.println();
					this.stateOfCar = 2;
					
			} else if (this.stateOfCar == 0){
			
				System.out.println("������ � ������� " + this.numberOfCar + " ��� �� ��������");	
				System.out.println();
				
			} else {
			
				System.out.println("������ � ������� " + this.numberOfCar + " ��� ���� ");
				System.out.println();
			}
		}
		
		else if(this.getTrack() != null){
			   if(this.stateOfCar == 1){
				   
				   System.out.println("������ � ������� " + this.numberOfCar + " �������");
						this.getTrack().rollTrack();
						this.stateOfCar = 2;
					
			   } else if (this.stateOfCar == 0){
				   
				   System.out.println("������ � ������� " + this.numberOfCar + " ��� �� ��������");	
				   System.out.println();
					
			   } else {
				   
				   System.out.println("������ � ������� " + this.numberOfCar + " ��� ���� ");
				   System.out.println();
			   }
		}
	}
	
	public void stop(){
		if(this.stateOfCar == 2){
			System.out.println("������ � ������� " + this.numberOfCar + " ������������");
			System.out.println();
			this.stateOfCar = 0;
			
		} else if(this.stateOfCar == 1){
			System.out.println("������ � ������� " + this.numberOfCar + " ��� �� ����");
			System.out.println();
		} else {
			System.out.println("������ � ������� " + this.numberOfCar + " ��� �����");
			System.out.println();
		}
	}
	
	public int getStateOfCar() {
		return this.stateOfCar;
	}
}
