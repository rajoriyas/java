/*
<Applet code="ProgBubblingDemo" width=500 height=500>
</Applet>
*/

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.lang.Thread;

public class ProgBubblingDemo extends Applet {
	public void paint(Graphics g) {
	//Can't declare Graphics g = getGraphics();
		int x=0,y=0,w=10;
		for(int i=0;i<50;i++) {
			g.drawOval(x,y,w,w);
			x += 4;
			y += 4;
			w += 4;
			try {		
				Thread.sleep(500);
			}
			catch(Exception e) {
			}
		}
	}
}

