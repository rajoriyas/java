import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.*;

public class MyApplet extends Applet {
	public void init() {
		addMouseListener(new A());
	}
	class A implements MouseListener {
		int step=1;
		public void mouseClicked(MouseEvent e1) {			
			Graphics g = getGraphics();
			Color obj = new Color(155,1,1);
			g.setColor(obj);
			g.drawOval(100,100,100,100);
			g.drawRoundRect(120,120,20,10,1,1);
			g.drawRoundRect(160,120,20,10,1,1);
			g.drawLine(150,120,150,160);
			if(step%2==0) {
				g.clearRect(130,170,40,20);
				g.drawArc(130,170,40,50,32,118);
			}
			else {
				g.clearRect(130,170,40,20);
				g.drawArc(130,130,40,50,-35,-108);
			}
			g.drawLine(150,100,120,80);
			g.drawLine(150,100,180,80);
			g.drawLine(150,100,150,80);
			step++;
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

