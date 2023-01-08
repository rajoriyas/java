import java.applet.*; 
import java.awt.*;
import java.awt.event.*;
public class MouseMotionListenerProg extends Applet {
	public void init() {		//initilizing method
		addMouseMotionListener(new A());
	}
	class A implements MouseMotionListener {
		public void mouseMoved(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(Color.black);
			g.drawRect(100,100,100,100);
			g.drawLine(100,100,150,150);	
			g.drawLine(100,200,150,150);
			g.drawLine(200,200,150,150);
			g.drawLine(200,100,150,150);
			
		}
		public void mouseDragged(MouseEvent e) {			
			Graphics g = getGraphics();
			g.setColor(Color.black);
			g.drawRect(100,100,100,100);
			g.setColor(Color.red);
			g.drawLine(100,100,150,150);
			g.setColor(Color.cyan);		
			g.drawLine(100,200,150,150);
			g.setColor(Color.blue);
			g.drawLine(200,200,150,150);
			g.setColor(Color.green);
			g.drawLine(200,100,150,150);
		}
			
	}
	
}


