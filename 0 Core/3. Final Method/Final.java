import java.util.Scanner;
class A {
	final void show() {
		System.out.println("Hello");
	}
}
class B extends A  {//Can't create same method after using final keyword in sub-class.
	/* void show() 							// gives error
		System.out.println("Hello B"); */
}

class Final {
	public static void main(String[] args) {
		B b1 = new B();
		b1.show();
	}
}
		
