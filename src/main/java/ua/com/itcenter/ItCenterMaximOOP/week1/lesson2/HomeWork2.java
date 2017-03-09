package week1.lesson2;
/*Пользователь вводит высоту и ширину двумерного массива (матрицы). 
Заполнить матрицу случайными числами [0..9] и вывести на экран.
При вводе неверных размеров массива, выдавать сообщение
"Не верный размер массива" и выходить из программы.
Перед вводом значений НЕ нужно пользователю выдавать
сообщений, типа: "Введите ширину".
Пример:
3
4
1234
5678
9123*/
import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int height = key.nextInt();
			if(height <= 0){
				System.out.println("Не верный размер массива" );
				return;
			}
		int width = key.nextInt();
			if(width <= 0){
				System.out.println("Не верный размер массива" );
				return;
		}
			int[][] dvumernMassiv = new int[height][width];	
			for (int i = 0; i < height; i++, System.out.println()) {
				for (int j = 0; j < width; j++) {
					dvumernMassiv[i][j] = (int) (Math.random() * 10);
					System.out.print(dvumernMassiv[i][j]);
				}
			}
			
	}
}
	


