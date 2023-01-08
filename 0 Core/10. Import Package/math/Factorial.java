package math;
import java.util.Scanner;
public class Factorial {
	public int fact(int f) {
		for(int j=f-1; j != 1; --j) {
			f=f*j;
		}
		return f;
	}
	public static void main(String[] args) {
		Factorial obj = new Factorial();
		System.out.println(obj.fact(5));		//always give argument to method not to class.
	}
}
		
			