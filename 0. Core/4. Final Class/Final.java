import java.util.Scanner;
final class A {			//restrict unauthorized access
	void show() {
		System.out.println("Hello");
	}
}

class B /* extends A */{
											/* Final.java:8: error: cannot inherit from final A
											   class B extends A {
											   ^
											   1 error */
}

class Final {
	public static void main(String[] args) {
		A obj = new A();
		obj.show();
	}
}