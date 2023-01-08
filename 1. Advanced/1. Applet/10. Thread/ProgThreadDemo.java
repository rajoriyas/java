/*<Applet code = ProgThreadDemo width = 500 height = 500>
</Applet>*/
import java.applet.*;
import java.awt.*;

public class ProgThreadDemo extends Applet {
	public void paint(Graphics g) {
		int a=0;
		for( ; ; ) {
			g.clearRect(0,0,500,500);
			if(a == 0) {
				g.drawRect(100,100,100,100);
				a=1;
			}
			else {
				g.drawLine(100,200,200,200);
				g.drawLine(100,200,150,100);
				g.drawLine(200,200,150,100);
				a=0;
			}
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
			}
		}
	}
}
