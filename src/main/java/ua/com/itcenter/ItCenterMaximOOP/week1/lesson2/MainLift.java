package week1.lesson2;

/*Task 9. Lift MainLift.
����� �������, ��� ��� ���� � ��� �������� ������ ����� ����, ������� ��� �� ��������.
� ���� ���� ��������, ������� ����� ������������ ���� � ����.
���� ������� Lift �� ������ ��������.(������ ����� �����)
�� ������ ����� ��� ����(��� ���� �� �����).
����: 
 - ������� ���� curFloat
 - ����� ���������� ������ ����������� countFloat
 - ����� ���������� ������������ ����� countPeople
 - ���������� ����� ����������� � ������ ������ � ����. curPeople
� ����� ������: 
    - ����� ����������� ����� � ������� ����� ��� ����������� nextFloor � ����������� ������� countHuman: 
  move(int nextFloor, int countHuman)
 - ����� ��������� ��������� �����(�������� ���� ����� �������): printAboutMe()
� ������� ������ ������� ������ �����, � ������� 10 ��� ����� move (� ���������� ����������) � ����� ������� 
����������� �������� ����� printAboutMe.*/
public class MainLift {
	public static void main(String[] args) {
		Lift otis = new Lift();
		int a;
		int b;
		for (int i = 0; i < 10; i++) {
			a = (int) (Math.random() * 10);
			if (a == 0) {
				a = 1;
			} else if (a == 1) {
				a = 1;
			}
			b = (int) (Math.random() * 10);
			if (b >= 5) {
				b = b - 5;
			}
			
			System.out.println("��������� ���� = " + a + " " + "���-�� ����� � ����� = " + b);
			otis.move(a, b);
			
			otis.printAboutMe();
			System.out.println();
			System.out.println();
		}

	}
}
