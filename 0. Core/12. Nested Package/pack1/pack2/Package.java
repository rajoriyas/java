package pack1.pack2;
import java.util.Scanner;
class A {
	Scanner input = new Scanner(System.in);
	protected void cal() {
		System.out.println("Enter two num.");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("What you want?\n1. Sum\n2. Substract\n3. Multiply\n4. Divide");
		int choice = input.nextInt();
		if(choice == 1) {
			int sum = a+b;
			System.out.println(sum);
		}
		else if(choice == 2) {
			int substract = a-b;
			System.out.println(substract);
		}
		else if(choice == 3) {
			int multi = a*b;
			System.out.println(multi);
		}
		else if(choice == 4 && b != 0) {
			int div = a/b;
			System.out.println(div);
		}
		else {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		A obj = new A();
		obj.cal();
	}
}
		