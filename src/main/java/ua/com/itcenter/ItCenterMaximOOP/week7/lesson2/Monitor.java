package week7.lesson2;

public class Monitor {
	
	private static String nameFile1;
	private static String nameFile2;
	
	public static String getNameFile1() {
		return nameFile1;
	}
	public void setNameFile1(String nameFile1) {
		this.nameFile1 = nameFile1;
	}
	public static String getNameFile2() {
		return nameFile2;
	}
	public void setNameFile2(String nameFile2) {
		this.nameFile2 = nameFile2;
	}
	public Monitor(String nameFile1, String nameFile2) {
		super();
		this.nameFile1 = nameFile1;
		this.nameFile2 = nameFile2;
	}
	
	public static void main(String[] args) {
		ThreadCreator cre = new ThreadCreator();
		ThreadWriter rwi = new ThreadWriter();
		cre.start();
		rwi.start();
		
		
		Monitor mon = new Monitor(getNameFile1(),getNameFile2());
		
		
	}
	
}
