package week2.lesson2;

public class MainTrach {
	public static void main(String[] args) {
		Track track1 = new Track();
		Track track2 = new Track();
		
		track2.number = "134526";
		track1.number = "763892";
		
		track1.printAboutMe();
		track2.printAboutMe();
		
	System.out.print("Прицеп с номером  " + track1.number + " ");
		track1.roll();
		
	System.out.print("Прицеп с номером  " + track1.number + " ");	
		track1.roll();
		
	System.out.print("Прицеп с номером  " + track1.number + " ");
		track1.stop();
		
	System.out.print("Прицеп с номером  " + track1.number + " ");
		track1.stop();
		
		System.out.print("Прицеп с номером  " + track2.number + " ");
		track2.roll();
		
	System.out.print("Прицеп с номером  " + track2.number + " ");	
		track2.roll();
		
	System.out.print("Прицеп с номером  " + track2.number + " ");
		track2.stop();
		
	System.out.print("Прицеп с номером  " + track2.number + " ");
		track2.stop();
	}
}
