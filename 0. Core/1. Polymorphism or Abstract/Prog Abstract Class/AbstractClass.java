//Program of Different Different Shape Analysis
import java.util.Scanner;

abstract class Shape {
	abstract void draw();
	abstract double area();
}

class Rectangle extends Shape {
	//Rectangle has to define two methods 'draw()' & 'area'
	double w,h;
	Rectangle() {	//Default Constructor
	}
	Rectangle(double a,double b) {		//Constructor
		w=a;
		h=b;
	}
	void draw(){
		System.out.println("Hello Rectangle");
	}
	double area() {
		return w*h;
	}
}
	
class Circle extends Shape {
	double r;
	Circle() {
	}
	Circle (double a) {
		r=a;
	}
	void draw() {
		System.out.println("Hello Circle");
	}
	double area() {
		return 3.14*r*r;
	}
}
		
class AbstractClass {
	public static void main(String[] args) {
		Shape p;	//reference
		//Shape p = new Shape; ---> gives erroe
		Rectangle x = new Rectangle(4,5);
		Circle y = new Circle(10);
		
		p=x; //x contains all info. about Rectangle.
		p.draw();
		double m;
		m=p.area();
		System.out.println("Area of rectangle="+m);
		
		p=y;
		p.draw();
		m=p.area();
		System.out.println("Area of circle="+m);
	}
}	
		
		
		
	
	
		
