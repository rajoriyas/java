/*
<applet code = ProgBackgroundDemo width=200 height=100>
</applet>
*/

//Prog set Backgrround Color

import java.applet.Applet;
import java.awt.Color;;
import java.awt.Choice;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ProgBackgroundDemo extends Applet {
	Choice c1;
	public void init() {
		c1=new Choice();
		c1.add("Pink");
		c1.add("Cyan");
		c1.add("Yellow");
		c1.add("Gray");
		
		add(c1);
		
		c1.addItemListener(new A());
	}
	class A implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int i=c1.getSelectedIndex();
			if(i==0) setBackground(Color.pink);
			if(i==1) setBackground(Color.cyan);
			if(i==2) setBackground(Color.yellow);
			if(i==3) setBackground(Color.gray);
		}
	}
}
