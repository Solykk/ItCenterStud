package week6.lesson1;

public class Task4Exeptoins {

	public static void except(String c){
		
		
		try {
			Integer f = Integer.valueOf(c);
		}
		catch(Exception ex) {
			 throw new NullPointerException("Fuck you");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		String f = "15";
		String k = "jkf";
		
		except(k);
	}
}