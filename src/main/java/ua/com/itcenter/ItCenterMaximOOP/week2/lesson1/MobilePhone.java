package week2.lesson1;

public class MobilePhone {
	
	static MobilePhone[] phones = new MobilePhone[10];
	String myNumber;
	String marka;
	
	public MobilePhone(String myNumber, String marka){
		this.myNumber = myNumber;
		this.marka = marka;
			for(int i = 0; i < phones.length; i++){
				if(phones[i] == null){
					phones[i] = this;
					return;
				}
				
			}
	}
	
	public String getMyNumber(){
		return this.myNumber;
	}
	
	public String getMarka(){
		return this.marka;
	}
	
	public void call(String number){
		System.out.println("Phone " + this.marka + "  " + this.myNumber + " call to " + number + " " + marka );
		
	}
	
	public void printAboutMy(){
		System.out.print(myNumber + " ");
		System.out.println(marka);
	}
	
}
