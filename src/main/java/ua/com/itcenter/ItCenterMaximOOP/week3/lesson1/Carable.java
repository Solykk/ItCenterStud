package week3.lesson1;

public interface Carable {
	public void start();
	public void move();
	public default void print(){
		System.out.println("Hello!");
	}
}
