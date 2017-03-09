package hw7;

import java.util.Date;
import java.util.GregorianCalendar;



/*На фирме должны работать следующие сотрудники:
- Обычный сотрудник
- Фамилия
- Имя
- Отчество
- Пол
- Дата рождения
- Ставка зарплаты
- Зарплатный счет
- Стаж
- Дни отпуска
- Дата последнего отпуска
- Отдел
- получение размера зарплаты
Менеджер (отдел, подчиненные, зп + по 50 за подчененного), 
Продавец (продажи, зп + 30% от продаж)

Фирма:
- сотрудники
- счет
- вывести всех сотрудников на экран
- вывести всех сотрудников, отсортированных по зп 
- вывести всех сотрудников, отсортированных по фамилии
- всем продавцам продать на сумму 10000
- выдать всем зарплату (если не хватает, выдать сколько есть)
- пересчитать всем отпуска (после 6 мес, по 2 дня в месяц)
- поднять жалование на 10% всем сотрудникам со стажем > 5 лет
-* выдать праздничный бонус 20% (если сегодня 8 марта - женщинам,
если 23 февраля мужчинам)
-* сокращение - уволить всех со стажем < 6 мес и нечетной 
датой рождения, зарплату увольняемого разделить между
всеми коллегами по отделу
-* нанять сотрудника, снять с зарплаты сотрудников отдела зарплату для новичка
- после любой изменяющей операции сохранять фирму в файл*/

public class Employee {
	
	private String surname;
	private String name;
	private String patronymic;
	private HumanN sex;
	
	private Date birthday;
	private double zp;
	private long bankAccount;
	private int staj;
	private int daysOfWocation;
	private Date wocationDate;
	private Department department;
	private double sumOfZP;
	
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
	public HumanN getSex() {
		return sex;
	}
	public void setSex(HumanN sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public double getZp() {
		return zp;
	}
	public void setZp(double zp) {
		this.zp = zp;
	}
	public long getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(long bankAccount) {
		this.bankAccount = bankAccount;
	}
	public int getStaj() {
		return staj;
	}
	public void setStaj(int staj) {
		this.staj = staj;
	}
	public int getDaysOfWocation() {
		return daysOfWocation;
	}
	public void setDaysOfWocation(int daysOfWocation) {
		this.daysOfWocation = daysOfWocation;
	}
	public Date getWocationDate() {
		return wocationDate;
	}
	public void setWocationDate(Date wocationDate) {
		this.wocationDate = wocationDate;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public double getSumOfZP() {
		return sumOfZP;
	}
	public void setSumOfZP(double sumOfZP) {
		this.sumOfZP = sumOfZP;
	}
	public Employee(String surname, String name, String patronymic, HumanN sex, int y, int m, int d, double zp,
			long bankAccount, Department department) {
		super();
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.sex = sex;
		GregorianCalendar b = new GregorianCalendar(y,m,d);
		this.birthday = b.getTime();
		this.zp = zp;
		this.bankAccount = bankAccount;
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Employee [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", sex=" + sex
				+ ", birthday=" + birthday + ", zp=" + zp + ", bankAccount=" + bankAccount + ", department="
				+ department + "]";
	}
	public static void main(String[] args) {
		
		Employee eml = new Employee("Kulik", "Alex", "Ivanovich", HumanN.Man, 1980,3,4, 3500.5, 1237890, Department.Department1);
		System.out.println(eml.toString());
	}
	
	
		
}
