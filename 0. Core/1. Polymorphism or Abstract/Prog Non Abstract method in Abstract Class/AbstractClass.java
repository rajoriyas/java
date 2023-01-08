import java.util.Scanner;

abstract class A {
	void show() {							//Non-Abstract Method
		System.out.println("Hello! Static Show.");
	}
	static void show1()  {							//Non-Abstract, Non Static Method
		System.out.println("Hello! Static Show1.");
	}
}

class B extends A { 	

}

class AbstractClass{
	public static void main(String[] agrs) {
		//solution 1st
		A.show1();						
		//solution 2nd
		A ref;								//reference
		//ref.show(); --> Illegal Operation.
		B obj = new B();
		obj.show();
	}
}
