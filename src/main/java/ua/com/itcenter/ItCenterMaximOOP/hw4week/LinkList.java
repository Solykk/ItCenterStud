package hw4week;
/*�������� ����� LinkList, ���������� �������� ���� int, ������������ ��������� ������ � ������� �������� Node.
��� ������ LinkList �������� ������:

1. ������ �������� �������� �� �������, ����� void set(int index, int element)
2. �������� �������� �� �������, ����� void remove(int index)
3. ����� �������� �� ��������, ����� int indexOf(int element)
4. �������� ������� ������ � ��������� ��������, ����� void swapFirstLast()
5. ����������� �������� � ������ � �������� �������, ����� void revert()
6. �������� ������� ���������� � ���������� ��������, � ������ ���� ���������� ��������� Comparable, ����� void swapMaxMin()
7. �������� ����������� �������� ������, � ������ ���� ���������� ��������� Comparable, ����� void sortPartial(int index)
8. ��������� ���� �������, ����� boolean equals(LinkList list)
9. �������� ���� �������, ����� LinkList concat(LinkList list)
10*. ������������� ������, � ������ ���� ���������� ��������� Comparable, ����� void sort()
11*. ������� ������������� �������� �� ������, � ������ ���� ���������� ��������� Comparable, ����� void removeDuplicates()*/

public class LinkList {
	
	class Node{
		int temp;
	private	Node next;
	private Node previous;
		public Node(int element, Node next, Node previous) {
			super();
			if(this.next == null && this.previous == null){
			this.temp = element;
			}
			this.next = next;
			this.previous = previous;
		}
		
		public void addNode(int value){
			if(this.previous == null){
				this.temp = value;
				this.next = null;
				this.previous = this;
			}
	 		 
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Node f =  new Node(3,null, null);
		
	}
	
}
