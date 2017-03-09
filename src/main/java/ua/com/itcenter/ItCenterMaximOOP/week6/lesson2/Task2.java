package week6.lesson2;



public class Task2 extends Thread{
	
	long number;
	
	@ Override
	public void run(){
		
		
		try {
			
			this.join();
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}		
	}

	


	public Task2() {
		this.number = this.hashCode();
	}

	public static void main(String[] args) {
		Task2[] uu = new Task2[100];
		for(int i = 0; i < 100; i++){
			uu[i] = new Task2();
			System.out.println(i + "   " + uu[i].hashCode());
		}
		
		for(int i = 0; i < uu.length; i++){
			uu[i].start();
		}
	}
	
}
