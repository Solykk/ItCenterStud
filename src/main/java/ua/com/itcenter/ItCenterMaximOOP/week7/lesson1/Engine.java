package week7.lesson1;

import java.io.Serializable;

public class Engine implements Cloneable,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomber;

	public String getNomber() {
		return nomber;
	}

	public void setNomber(String nomber) {
		this.nomber = nomber;
	}

	public Engine(String nomber) {
		super();
		this.nomber = nomber;
	}
	
	@Override
	public Engine clone() throws CloneNotSupportedException{
		  Engine engi = (Engine)super.clone();
		  return engi;
		 }

	@Override
	public String toString() {
		return "Engine [" + nomber + "]";
	}
	
	
}
