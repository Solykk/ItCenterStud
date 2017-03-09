package week2.lesson1;

public class MainMobilePhone {
	public static void main(String[] args) {
		
		MobilePhone phone1 = new MobilePhone("0937042674", "SUMSUNG Mega 5.8");
		MobilePhone phone2 = new MobilePhone("0937042675", "SUMSUNG Aro 4.3");
		MobilePhone phone3 = new MobilePhone("0937042673", "LG Beta 4.0");
		MobilePhone phone4 = new MobilePhone("0508125780", "NOKIA 52/10");
		
		phone1.printAboutMy();
		phone2.printAboutMy();
		phone3.printAboutMy();
		phone4.printAboutMy();
		
		phone1.call("0937942675");
	}
}
