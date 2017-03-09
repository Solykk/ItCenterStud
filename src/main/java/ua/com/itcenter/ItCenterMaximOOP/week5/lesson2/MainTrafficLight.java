package week5.lesson2;



public class MainTrafficLight {
	public static void main(String[] args) {
		TrafficLight w = new TrafficLight(null);
		for(int i = 0; i < 20; i++){
		w.getNextColor();
		System.out.println(w.getNow().toString());
		  try {
			   Thread.sleep(1500);
			  } catch (Exception e) {
			   e.printStackTrace();
			  }
		}
	}
}
