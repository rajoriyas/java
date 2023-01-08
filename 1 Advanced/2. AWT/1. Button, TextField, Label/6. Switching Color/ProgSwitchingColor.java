/*
<applet code = ProgSwitchingColor width=200 height=100>
</applet>
*/

//Program to show Color Scheme
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ProgSwitchingColor extends Applet {
	Button b1,b2,b3;
	public void init() {
		b1=new Button("RED");
		b2=new Button("GREEN");
		b3=new Button("BLUE");
		
		add(b1);
		add(b2);
		add(b3);

		b1.addActionListener(new A());
		b2.addActionListener(new A());
		b3.addActionListener(new A());
	}
	class A implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Button b=(Button)e.getSource();
		//	Color obj=new Color(f,f,f,.5f); 	//4th for transparency
			b1.setBackground(null);
			b2.setBackground(null);
			b3.setBackground(null);
			if(b.equals(b1)) {
				b2.setBackground(Color.red);
			}
			if(b.equals(b2)) {
				b3.setBackground(Color.green);
			}
			if(b.equals(b3)) {
				b1.setBackground(Color.blue);
			}
		}
	}
}

