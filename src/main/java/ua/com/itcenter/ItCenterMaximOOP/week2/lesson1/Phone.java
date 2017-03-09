package week2.lesson1;



public class Phone {
	static Phone[] phones = new Phone[10];
	String myNumber;
	String marka;
	int tor;
	
	
	public void numberOfPhone(String myNumber){
		this.myNumber = myNumber;
	}
	
	public String getOfPhone(){
		return myNumber;
	}
	
	public void setMarka(String marka){//принимает(задает) значение
		this.marka = marka;
	}	
	
	public String getMarka(){ //возвращает значение
		return marka;
	}
	
	public  void addNumbers(String num){
		for(int i = 0; i < phones.length; i++){
			if(phones[i] == null){
					phones[i] = this;
					return;
				} 
			
		}
	}
	
	public void getNumbers(){
		return; 
	}
	
	public void isNumberExist(String number){
		for(int i = 0; i < phones.length; i++){
			if(number.equals(phones[i]) == true){
				System.out.println("This number in phonebook");
				return;
			} else {
				System.out.println("This number not found in phonebook");
				return;
			}
		}
	}
	
	public void call(String number){
		System.out.println("Phone " + marka + "  " + myNumber + " call to " + number);
		
	}
	
	public void getRandomPhone(){
		tor = (int)(Math.random()*10);
		System.out.println(phones[tor]);
	}
	
	public void printAboutMe(){
		System.out.println(myNumber);
		System.out.println(marka);
		System.out.println(phones[0].toString());
	}
}
