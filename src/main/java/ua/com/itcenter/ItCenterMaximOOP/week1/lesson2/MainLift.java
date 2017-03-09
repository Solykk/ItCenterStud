package week1.lesson2;

/*Task 9. Lift MainLift.
Будем считать, что все люди в дом попадают только через лифт, убывают тем же способом.
В доме есть лестница, которой могут пользоваться люди в доме.
Поля объекта Lift не менять напрямую.(только через метод)
На первом этаже тех этаж(тут люди не живут).
Поля: 
 - текущий этаж curFloat
 - общее количество этажей перемещения countFloat
 - общее количество перевезенных людей countPeople
 - количество людей находящихся в данный момент в доме. curPeople
У лифта методы: 
    - метод перемещения лифта с номером этажа для перемещения nextFloor и количеством человек countHuman: 
  move(int nextFloor, int countHuman)
 - метод выводящий состояние лифта(значение всех полей объекта): printAboutMe()
В главном классе создать объект лифта, и вызвать 10 раз метод move (с рандомными значениями) и после каждого 
перемещения вызываем метод printAboutMe.*/
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
			
			System.out.println("Следующий Этаж = " + a + " " + "Кол-во Людей В Лифте = " + b);
			otis.move(a, b);
			
			otis.printAboutMe();
			System.out.println();
			System.out.println();
		}

	}
}
