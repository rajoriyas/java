import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class MyApplet extends Applet {
	public void paint(Graphics g) {
		int x[] = {100,200,150};
		int y[] = {150,400,550};
		Color obj = new Color(155,52,05);
		g.setColor(obj);
		g.drawPolygon(x,y,3);
	}
}
