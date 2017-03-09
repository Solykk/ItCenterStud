package week2.lesson1;

public class Car {
	private String number;
	private String marka;
	
	public void setNumber(String number){ //принимает(задает) значение 
		this.number = number; 
	}
	public String getNumber(){//возвращает значение
		return number;
	}
	public void setMarka(String marka){//принимает(задает) значение
		this.marka = marka;
	}	
	public String getMarka(){ //возвращает значение
		return marka;
	}
	public void getCountObj(){// кол-во методов в классе
		
	}
	public void printAboutMe(){// выводит на экран 
		System.out.println(number);
		System.out.println(marka);
	}
	
}
