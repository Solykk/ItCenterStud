package week6.lesson2;

public class Treadddd extends Thread{
	
	String name;
	
	
	public Treadddd(String name) {
		super();
		this.name = name;
	}


	@ Override
	public void run(){
		for(int i = 0; i < 1000 ; i++){
			System.out.println(this.name + i);
		}
	}

	public static void main(String[] args) {
		
		Treadddd q = new Treadddd("����� 1 ");
		Treadddd t = new Treadddd("\t����� 2 ");
		Treadddd y = new Treadddd("\t\t����� 3 ");
		
		q.start();
		t.start();
		y.start();
		System.out.println("ENDDDDDDDDDDDdd");
	}
	
	
}
