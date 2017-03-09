package week1.lesson2;

public class Lift {
	int curFloat = (int) (Math.random() * 10);
	int countFloat;
	int countPeople;
	int curPeople = (int) (Math.random() * 100);
	int maximCountHumanInLift = 5;
	public void move(int nextFloor, int countHuman) {
		
		System.out.println("Текущий Этаж = " + curFloat);
		if(countHuman == 0){
			if (curFloat == 1 && nextFloor > 1) {
				
				curFloat = nextFloor;
				countFloat += nextFloor - curFloat;
								
				System.out.println("3 - лифт едет без людей");//Ok лифт едет без людей
			}	
			else if (curFloat > 1 && nextFloor == 1) {
				
				countFloat += curFloat - nextFloor;
				curFloat = nextFloor;
				
				System.out.println("4 - лифт едет без людей");//Ok лифт едет без людей
			}
			else if (curFloat > 1 && nextFloor < curFloat) {
				
				countFloat += curFloat - nextFloor;
				curFloat = nextFloor;
				
				System.out.println("5 - лифт едет без людей");//Ok лифт едет без людей
			}
			else if (curFloat == nextFloor) {
						
				curFloat = nextFloor;
				
				System.out.println("9 - лифт стоит на месте");//Ok лифт стоит на месте
			}
			else if(curFloat < nextFloor && nextFloor != 1){
				countFloat += nextFloor - curFloat;
				curFloat = nextFloor;				
				
				System.out.println("10 - лифт перемещается без людей");
				
			}
		}
		else if(countHuman > 0 && countHuman <= maximCountHumanInLift){
			if (curFloat == 1 && nextFloor > 1) {
				
				
				countFloat += nextFloor - curFloat;
				curFloat = nextFloor;
				countPeople += countHuman;
				curPeople += countHuman;
				
				System.out.println("1 - пришли в дом");//Ok пришли в дом
			}	
			else if (curFloat > 1 && nextFloor == 1) {
				
				countFloat += curFloat - nextFloor;
				curFloat = nextFloor;
				countPeople += countHuman;
				curPeople -= countHuman;
				System.out.println("2 - ушли из дома");//Ok ушли из дома
			}
			else if(curFloat == nextFloor){
				curFloat = nextFloor;
				System.out.println("6 - Лифт стоит на месте");
			}
			else if(curFloat < nextFloor && nextFloor != 1){
				countFloat += nextFloor - curFloat;
				curFloat = nextFloor;				
				countPeople += countHuman;
				System.out.println("7 - Перевез людей в пределах дома");
				
			}
			else if(curFloat > nextFloor && nextFloor != 1){
				countFloat += curFloat - nextFloor;
				curFloat = nextFloor;				
				countPeople += countHuman;
				System.out.println("8 - Перевез людей в пределах дома");
				
			}
		}
	}	
		
	
		
	public void printAboutMe() {
		System.out.println();
		System.out.println("Текущий этаж: " + curFloat);
		System.out.println("Общее количество этажей перемещения: " + countFloat);
		System.out.println("Общее количество перевезенных людей: " + countPeople);
		System.out.println("Количество людей находящихся в данный момент в доме: " + curPeople);

	}
}
