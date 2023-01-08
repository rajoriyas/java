//if you skip the public accessability then compiler will give you error

interface Shape2D {
	public void draw();
	public double area();
}
interface Shape3D extends Shape2D {
	public double volume();
}
class Rect implements Shape2D {
	double w,h;
	Rect() {
	}
	Rect(double w, double h) {
		this.w = w;
		this.h = h;
	}
	public void draw() {
		System.out.println("Hello Rect");
	}
	public double area() {
		return w*h;
	}
}
class Circle implements Shape2D {
	double r;
	Circle() {
	}
	Circle(double r) {
		this.r = r;
	}
	public void draw() { 

		System.out.println("Hello Circle");
	}
	public double area() {
		return 3.14*r*r;
	}
}
class Cone implements Shape3D {
	double r,l;
	Cone() {
	}
	Cone(double r, double l) {
		this.r = r;
		this.l = l;
	}
	public void draw() {
		System.out.println("Hello Cone");
	}
	public double area() {
		return 2*3.14*r*(r+l);
	}
	public double volume() {
		return 3.14*r*r*l/3;
	}
}
class Cuboid implements Shape3D {
	double l,b,h;
	Cuboid() {
	}
	Cuboid(double l, double w, double h) {
		this.l = l;
		this.b = b;
		this.h = h;
	}
	public void draw() {
		System.out.println("Hello Box");
	}
	public double area() {
		return 2*((l*b)+(b*h)+(h*l));
	}
	public double volume() {
		return l*b*h;
	}
}
class BaseInterface {
	public static void main(String[] args) {
		Shape2D ref1;
		Shape3D ref2;
		
		Rect obj1 = new Rect(2,3);
		Circle obj2 = new Circle(4);
		Cone obj3 = new Cone(5,6);
		Cuboid obj4 = new Cuboid(7,8,9);

		ref1=obj1;
		ref1.draw();
		System.out.println(ref1.area());

		ref1=obj2;
		ref1.draw();
		System.out.println(ref1.area());

		ref2=obj3;
		ref2.draw();
		System.out.println(ref1.area());
		System.out.println(ref2.volume());

		ref2=obj4;
		ref2.draw();
		System.out.println(ref1.area());
		System.out.println(ref2.volume());
	}
}

