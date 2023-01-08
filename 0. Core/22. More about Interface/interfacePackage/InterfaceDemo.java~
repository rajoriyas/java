//if you skip the public accessability then compiler will give you error bacause interface works with public access modifier.

package interfacePackage;
class LowLimitException extends Exception {
}

class ExceptionClass {
	void check(double l,double b,double h) throws LowLimitException {
		if(l<1 && b<1 && h<1) {
			throw new LowLimitException();
			/*LowLimitException obj = new LowLimitException();
			throw obj;*/
		}
	}
}

interface Shape2D {
	public void draw();
	public double area();
}
interface Shape3D /*extends Shape2D*/{
	public double volume();
}

class Box implements Shape2D, Shape3D {
	double l,b,h;
	Box(double l, double b,double h) {
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public void draw() {
		System.out.println("BOX");
	}
	public double area() {
		double area = 2*((l*b)+(b*h)+(h*l));
		return area;
	}
	public double volume() {
		double volume = l*b*h;
		return volume;
	}
}
class InterfaceDemo {
	public static void main(String args[]) {
		Shape2D ref2D;
		Shape3D ref3D;
		
		double l,b,h;
		try {
			l=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			h=Integer.parseInt(args[2]);

			System.out.println("Checking");
			ExceptionClass exp = new ExceptionClass();
			exp.check(l,b,h);
			System.out.println("Argument is excepted.");

			Box obj = new Box(l,b,h);
			ref2D = obj;
			ref2D.draw();
			System.out.println(ref2D.area());
			ref3D = obj;
			System.out.println(ref3D.volume());
		}
		catch(LowLimitException exp1) {
			System.out.println("Enter value greater than zero.");
		}	
		catch(ArrayIndexOutOfBoundsException exp2) { 
			System.out.println("Please enter value");
		}
		catch(NumberFormatException exp3) {
			System.out.println("Enter value in numbers");
		}
	}
}

