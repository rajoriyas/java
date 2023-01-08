class LowLimitException extends Exception {
}
class HighLimitException extends Exception {
}
class ExceptionClass {
	void check(int n) throws LowLimitException, HighLimitException {
		if(n<1001) {
			throw new LowLimitException(); //Method 1st
		}
		else if(n>9999) {
			HighLimitException obj = new HighLimitException();	//method 2nd = 
			throw obj;
		}
	}
}
//to generate only exception not to handle no need of try catch and finally.
class ThrowsDemo {
	public static void main(String args[]) throws LowLimitException, HighLimitException, ArrayIndexOutOfBoundsException, NumberFormatException {
		int roll;
		roll = Integer.parseInt(args[0]);
		System.out.println("Checking");
		ExceptionClass exp = new ExceptionClass();
		exp.check(roll);
		System.out.println("Roll Number expected.");
	}
}

		
		
