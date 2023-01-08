/*
<applet code = ProgClassDemo width = 500 height =500>
</applet>
*/

//Program to apply color of button to background of color ans also change the color of button when Mouse pointer entered in the area of button 

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ProgClassDemo extends Applet {
	Button b1,b2,b3;
	public void init() {
		b1=new Button("Red");
		b2=new Button("Green");
		b3=new Button("Blue");
		
		add(b1);
		add(b2);
		add(b3);
		
		b1.addActionListener(new A());
		b2.addActionListener(new A());
		b3.addActionListener(new A());

		b1.addMouseListener(new P());
		b2.addMouseListener(new Q());
		b3.addMouseListener(new R());
	}
	class A implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Button b=(Button)e.getSource();
			if(b.equals(b1)) 
				setBackground(Color.red);

			else if(b.equals(b2))
				setBackground(Color.green);
			
			else if(b.equals(b3)) 
				setBackground(Color.blue);
		}
	}
	class P implements MouseListener {
		public void mouseEntered(MouseEvent e) {
			b1.setBackground(Color.pink); //set color of button 
			b1.setForeground(Color.red); //set color of font
		}
		public void mouseExited(MouseEvent e) {
			b1.setBackground(Color.lightGray);
			b1.setForeground(Color.black);
		}
		public void mouseClicked(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
		}
	}
	class Q implements MouseListener {
		public void mouseEntered(MouseEvent e) {
			b2.setBackground(Color.cyan);
			b2.setForeground(Color.green);
		}
		public void mouseExited(MouseEvent e) {
			b2.setBackground(Color.lightGray);
			b2.setForeground(Color.black);
		}
		public void mouseClicked(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
		}
	}
	class R implements MouseListener {
		public void mouseEntered(MouseEvent e) {
			b3.setBackground(Color.orange);
			b3.setForeground(Color.blue);
		}
		public void mouseExited(MouseEvent e) {
			b3.setBackground(Color.lightGray);
			b3.setForeground(Color.black);
		}
		public void mouseClicked(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
		}
	}
}
	

	
		
