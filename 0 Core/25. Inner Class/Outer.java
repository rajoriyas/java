class Outer {		// public only
	static int x = 10;	//to access in inner class static must 
	static class Inner { //private or protected only //static must
		int y = 20;
		void show() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	void display() {
		System.out.println(x);
		//System.out.println(y);
		Inner obj = new Inner();
		System.out.println(obj.y);
	}
	public static void main(String args[]) {
		Outer obj = new Outer();
		obj.display();

		Inner obj2 = new Inner();
		obj2.show();
	}
}

		

