//Program to show Panel and Layout
import java.awt.*;
import java.awt.event.*;
public class ProgLayoutDemo extends Frame {
	Label l1,l2,l3;
	TextField t1,t2;
	CheckboxGroup obj;
	Checkbox c1,c2,c3,c4;
	Button b1,b2;
	Panel P1,P2,P3;
	ProgLayoutDemo() {
		l1=new Label("Reg. No.");
		l2=new Label("Name");
		l3=new Label("Q. What is JAVA");
		t1=new TextField(20);
		t2=new TextField(20);
		obj=new CheckboxGroup();
		c1=new Checkbox("Virus",obj,true);
		c2=new Checkbox("Language",obj,true);
		c3=new Checkbox("Trojen",obj,true);
		c4=new Checkbox("None of these",obj,true);
		b1=new Button("Next");
		b2=new Button("Finish");
		
		P1=new Panel();
		P2=new Panel();
		P3=new Panel();
		//set the layout of frame
		setLayout(new GridLayout(3,1));
		//set the layout of Panel
		P1.setLayout(new GridLayout(2,2));
		P2.setLayout(new GridLayout(5,1));
		P3.setLayout(new GridLayout(1,2));
		//attach the compoments
		P1.add(l1);
		P1.add(t1);
		P1.add(l2);
		P1.add(t2);
		
		P2.add(l3);
		P2.add(c1);
		P2.add(c2);
		P2.add(c3);
		P2.add(c4);
		
		P3.add(b1);
		P3.add(b2);
		//add all panels to frame
		add(P1);
		add(P2);
		add(P3);
		
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[]) {
		ProgLayoutDemo obj=new ProgLayoutDemo();
	}
}
					 
					 
				  
		