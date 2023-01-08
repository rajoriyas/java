/* 
<Applet code="ProgStraightLine" width=500 height=500>
</Applet>
*/

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ProgStraightLine extends Applet {
	int x,y;
	public void init() {
		x=y=0;
		addMouseListener(new Action());
	}
	//inner can't be public
	class Action implements MouseListener {
		public void mouseClicked(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
			x=e.getX();
			y=e.getY();
		}
		public void mouseReleased(MouseEvent e) {
			Graphics g=getGraphics();
			int x1=e.getX();
			int y1=e.getY();
			g.drawLine(x,y,x1,y1);
			x=x1;
			y=y1;
		}	
		public void mouseEntered(MouseEvent e) {
		}
		public void mouseExited(MouseEvent e) {
		}		
	}
}
