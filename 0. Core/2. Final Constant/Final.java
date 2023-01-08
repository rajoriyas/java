import java.util.Scanner;
class Final {
	public static void main(String[] args) {
		final int a;
		int b;
		a=5;
		//a=a+1; --> error occuring
		System.out.println(a);
		b=5;
		b=++b;
		System.out.println(b);
	}
}