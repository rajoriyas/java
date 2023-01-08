/*
<Applet code = "ProgCarMove" width = "1000" height = "500">
</Applet>
*/

import java.applet.*;
import java.awt.*;
import java.lang.*;

public class ProgCarMove extends Applet {
	public void paint(Graphics g) {
		g.drawLine(125,252,875,252);
		int x=100;
		for(int i=0;i<700;i++) {			//never use while loop
			g.clearRect(0,0,1000,251);
			g.drawRoundRect(x,50,200,150,10,10);
			g.drawOval(x+25,200,50,50);
			g.drawOval(x+125,200,50,50);
			x += 1;
			if(x==700) {
				x=1;
				i=0;
			}
			try {
				Thread.sleep(5);		
			}
			catch(Exception e) {
			}
		}
	}
}
			
