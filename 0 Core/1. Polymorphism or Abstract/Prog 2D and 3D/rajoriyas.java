import java.util.Scanner;
abstract class Area {
	abstract void draw();
	abstract double area();
}
abstract class Volume extends Area {		//volume has all right of area
	abstract double volume();
}
class Shape1 extends Area {
	double l, b;
	Shape1() {
	}
	Shape1(double c, double d) {
		l=c;
		b=d;
	}
	void draw() {
		System.out.println("Rectangle");
	}
	double area() {
		double area=l*b;
		return area;
	}
}
class Shape2 extends Area {
	double r;
	Shape2() {
	}
	Shape2(double a) {
		r=a;
	}
	void draw() {
		System.out.println("Circle");
	}
	double area() {
		double area=3.14*r*r;
		return area
		;
	}
}
class Shape3 extends Volume {
		double l, b, h;
	Shape3() {
	}
	Shape3(double c, double d, double e) {
		l=c;
		b=d;
		h=e;
	}
	void draw() {
		System.out.println("Cuboid");
	}
	double area() {
		double area= 2*l*b + 2*h*b + 2*l*h;
		return area;
	}
	double volume() {
		double volume=l*b*h;
		return volume;
	}
}

class rajoriyas {
	public static void main(String[] args) {
		Area ref1;
		Volume ref2;
		
		Shape1 r1=new Shape1(10, 2.5);
		ref1 = r1;
		ref1.draw(); 
		ref1.area();
		double a = ref1.area();
		System.out.println("Area="+a);
		
		Shape2 c1=new Shape2(2.5);
		ref1 = c1;
		ref1.draw(); 
		ref1.area();
		double b = ref1.area();
		System.out.println("Area="+b);
		
		Shape3 b1=new Shape3(10, 2, 25);
		ref2 = b1;
		ref2.draw(); 
		ref2.area();
		double c = ref2.area();
		System.out.println("Area="+c);
		
		ref2.volume();
		double v = ref2.volume();
		System.out.println("Volume="+v);
	}
}
		
		
		
		
		

	
	
	