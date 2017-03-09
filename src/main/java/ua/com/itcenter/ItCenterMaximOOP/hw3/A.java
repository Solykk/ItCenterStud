package hw3;

public class A {
	
	public void f() {
		System.out.println("f from Parent");
	}

	public A() {
		System.out.println("Constructor Parent");
	}

	static {
		System.out.println("static Block initial Parent");
	}

	{
		System.out.println("non-static Block initial Parent");
	}

	public static void main(String[] args) {
		A obj1 = new B();
		System.out.println();
		A obj2 = new B();
		System.out.println();
		obj1.f();
	}
}

class B extends A {
	public void f() {
		System.out.println("f from Child");
	}

	public B() {
		System.out.println("Constructor Child");
	}

	static {
		System.out.println("static Block initial Child\n");
	}

	{
		System.out.println("non-static Block initial Child");
	}
}
