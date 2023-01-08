/*
<applet code="ProgShape" width=500 height=1000>
</applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;		
	
public class ProgShape extends Applet {
	Button b1,b2,b3,b4,b5;
	TextField t1,t2,t3,t4;
	Label l1,l2,l3,l4;
	public void init() {
		b1=new Button("RECTANGLE");
		b2=new Button("OVAL");
		b3=new Button("ARC");
		b4=new Button("ROUNDED RECTANGLE");
		b5=new Button("LINE");
		
		t1=new TextField(12);
		t2=new TextField(12);
		t3=new TextField(12);
		t4=new TextField(12);
		
		l1=new Label("Length/Diameter");
		l2=new Label("Width");
		l3=new Label("Round Horizontally/Initial Angle");
		l4=new Label("Round Vertically/Arc Angle");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		b1.addActionListener(new A());
		b2.addActionListener(new A());
		b3.addActionListener(new A());
		b4.addActionListener(new A());
		b5.addActionListener(new A());		
	}
	class A implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				int l=0,b=0,rh=0,rv=0;
				l=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				rh=Integer.parseInt(t3.getText());
				rv=Integer.parseInt(t4.getText());
				Button button=(Button)e.getSource();
				Graphics g=getGraphics();
				if(button.equals(b1)) {
					t3.setText("Not required");
					t4.setText("Not required");
					g.drawRect(100,300,100+l,300+b);
				}
				else if(button.equals(b2)) {
					t3.setText("Not required");
					t4.setText("Not required");
					g.drawOval(100,300,100+l,300+b);
				}
				else if(button.equals(b3)) {
					
					g.drawArc(100,300,100+l,300+b,rh,rv);
				}
				else if(button.equals(b4)) {
					l=Integer.parseInt(t1.getText());
					b=Integer.parseInt(t2.getText());
					g.drawRoundRect(100,300,100+l,300+b,rh,rv);
				}
				else if(button.equals(b5)) {
					t2.setText("Not required");
					t3.setText("Not required");
					t4.setText("Not required");
					g.drawLine(100,300,100+l,300);
				}
			}
			catch(NumberFormatException e1) {
				
			}
		}
	}
}

				

