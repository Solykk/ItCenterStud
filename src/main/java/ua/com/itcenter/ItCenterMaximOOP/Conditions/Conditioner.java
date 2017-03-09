package Conditions;



public class Conditioner {
	
	private int temperature;
	private boolean state; 
	
	
	public Conditioner(boolean state){
		this.state = state;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public boolean turnOn(boolean state){
		return state; 
	}
	
	public boolean tornOff(boolean state){
		return state;
	}

}
