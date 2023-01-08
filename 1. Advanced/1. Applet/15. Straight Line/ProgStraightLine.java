/* 
<Applet code="ProgStraightLine" width=500 height=500>
</Applet>
*/

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ProgStraightLine extends Applet {
	public int x,y,x1,y1;
	int step=1;
	public void init() {
		addMouseListener(new Action());
	}
	//inner can't be public
	class Action implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			if(step == 1) {
				x=e.getX();
				y=e.getY();
				step++;
			}
			else {
				x1=e.getX();
				y1=e.getY();
				Graphics g=getGraphics();
				g.drawLine(x,y,x1,y1);
				x=x1;
				y=y1;
				step++;
			}
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
