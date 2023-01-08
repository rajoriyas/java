/* 
<applet code = "ProgCalc" width=170 height=210>
</applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ProgCalc extends Applet {
	Button b1,b2,b3,b4;
	TextField t1,t2,t3;
	Label l1,l2,l3,l4;
	public void init() {
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(20);

		l1=new Label("Number 1");
		l2=new Label("Number 2");
		l3=new Label("Conclusion");
		l4=new Label("****Calculator*****");
		
		add(l4);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l3);
		add(t3);

		b1.addActionListener(new A());
		b2.addActionListener(new A());
		b3.addActionListener(new A());
		b4.addActionListener(new A());
	}
	class A implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String s=ae.getActionCommand();
			int a,b,c=0;
			try {
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				if(s.equals("+")) {
					c=a+b;
				}
				else if(s.equals("-")) {
					c=a-b;
				}
				else if(s.equals("*")) {
					c=a*b;
				}
				else if(s.equals("/")) {
					c=a/b;
				}
				t3.setText(" "+c);
			}
			catch(ArithmeticException e1) {
				t3.setText("Math Error!");
			}
			catch(NumberFormatException e2) {
				t3.setText("Enter numerical value.");
			}
			
		}
	}
}


		
