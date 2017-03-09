package week2.lesson1;

public class MainPhone {
	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		
		phone1.numberOfPhone("0985673412");
		phone1.setMarka("Sumsung");
		
		phone1.addNumbers("0985674564");
				
		phone1.call("0500555890");
		phone1.getRandomPhone();
		
		phone1.isNumberExist("0985674564");
		
		phone1.printAboutMe();
		
	}
}
