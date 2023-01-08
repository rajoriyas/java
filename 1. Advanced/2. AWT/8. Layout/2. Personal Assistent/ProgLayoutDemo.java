//Program to understand the layout
import java.awt.*;
import java.awt.event.*;
public class ProgLayoutDemo extends Frame {
	TextField t1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	Panel P1,P2,P3;
	ProgLayoutDemo() {
		t1=new TextField(20);
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("0");
		b11=new Button("Backspace");
		b12=new Button("Enter");
		b13=new Button("Top");
		b14=new Button("Down");
		b15=new Button("Left");
		b16=new Button("Right");
		b17=new Button("Center");
		
		P1=new Panel();
		P2=new Panel();
		P3=new Panel();		
		setLayout(new GridLayout(3,1));
		P1.setLayout(new FlowLayout());
		P2.setLayout(new GridLayout(4,3));
		P3.setLayout(new BorderLayout());
		
		P1.add(t1);
		P2.add(b1);
		P2.add(b2);
		P2.add(b3);
		P2.add(b4);
		P2.add(b5);
		P2.add(b6);
		P2.add(b7);
		P2.add(b8);
		P2.add(b9);
		P2.add(b11);
		P2.add(b10);
		P2.add(b12);
		P3.add(b13,BorderLayout.NORTH);
		P3.add(b14,BorderLayout.SOUTH);
		P3.add(b15,BorderLayout.WEST);
		P3.add(b16,BorderLayout.EAST);
		P3.add(b17,BorderLayout.CENTER);
		
		add(P1);
		add(P2);
		add(P3);
		
		setSize(250,400);
		setVisible(true);
	}
	public static void main(String args[]) {
		ProgLayoutDemo obj=new ProgLayoutDemo();
	}
}
					 
				  
		