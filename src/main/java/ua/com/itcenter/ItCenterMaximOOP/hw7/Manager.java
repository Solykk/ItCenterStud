package hw7;

import java.util.ArrayList;

public class Manager extends Employee {
	
	private ArrayList<Employee> pod = new ArrayList<Employee>();

	public Manager(String surname, String name, String patronymic, HumanN sex, int y, int m, int d, double zp,
			long bankAccount, Department department, ArrayList<Employee> pod) {
		super(surname, name, patronymic, sex, y, m, d, zp, bankAccount, department);
		this.pod = pod;
	}
	
	
}
