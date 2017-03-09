package hw8.sort;

import java.util.Arrays;

public class QuickSorter {
	
	public void sort(Student[] students){
		for(int i = 0; i < students.length; i++){
			System.out.println(students[i].toString());
		}
	}
	
	
	
	public static void main(String[] args) {
					
		QuickSorter sor = new QuickSorter();
		Student [] jk = new QuickSorter().new Student().mass();				
		sor.sort(jk);
				
	}
	
    class Student{
		
		private String surname;
		private String name;
		private String patronymic;
		private int [] ball;
		
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPatronymic() {
			return patronymic;
		}
		public void setPatronymic(String patronymic) {
			this.patronymic = patronymic;
		}
		public int [] getBall() {
			return ball;
		}
		public void setBall(int [] ball) {
			this.ball = ball;
		}
		
		
	
		
		public Student() {
						
		}
		
		
		public Student[] mass(){
			int[] ba = {2, 3, 5 , 4 , 4};
			int[] ba1 = {5, 5, 5 , 4 , 4};
			int[] ba2 = {2, 2, 2 , 3 , 4};
			int[] ba3 = {3, 3, 3 , 2 , 4};
			int[] ba4 = {4, 2, 2 , 4 , 4};
			Student ter = new Student("Drozd", "Vladimir", "Vladimirovich", ba);
			Student ter1 = new Student("Danilenko", "Alex", "Ivanovich", ba1);
			Student ter2 = new Student("Milinevskaya", "Nataly", "Valerievna", ba2);
		    Student ter3 = new Student("Srna", "Dario", "Lucheskovich", ba3);
			Student ter4 = new Student("Ivanov", "Petr", "Stepanovich", ba4);
			
			Student[] students = new Student[5];
			
			students[0] = ter;
			students[1] = ter1;
			students[2] = ter2;
			students[3] = ter3;
			students[4] = ter4;
			
			return students;
		}
		
		@Override
		public String toString() {
			return  surname + " " + name + " " + patronymic + " "
					+ Arrays.toString(ball) + "";
		}
		
	
		public Student(String surname, String name, String patronymic, int[] ball) {
			
			this.surname = surname;
			this.name = name;
			this.patronymic = patronymic;
			this.ball = ball;
		}
		
				
    }
	
}
