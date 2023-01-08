import java.applet.*;
import java.awt.*;
public class MyApplet extends Applet {
	public void paint(Graphics g) {
		Color obj = new Color(1,1,1);
		g.setColor(obj);
		g.drawOval(200,200,100,100);
		g.drawOval(225,215,20,10);
		g.drawOval(255,215,20,10);
		g.drawLine(250,240,250,260);
		g.drawArc(225,275,50,20,25,135);

		Font obj2 = new Font("arial", Font.BOLD+Font.ITALIC,18);
		g.setFont(obj2);
		g.drawString("Hello World!",200,320);
		
		//Color obj3 = new Color(255,255,255);
		setBackground(Color.blue);
	}
}
