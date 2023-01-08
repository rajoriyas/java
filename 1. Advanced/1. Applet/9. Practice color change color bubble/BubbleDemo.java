import java.util.Random;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;//MouseMotionListener and MouseListener
public class BubbleDemo extends Applet {
	public void init() {
		addMouseListener(new A());
	}
	class A implements MouseListener {
		int i=1;
		public void mouseClicked(MouseEvent e) {
			Graphics g = getGraphics();
			g.drawOval(100,100,200,200);
			if(i != 1) {
				Random rand = new Random();
				int x1 = rand.nextInt(255);
				int y1 = rand.nextInt(255);
				int z1 = rand.nextInt(255);
				Color obj = new Color(x1,y1,z1);
				g.setColor(obj);
				g.fillOval(100,100,200,200);
			}
			i++;				
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
		
