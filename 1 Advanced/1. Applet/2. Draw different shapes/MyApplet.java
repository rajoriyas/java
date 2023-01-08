import java.applet.Applet; //import java.applet.*;
import java.awt.Color; //import java.awt.*;
import java.awt.Graphics;

public class MyApplet extends Applet {
	public void paint (Graphics g) {
		g.drawLine(10, 100, 100, 100);
		g.drawString("Line" , 10, 120);

		g.drawRect(10, 140, 100, 30);
		g.drawString("Rectangle", 10, 190);
		
		g.drawOval(10,210, 100, 30);
		g.drawString("Hyperbola", 10, 260);
		
		g.drawArc(10, 280, 100, 30, 25,155);
		g.drawString("Arc", 10, 315);

		g.drawRoundRect(150, 100, 100, 30, 10, 10);
		g.drawString("Round Rectangle", 150, 150);
		
		int x[] = {150, 180, 230};
		int y[] = {170, 210, 240};
		g.drawPolygon(x, y, 3); //3 number of sides
		g.drawString("Polygen", 150, 260);
	}
}
