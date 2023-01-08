
/*
<applet code=ProgRadioBox width=500 height=500>
</applet>
*/

//Program to learn the use radio box 

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ProgRadioBox extends Applet {
	CheckboxGroup obj;
	Checkbox c1,c2,c3,c4;
	public void init() {
		obj=new CheckboxGroup();
		c1=new Checkbox("1X",false,obj); //in case of false 1st is selected
		c2=new Checkbox("2X",false,obj);
		c3=new Checkbox("3X",false,obj);
		c4=new Checkbox("4X",false,obj);
	
		add(c1);
		add(c2);
		add(c3);
		add(c4);

		c1.addItemListener(new A());
		c2.addItemListener(new A());
		c3.addItemListener(new A());
		c4.addItemListener(new A());
	}
	public void paint(Graphics g) {
		g.drawOval(150,150,50,50);
	}
	class A implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Graphics g=getGraphics();
			g.clearRect(0,0,500,500);
			int h=1;
			if(c2.getState()) h=2;
			if(c3.getState()) h=3;
			if(c4.getState()) h=4;
			
			h=h*50;
			g.drawOval(150,150,h,h);
		}
	}
}
				
