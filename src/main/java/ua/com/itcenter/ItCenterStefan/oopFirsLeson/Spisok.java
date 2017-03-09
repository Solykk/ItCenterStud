package oopFirsLeson;



public class Spisok<X> {
	X element;
	public Object<X> next;
	public Object<X> first;

	Spisok(X element, Object<X> next, Object<X> first) {
		this.element = element;
		this.next = next;
		this.first = first;

	}

	public Spisok() {

	}

	void add(X value) {
		Object<X> newElem = new Object<X>();
		newElem.value = value;

		if (next == null) {

			first = newElem;
			next = newElem;
		} else {
			next.next = newElem;
			next = newElem;
		}
	}

	void printList() {

		Object<X> link = first;
		while (link != null) {
			System.out.print(" " + link.value);
			link = link.next;
		}

	}

	void delElem(X value) {

		if (first == next) {
			first = null;
			next = null;
			return;
		}
		if (first.value == value) {
			first = first.next;
			return;
		} else {
			Object<X> link = first;
			while (link.next != null) {
				if (link.next.value == value) {
					if (next == link.next)
						next = link;
					link.next = link.next.next;
					return;
				}
				link = link.next;
			}
		}
	}
	@SuppressWarnings("hiding")
	class Object<X> {
		Object<X> next;
		X value;
	}
	public static void main(String[] args) {
		@SuppressWarnings({ "all" })
		// Spisok<Comparable> myList = new Spisok();
		Spisok<String> myList = new Spisok<String>();
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("0");
		myList.delElem("0");
		myList.printList();

	}
}
