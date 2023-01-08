import java.util.Scanner;
interface Shape {
	void draw();
	double area();
}
class Rect implements Shape {
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
class Circle implements Shape {
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
class Interface {
	public static void main(String[] args) {
		Shape ref;	//in interface we create reference not object.
		Rect obj1 = new Rect(4,5);
		Circle obj2 = new Circle(6);
		ref= obj1;
		ref.draw();
		double area;
		area = ref.area();
		System.out.println(area);
		ref= obj2;
		ref.draw();
		area = ref.area();
		System.out.println(area);
	}
}
		
		