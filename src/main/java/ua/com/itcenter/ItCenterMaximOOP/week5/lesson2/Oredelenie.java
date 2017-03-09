package week5.lesson2;

public class Oredelenie {
	
	public static boolean isExist(String s){
		MyColorEnum[] vector = MyColorEnum.values();
		boolean b = false;
		for(int i = 0; i < vector.length; i++){
			if(vector[i].toString().equals(s) == true){
				
				b = true;
				break;
			}
			else {
				
				b = false;
			}
		  }
		return b;
		
	}
	
	public static void main(String[] args) {
		String y = "Red";
		String c = "Black";
		String r = "Uio";
		System.out.println(isExist(y));
		System.out.println(isExist(c));
		System.out.println(isExist(r));
		
		
	}
}