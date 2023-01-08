/*<Applet code = ProgBoxDemo width = 1000 height = 1000>
  </Applet>*/
import java.applet.Applet;
import java.awt.*;
public class ProgBoxDemo extends Applet {
	int a=0;
	public void paint(Graphics g) {
		for( ; ; ) {
			g.clearRect(0,0,1000,1000);
			if(a==0) {
				g.drawRect(200,200,300,400);
				g.drawLine(200,200,350,58);
				g.drawLine(350,58,650,58);
				g.drawLine(650,58,500,200);
				g.drawLine(650,58,650,458);
				g.drawLine(650,458,500,600);
				g.drawString("BOX",600,600);
				a=1;
			}
			else if(a==1) {
				g.drawRect(200,200,300,400);
				g.drawString("Front View",600,600);
				a=2;
			}
			else if(a==2) {
				g.drawRect(200,200,200,400);
				g.drawString("Top View",600,600);
				a=3;
			}
			else {
				g.drawRect(200,200,400,300);
				g.drawString("Side View",600,600);
				a=0;
			}
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
			}
		}
	}
}
