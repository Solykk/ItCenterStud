package week1.lesson2;

public class Lift {
	int curFloat = (int) (Math.random() * 10);
	int countFloat;
	int countPeople;
	int curPeople = (int) (Math.random() * 100);
	int maximCountHumanInLift = 5;
	public void move(int nextFloor, int countHuman) {
		
		System.out.println("������� ���� = " + curFloat);
		if(countHuman == 0){
			if (curFloat == 1 && nextFloor > 1) {
				
				curFloat = nextFloor;
				countFloat += nextFloor - curFloat;
								
				System.out.println("3 - ���� ���� ��� �����");//Ok ���� ���� ��� �����
			}	
			else if (curFloat > 1 && nextFloor == 1) {
				
				countFloat += curFloat - nextFloor;
				curFloat = nextFloor;
				
				System.out.println("4 - ���� ���� ��� �����");//Ok ���� ���� ��� �����
			}
			else if (curFloat > 1 && nextFloor < curFloat) {
				
				countFloat += curFloat - nextFloor;
				curFloat = nextFloor;
				
				System.out.println("5 - ���� ���� ��� �����");//Ok ���� ���� ��� �����
			}
			else if (curFloat == nextFloor) {
						
				curFloat = nextFloor;
				
				System.out.println("9 - ���� ����� �� �����");//Ok ���� ����� �� �����
			}
			else if(curFloat < nextFloor && nextFloor != 1){
				countFloat += nextFloor - curFloat;
				curFloat = nextFloor;				
				
				System.out.println("10 - ���� ������������ ��� �����");
				
			}
		}
		else if(countHuman > 0 && countHuman <= maximCountHumanInLift){
			if (curFloat == 1 && nextFloor > 1) {
				
				
				countFloat += nextFloor - curFloat;
				curFloat = nextFloor;
				countPeople += countHuman;
				curPeople += countHuman;
				
				System.out.println("1 - ������ � ���");//Ok ������ � ���
			}	
			else if (curFloat > 1 && nextFloor == 1) {
				
				countFloat += curFloat - nextFloor;
				curFloat = nextFloor;
				countPeople += countHuman;
				curPeople -= countHuman;
				System.out.println("2 - ���� �� ����");//Ok ���� �� ����
			}
			else if(curFloat == nextFloor){
				curFloat = nextFloor;
				System.out.println("6 - ���� ����� �� �����");
			}
			else if(curFloat < nextFloor && nextFloor != 1){
				countFloat += nextFloor - curFloat;
				curFloat = nextFloor;				
				countPeople += countHuman;
				System.out.println("7 - ������� ����� � �������� ����");
				
			}
			else if(curFloat > nextFloor && nextFloor != 1){
				countFloat += curFloat - nextFloor;
				curFloat = nextFloor;				
				countPeople += countHuman;
				System.out.println("8 - ������� ����� � �������� ����");
				
			}
		}
	}	
		
	
		
	public void printAboutMe() {
		System.out.println();
		System.out.println("������� ����: " + curFloat);
		System.out.println("����� ���������� ������ �����������: " + countFloat);
		System.out.println("����� ���������� ������������ �����: " + countPeople);
		System.out.println("���������� ����� ����������� � ������ ������ � ����: " + curPeople);

	}
}
