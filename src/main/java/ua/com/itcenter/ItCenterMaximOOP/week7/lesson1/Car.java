package week7.lesson1;

import java.io.Serializable;

public class Car implements Cloneable,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Engine engi;
	private String nomber;
	
	public String getNomber() {
		return nomber;
	}
	public void setNomber(String nomber) {
		this.nomber = nomber;
	}
	public Engine getEngi() {
		return engi;
	}
	public void setEngi(Engine engi) {
		this.engi = engi;
	}
	public Car(Engine engi, String nomber) {
		super();
		this.engi = engi;
		this.nomber = nomber;
	}
	@Override
	public Car clone() throws CloneNotSupportedException{
		  Car car = (Car)super.clone();
		  car.setEngi(getEngi().clone());
		  return car;
		 }
	@Override
	public String toString() {
		return "Car [" + this.getEngi().toString() + ", " + this.getNomber() + "]";
	}
	
	
}
