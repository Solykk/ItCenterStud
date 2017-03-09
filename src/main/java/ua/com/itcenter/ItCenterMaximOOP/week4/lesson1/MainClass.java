package week4.lesson1;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Table> tables = new ArrayList<Table>();
		for(int i = 0; i < 10 ; i++){
			Table tab = new Table(false);
			tables.add(tab);
		}
		
		System.out.println(tables.size());
		
		AbstractHuman [] humans = new AbstractHuman[4];
		for(int i = 0; i < humans.length; i++){
			int c = (int)(Math.random() * 10);
			if(c <= 5){
				HumanMan man = new HumanMan(0, null);
				humans[i] = man;
				
			}
			else if(c > 5){
				HumanWoman woman = new HumanWoman(0, null);
				humans[i] = woman;
			}
		}
		
		
		for(AbstractHuman e: humans){
			e.printAboutMe();
		}
		
		
		for(int i = 0; i < humans.length; i++){
			int c = (int)(Math.random() * 10);
			if(c <= 5){
				GlassSquare squ = new GlassSquare(1);
				humans[i].takeGlass(squ);
				
			}
			else if(c > 5){
				GlassCircle cir = new GlassCircle(1);
				humans[i].takeGlass(cir);
			}
		}
		
		for(AbstractHuman e: humans){
			e.printAboutMe();
		}
		
		for(Table e: tables){
			e.isDry();
		}
		
		humans[2].pourWaterOnTable(tables.get(5));
		humans[3].pourWaterOnTable(tables.get(6));
		
		for(Table e: tables){
			e.isDry();
		}
		
		for(AbstractHuman e: humans){
			e.putGlass();
		}
		
		for(Table e: tables){
			e.isDry();
		}
		
		humans[2].pourWaterOnTable(tables.get(5));
		humans[3].pourWaterOnTable(tables.get(6));
		
		for(Table e: tables){
			e.isDry();
		}
	}
}
