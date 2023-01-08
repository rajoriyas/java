class FinallyDemo {
	
	public static void main(String args[]) {
			
		int a,b,c;
		
		try {
			
			System.out.println("Enter a and b");
			
			a = Integer.parseInt(args[0]);
			
			b = Integer.parseInt(args[1]);
			
			c = a/b;
			
			System.out.println("c = "+c);

		}
		
		catch(ArithmeticException exp1) {
			
			System.out.println("b can't be zero.");
		
		}
		
		finally
	{
			
			System.out.println("Finally Exception");
		
		}
	
	}

}

