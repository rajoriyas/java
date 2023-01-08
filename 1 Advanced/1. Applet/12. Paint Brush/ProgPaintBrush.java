/*
<Applet code="ProgPaintBrush" width="500" height="500">
</Applet>
*/

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;	//sub packages

// public is essential to access as html by applet viewer
public class ProgPaintBrush extends Applet {
	int x,y;
	public void init() {
		x=y=0;
		addMouseMotionListener(new Action());
	}
	class Action implements MouseMotionListener {
		public void mouseMoved(MouseEvent event1) {
			x=event1.getX();
			y=event1.getY();
		}
		public void mouseDragged(MouseEvent event) {
			Graphics g = getGraphics();	
			int x1=event.getX();
			int y1=event.getY();
			g.drawLine(x,y,x1,y1);// for thin line
		//	g.drawOval(x,y,5,5);  // for thick line
			x=x1;
			y=y1;
		}
	}
}
