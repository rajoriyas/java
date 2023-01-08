import java.util.Scanner;
class A {
	A() {
		System.out.println("Default Constructor of Parent Class!");
	}
	A(String str) {
		System.out.println("Args Constructor of Parent Class!");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("Parameterized Constructor of Child Class!");
	}
	B(String args) {
		super("to call parameterized constructor");
		System.out.println("Args Constructor of Child Class!");
	}
	public static void main(String[] args) {
		B obj1=new B();			// while calling--> java B
		B obj2=new B("str");
	}
}