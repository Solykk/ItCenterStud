package hw7;

import java.util.Date;
import java.util.GregorianCalendar;



/*�� ����� ������ �������� ��������� ����������:
- ������� ���������
- �������
- ���
- ��������
- ���
- ���� ��������
- ������ ��������
- ���������� ����
- ����
- ��� �������
- ���� ���������� �������
- �����
- ��������� ������� ��������
�������� (�����, �����������, �� + �� 50 �� ������������), 
�������� (�������, �� + 30% �� ������)

�����:
- ����������
- ����
- ������� ���� ����������� �� �����
- ������� ���� �����������, ��������������� �� �� 
- ������� ���� �����������, ��������������� �� �������
- ���� ��������� ������� �� ����� 10000
- ������ ���� �������� (���� �� �������, ������ ������� ����)
- ����������� ���� ������� (����� 6 ���, �� 2 ��� � �����)
- ������� ��������� �� 10% ���� ����������� �� ������ > 5 ���
-* ������ ����������� ����� 20% (���� ������� 8 ����� - ��������,
���� 23 ������� ��������)
-* ���������� - ������� ���� �� ������ < 6 ��� � �������� 
����� ��������, �������� ������������ ��������� �����
����� ��������� �� ������
-* ������ ����������, ����� � �������� ����������� ������ �������� ��� �������
- ����� ����� ���������� �������� ��������� ����� � ����*/

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
