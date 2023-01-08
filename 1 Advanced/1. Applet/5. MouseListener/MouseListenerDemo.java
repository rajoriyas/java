import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.*;

public class MouseListenerDemo extends Applet {
	public void init() {
		addMouseListener(new A());
	}
	//sub-class
	class A implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			int x,y;
			x=e.getX();
			y=e.getY();
			Graphics g = getGraphics();
			g.drawOval(x,y,100,100);
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

