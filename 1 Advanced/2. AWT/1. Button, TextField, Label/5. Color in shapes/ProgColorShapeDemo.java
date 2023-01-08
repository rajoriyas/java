/*
<applet code=ProgColorShapeDemo width=230 height=400>
</applet>
*/

//Prog to show different shapes filled with color

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ProgColorShapeDemo extends Applet {
	Button s1,s2,s3,s4,c1,c2,c3,c4;
	int a,b;
	public void init() {
		s1=new Button("RECT");
		s2=new Button("CIRCLE");
		s3=new Button("ARC");
		s4=new Button("TRIANGLE");

		c1=new Button("RED");
		c2=new Button("GREEN");	
		c3=new Button("BLUE");
		c4=new Button("CYAN");

		add(c1);
		add(c2);
		add(c3);
		add(c4);		
		add(s1);
		add(s2);
		add(s3);
		add(s4);
		
		s1.addActionListener(new A());
		s2.addActionListener(new A());
		s3.addActionListener(new A());
		s4.addActionListener(new A());
		c1.addActionListener(new A());
		c2.addActionListener(new A());
		c3.addActionListener(new A());
		c4.addActionListener(new A());
	}
	class A implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Button button=(Button)e.getSource();
			if(button.equals(s1))
				a=1;

			if(button.equals(s2))
				a=2;

			if(button.equals(s3))
				a=3;

			if(button.equals(s4))
				a=4;

			if(button.equals(c1))
				b=1;

			if(button.equals(c2))
				b=2;

			if(button.equals(c3))
				b=3;

			if(button.equals(c4))
				b=4;
		
			repaint();
		}
	}
	public void paint(Graphics g) {
		if(b==1) 
			g.setColor(Color.red);

		if(b==2) 
			g.setColor(Color.green);

		if(b==3) 
			g.setColor(Color.blue);

		if(b==4) 
			g.setColor(Color.cyan);		

		if(a==1) {
			g.drawRect(50,150,130,200);
			g.fillRect(50,150,130,200);
		}

		if(a==2) {
			g.drawOval(50,150,130,200);
			g.fillOval(50,150,130,200);
		}

		if(a==3) {
			g.drawArc(50,150,130,200,45,90);
			g.fillArc(50,150,130,200,45,90);
		}

		if(a==4) {
			int x[] = {115,75,175};
			int y[] = {150,350,350};
			g.drawPolygon(x,y,3);
			g.fillPolygon(x,y,3);
		}
	}
}
		
			









