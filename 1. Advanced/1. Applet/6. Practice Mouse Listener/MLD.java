import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MLD extends Applet {	
	public void init() { 
		addMouseListener(new A());
	}	
	class A implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			int x,y;
			x=e.getX();
			y=e.getY();
			Graphics g = getGraphics();
			g.drawOval(x,y,100,100);
			g.drawOval(x+10,y+30,20,20);
			g.drawOval(x+70,y+30,20,20);
			g.drawLine(x+50,y+30,x+50,y+50);
			g.drawArc(x+10,y+25,80,50,-70,-45);
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
		}
		public void mouseEntered(MouseEvent e) {
		}
		public void mouseExited(MouseEvent e) {
		}
	}
}
			
			

