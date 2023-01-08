	//User Exception Handling for 1001 > Roll no. && Roll no. > 9999

import java.util.Scanner;

//Creating user defined exception
class LowLimitException extends Exception  {
}
class HighLimitException extends Exception {
}
class ExceptionClass {
	void check(int n) throws LowLimitException, HighLimitException
	{
		if(n<1001) {
			throw new LowLimitException(); //Method 1st
		}
		else if(n>9999) {
			HighLimitException obj = new HighLimitException();	//method 2nd = 
			throw obj;
		}
	}
}
class MyException {
	public static void main(String args[]) {
		int roll;
		try {
			System.out.println("Hello 1");		
			roll = Integer.parseInt(args[0]);

			ExceptionClass exp = new ExceptionClass();
			System.out.println("Checking");
			exp.check(roll);

			System.out.println("Valid roll");
		}
		catch(LowLimitException exp1) {
			System.out.println("Can't less than 1001");
		}
		catch(HighLimitException exp2) {
			System.out.println("Can't more than 9999");
		}
		catch(ArrayIndexOutOfBoundsException exp3) { 
			System.out.println("Enter value between 1001 and 9999");
		}
		catch(NumberFormatException exp4) {
			System.out.println("Enter value between 1001 and 9999");
		}
	}
}
