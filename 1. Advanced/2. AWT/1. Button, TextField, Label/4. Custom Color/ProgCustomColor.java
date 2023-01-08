/*
<Applet code=ProgCustomColor width=210 height=250>
</Applet>
*/

//Program to set custom color in Background

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
class LowLimitException extends Exception {
}
class HighLimitException extends Exception {
}
class Exceptionclass {
	void check(int a,int b,int c) throws LowLimitException, HighLimitException {
		if(a<=0||b<=0||c<=0) {
			LowLimitException obj1=new LowLimitException();
			throw obj1;
		}
		if(a>=255||b>=255||c>=255) {
			throw new HighLimitException();
		}
	}
}
*/
public class ProgCustomColor extends Applet {
	Button b1;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	public void init() {
		b1=new Button("OK");
		
		l1=new Label("RED");
		l2=new Label("GREEN");
		l3=new Label("BLUE");
		
		t1=new TextField(15);
		t2=new TextField(15);
		t3=new TextField(15);
	
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		
		b1.addActionListener(new A());
	}
	class A implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=Integer.parseInt(t3.getText());
				Color obj=new Color(a,b,c);
				Button button=(Button)e.getSource();
				if(button.equals(b1)) {
					setBackground(obj);
				}
			}
		/*	catch(LowLimitException e1) {
				t3.setText(">= 0");
				t2.setText(">= 0");	
				t1.setText(">= 0");
			}	
			catch(HighLimitException e2) {
				t3.setText("<= 255");
				t2.setText("<= 255");	
				t1.setText("<= 255");
			}
			catch(NumberFormatException e3) {
				t3.setText("Integer Only!");
				t2.setText("Integer Only!");
				t1.setText("Integer Only!");
			}
			catch(ArithmeticException e4) {
				t3.setText("Math Error!");
				t2.setText("Math Error!");
				t1.setText("Math Error!");
			}	*/
			//Similiar to cobination of above four
			catch(IllegalArgumentException	e5) {
				t3.setText("Limit [0,255]");
				t2.setText("Limit [0,255]");
				t1.setText("Limit [0,255]");
			}	
		}
	}
}
	

