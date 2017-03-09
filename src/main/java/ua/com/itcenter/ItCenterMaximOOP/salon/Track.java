package salon;

public class Track {
	
	private String numberOfTrack;
	private Car car;
	private int stateOfTrack = 0;
	
	public Track(String numberOfTrack, Car car){
		this.setNumberOfTrack(numberOfTrack);
		this.setCar(car);
	}

	public String getNumberOfTrack() {
		return numberOfTrack;
	}

	public void setNumberOfTrack(String numberOfTrack) {
		this.numberOfTrack = numberOfTrack;
	}
	
	public void printAboutTrack(){
		System.out.println("Прицеп с номером " + this.numberOfTrack);
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		if(this.car == null){
			this.car = car;
			}
		else if(this.car != null){
			this.car = car;
		}
		
   }
	
	public void rollTrack(){
		if(this.car.getStateOfCar() == 1){
			System.out.println("И прицеп с номером" + this.numberOfTrack + " поехал");
			System.out.println();
			this.stateOfTrack = 2; 
		} else {
			System.out.println("Прицеп с номером" + this.numberOfTrack + " уже едет или стоит ");
			System.out.println();
		}
	}
	
	public void stopTrack(){
		if(this.car.getStateOfCar() == 2){
			System.out.println("И прицеп с номером " + this.numberOfTrack + " остановилася");
			System.out.println();
			this.stateOfTrack = 0;
		} else {
			System.out.println("Прицеп с номером " + this.numberOfTrack + " уже стоит или еще не едет");
			System.out.println();
		}
	}
	
	public int getStateOfTrack() {
		return this.stateOfTrack;
	}
}
	
