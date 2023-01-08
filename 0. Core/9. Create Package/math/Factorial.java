package math;
import java.util.Scanner;
public class Factorial {
	int f;
	Factorial() {
	}
	Factorial(int a) {
		f=a;
	}
	public int fact() {
		for(int j=f-1; j != 1; --j) {
			f=f*j;
		}
		return f;
	}
	public static void main(String[] args) {
		Factorial obj = new Factorial(5);
		System.out.println(obj.fact());
	}
}
		
			