//Program to create frame 

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ProgRadioOval extends Frame {
	CheckboxGroup obj;
	Checkbox c1,c2,c3,c4;
	public ProgRadioOval() {
		obj=new CheckboxGroup();
		c1=new Checkbox("1X",true,obj);
		c2=new Checkbox("2X",true,obj);
		c3=new Checkbox("3X",true,obj);	//c3=new Checkbox("3X",obj,true);
		c4=new Checkbox("4X",true,obj);
		
		setLayout(new FlowLayout());
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		
		c1.addItemListener(new A());
		c2.addItemListener(new A());
		c3.addItemListener(new A());
		c4.addItemListener(new A());
		
		setSize(500,500);
		setVisible(true);
	}
	class A implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Graphics g=getGraphics();
			g.clearRect(0,0,500,500);
			int h=0;
			if(c1.getState()) h=1;
			if(c2.getState()) h=2;
			if(c3.getState()) h=3;
			if(c4.getState()) h=4;
			
			h=h*50;
			g.drawOval(150,150,h,h);
		}
	}
	public static void main(String args[]) {
		ProgRadioOval obj = new ProgRadioOval();
	}
}
