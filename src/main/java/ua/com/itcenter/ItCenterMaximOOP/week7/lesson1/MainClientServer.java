package week7.lesson1;
/*Task 4. ���������� ��� � �������������. � ������� ������ ��������� ������ � ������.
������� ���������� �����, ���� ����� ������������ ����� ��������.
����� ������:
 - � ������� ��������� ������
 - ���������� ������ ����������� � ��������� ���� � ������������ ������ � ����������� ".cht".
����� ������: 
 - ����� � ���� ������ �����. 
 - ������ 2 ������� ��������� ������� ������������ ����� � ���� "�����" ����� � ����������� ".cht"
 - ��� ���������� "������" ����� ��������� � ������ ����� ������.
 - ����� ������������, ���� ����� "����� ����", �� ������� ���� ������ �� �����.*/
public class MainClientServer {
	public synchronized static void st(){
		Client cl = new Client();
		Server sr = new Server();
		
		cl.start();
		sr.start();
	}
	
	public static void main(String[] args) {
		st();
	}
}
