package week2.lesson1;

public class Car {
	private String number;
	private String marka;
	
	public void setNumber(String number){ //���������(������) �������� 
		this.number = number; 
	}
	public String getNumber(){//���������� ��������
		return number;
	}
	public void setMarka(String marka){//���������(������) ��������
		this.marka = marka;
	}	
	public String getMarka(){ //���������� ��������
		return marka;
	}
	public void getCountObj(){// ���-�� ������� � ������
		
	}
	public void printAboutMe(){// ������� �� ����� 
		System.out.println(number);
		System.out.println(marka);
	}
	
}
