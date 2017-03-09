package week1.lesson1;
/*Task6. Написать метод int MyIndexOf, который принимает две строки.(не используя indexOf)*/
public class Task6 {
	public static void main(String[] args) {
		String first  = "ghfjytjhfjks";
		String second = "fj";
		String third = "jdjdjdjkjdkjkjdkjkjd";
		myIndexOf(first, second);
		
	}
	public static int myIndexOf(String first, String second){
		
		if(second.length() > first.length()){
			throw new IndexOutOfBoundsException("fuck you");
	 	}
			
		char [] sec = new char[second.length()];
			for(int i = 0; i < second.length(); i++){
				sec[i] = second.charAt(i);
			}
		char [] fir = new char[first.length()];
			for(int i = 0; i < first.length(); i++){
				fir[i] = first.charAt(i);
			}
		
			
	return 0;	
	}
}
