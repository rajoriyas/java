class CommandLine {
	public static void main(String s[])
	{
		int a,b,c;
		try {
			System.out.println("Hello a");
			a = Integer.parseInt(s[0]);	/*praseInt converts string into integer 						and it is a static function called by class name.*/
			System.out.println("Hello b");
			b = Integer.parseInt(s[1]);
			System.out.println("Hello c");
			c = a/b;
			System.out.println("Divide="+c+"\nBye!");
		}
		catch(ArrayIndexOutOfBoundsException exception1) {
			System.out.println("You have to give alteast two number.");
		}
		catch(ArithmeticException exception2) {
			System.out.println("b can't be zero");
		}
		catch(NumberFormatException exception3) {
			System.out.println("Please enter only numbers");
		}	
	}
}		
	
