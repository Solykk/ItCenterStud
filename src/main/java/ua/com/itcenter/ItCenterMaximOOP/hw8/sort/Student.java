package hw8.sort;

public class Student {
	
	private String surname;
	private String name;
	private String patronymic;
	private int ball;
	
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
	public int getBall() {
		return ball;
	}
	public void setBall(int ball) {
		this.ball = ball;
	}
	public Student(String surname, String name, String patronymic, int ball) {
		
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.ball = ball;
	}
	
	@Override
	public String toString() {
		return "Студент " + surname + ", " + name + ", " + patronymic + "  -  " + ball;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ball;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ball != other.ball)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	class QuickSorter  {
		
		public QuickSorter(){
			
		}
		
		public void sort(Student[] students){
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Student ter = new Student("Drozd", "Vladimir", "Vladimirovich", 98);
		Student ter1 = new Student("Danilenko", "Alex", "Ivanovich", 55);
		Student ter2 = new Student("Milinevskaya", "Nataly", "Valerievna", 100);
		Student ter3 = new Student("Srna", "Dario", "Lucheskovich", 99);
		Student ter4 = new Student("Ivanov", "Petr", "Stepanovich", 68);
		
		Student[] students = new Student[5];
		
		students[0] = ter;
		students[1] = ter1;
		students[2] = ter2;
		students[3] = ter3;
		students[4] = ter4;
		
		QuickSorter sor = new QuickSorter();
		sor.sort(students);
				
		
		
		
	}
	
	
	
}
