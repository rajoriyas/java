/*
<applet code=ProgCourse width=300 height=100>
</applet>
*/

//Prog to know course

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgCourse extends Applet {
	Checkbox c1,c2,c3,c4;
	Label l1;
	Button b1;
	TextField t2;
	String s=" ";
	public void init() {
		c1=new Checkbox("J2EE");
		c2=new Checkbox("ORACLE");
		c3=new Checkbox("PHP");
		c4=new Checkbox("ASP.NET");
		
		b1=new Button("Procced");

		l1=new Label("Course");
		//l2=new Label(s);		NOT FOR RUNTIME

		t2=new TextField(20);
			
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(b1);
		add(l1);
		add(t2);
					
		c1.addItemListener(new A());
		c2.addItemListener(new A());
		c3.addItemListener(new A());
		c4.addItemListener(new A());
		b1.addActionListener(new A());
	}
	class A implements ItemListener, ActionListener {
		public void itemStateChanged(ItemEvent e) {
			s=" ";
			if(c1.getState()) s=s+"J2EE ";
			if(c2.getState()) s=s+"ORACLE ";
			if(c3.getState()) s=s+"PHP ";
			if(c4.getState()) s=s+"ASP.NET ";		
		}
		public void actionPerformed(ActionEvent e) {
			Button b=(Button)e.getSource();
			if(b.equals(b1)) {
				t2.setText(s);
			}
		}
	}	
}
			
