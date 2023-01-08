import java.util.Scanner;
class A {
	void show() {
		System.out.println("Hello A");
	}
}

class B extends A {
	void display() {
		System.out.println("Hello B");
		super.show();						// used in constructor to call method of base class
	}
}

class Super {
	public static void main(String[] args) {
		B obj=new B();
		obj.display();
	}
}