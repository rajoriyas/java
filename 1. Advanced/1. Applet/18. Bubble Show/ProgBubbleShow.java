/*
<applet code="ProgBubbleShow" width="550" height="550">
</applet>
*/

import java.applet.*;
import java.awt.*;
import java.lang.*;

//Runnable (with sub class ore related class) used to run process alternate not simountanously.

public class ProgBubbleShow extends Applet {
	Thread t1,t2,t3,t4;
	
	public void init() {
		t1 = new A(this);
		t2 = new B(this);
		t3 = new C(this);
		t4 = new D(this);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
class A extends Thread {
	Applet a;
	public A(Applet a) {
		this.a=a;
	}
	int x=0,y=0,z=0,w=z/2;;
	public void run() {
		Graphics g = a.getGraphics();
		for(int i=0;i<21;i++) {
			g.drawOval(x-w,y-w,z,z);
			x+=4;
			y+=4;
			z+=4;
			if(x==80 && y==80) {
				x=0;
				y=0;	
				z=0;
				i=0;
				g.clearRect(0,0,250,250);
			}
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
			}
		}
	}	
}
class B extends Thread{
	Applet a;
	public B(Applet a) {
		this.a=a;
	}
	int x=0,y=500,z=0,w=z/2;
	public void run() {
		Graphics g = a.getGraphics();
		for(int i=0;i<21;i++) {
			g.drawOval(x-w,y+w-z,z,z);
			x+=4;
			y-=4;
			z+=4;	
			if(x==80 && y==420) {
				x=0;
				y=500;
				z=0;
				i=0;
				g.clearRect(0,250,250,300);
			}
			try {
				Thread.sleep(500);
				
			}
			catch(InterruptedException e) {
			}
		}
	}
}
class C extends Thread {
	Applet a;
	public C(Applet a) {
		this.a=a;
	}	
	int x=500,y=0,z=0,w=z/2;
	public void run() {
		Graphics g = a.getGraphics();
		for(int i=0;i<21;i++) {		
			g.drawOval(x+w-z,y-w,z,z);
			x-=4;
			y+=4;
			z+=4;	
			if(x==420 && y==80) {
				x=500;
				y=0;
				z=0;
				i=0;
				g.clearRect(250,0,300,250);
			}
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
			}
		}
	}
}
class D extends Thread {
	Applet a;
	public D(Applet a) {
		this.a=a;
	}
	int x=500,y=500,z=0,w=z/2;
	public void run() {
		Graphics g = a.getGraphics();
		for(int i=0;i<21;i++) {		
			g.drawOval(x+w-z,y+w-z,z,z);
			x-=4;
			y-=4;
			z+=4;
			if(x==420 && y==420) {
				x=500;
				y=500;
				z=0;
				i=0;
				g.clearRect(250,250,300,300);
			}
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
			}
		}
	}
}

