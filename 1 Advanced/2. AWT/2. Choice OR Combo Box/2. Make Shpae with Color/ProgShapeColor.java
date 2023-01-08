/*
<applet code = ProgShapeColor width=500 height=750>
</applet>
*/

//Prog set Backgrround Color

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Choice;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ProgShapeColor extends Applet {
	Choice c1,c2,c3,c4;
	int i,j,k,l,f;
	public void init() {
		c1=new Choice();
		c2=new Choice();
		c3=new Choice();
		c4=new Choice();

		c1.add("SELECT SHAPE");
		c1.add("RECT");
		c1.add("CIRCLE");

		c2.add("SELECT COLOR");	
		c2.add("RED");
		c2.add("GREEN");
		c2.add("BLUE");
		
		c3.add("SELECT METHOD");		
		c3.add("DRAW");
		c3.add("FILL");
		
		c4.add("SELECT SIZE");
		c4.add("1X");
		c4.add("2X");
		c4.add("3X");
		c4.add("4X");

		add(c1);
		add(c2);
		add(c3);
		add(c4);
		
		c1.addItemListener(new A());
		c2.addItemListener(new A());
		c3.addItemListener(new A());
		c4.addItemListener(new A());
	}
	class A implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Graphics g=getGraphics();
			g.clearRect(0,0,500,750);
			i=c1.getSelectedIndex();
			if(i==1) {
				j=c2.getSelectedIndex();
				if(j==1) {
					g.setColor(Color.red);
					k=c3.getSelectedIndex();
					if(k==1) {
						l=c4.getSelectedIndex();
						if(l==1) {
							f=1;
							g.drawRect(100,300,f*100,f*100);
						}
						if(l==2) {
							f=2;
							g.drawRect(100,300,f*100,f*100);
						}
						if(l==3) {
							f=3;
							g.drawRect(100,300,f*100,f*100);
						}
						if(l==4) {
							f=4;
							g.drawRect(100,300,f*100,f*100);
						}						
					}
					if(k==2) {
						l=c4.getSelectedIndex();
						if(l==1) {
							f=1;
							g.fillRect(100,300,f*100,f*100);
						}
						if(l==2) {
							f=2;
							g.fillRect(100,300,f*100,f*100);
						}
						if(l==3) {
							f=3;
							g.fillRect(100,300,f*100,f*100);
						}
						if(l==4) {
							f=4;
							g.fillRect(100,300,f*100,f*100);
						}						
					}
				}

				if(j==2) {
					g.setColor(Color.green);
					k=c3.getSelectedIndex();
					if(k==1) {
						l=c4.getSelectedIndex();
						if(l==1) {
							f=1;
							g.drawRect(100,300,f*100,f*100);
						}
						if(l==2) {
							f=2;
							g.drawRect(100,300,f*100,f*100);
						}
						if(l==3) {
							f=3;
							g.drawRect(100,300,f*100,f*100);
						}
						if(l==4) {
							f=4;
							g.drawRect(100,300,f*100,f*100);
						}						
					}
					if(k==2) {
						l=c4.getSelectedIndex();
						if(l==1) {
							f=1;
							g.fillRect(100,300,f*100,f*100);
						}
						if(l==2) {
							f=2;
							g.fillRect(100,300,f*100,f*100);
						}
						if(l==3) {
							f=3;
							g.fillRect(100,300,f*100,f*100);
						}
						if(l==4) {
							f=4;
							g.fillRect(100,300,f*100,f*100);
						}
					}
				}
				if(j==3) {
					g.setColor(Color.blue);
					k=c3.getSelectedIndex();
					if(k==1) {
						l=c4.getSelectedIndex();
						if(l==1) {
							f=1;
							g.drawRect(100,300,f*100,f*100);
						}
						if(l==2) {
							f=2;
							g.drawRect(100,300,f*100,f*100);
						}
						if(l==3) {
							f=3;
							g.drawRect(100,300,f*100,f*100);
						}
						if(l==4) {
							f=4;
							g.drawRect(100,300,f*100,f*100);
						}
					}
					if(k==2) {
						l=c4.getSelectedIndex();
						if(l==1) {
							f=1;
							g.fillRect(100,300,f*100,f*100);
						}
						if(l==2) {
							f=2;
							g.fillRect(100,300,f*100,f*100);
						}
						if(l==3) {
							f=3;
							g.fillRect(100,300,f*100,f*100);
						}
						if(l==4) {
							f=4;
							g.fillRect(100,300,f*100,f*100);
						}
					}
				}
			}	
			if(i==2) {
				j=c2.getSelectedIndex();
				if(j==1) {
					g.setColor(Color.red);
					k=c3.getSelectedIndex();
					if(k==1) {
						l=c4.getSelectedIndex();
						if(l==1) {
							f=1;
							g.drawOval(100,300,f*100,f*100);
						}
						if(l==2) {
							f=2;
							g.drawOval(100,300,f*100,f*100);
						}
						if(l==3) {
							f=3;
							g.drawOval(100,300,f*100,f*100);
						}
						if(l==4) {
							f=4;
							g.drawOval(100,300,f*100,f*100);
						}
					}
					if(k==2) {
						l=c4.getSelectedIndex();
						if(l==1) {
							f=1;
							g.fillOval(100,300,f*100,f*100);
						}
						if(l==2) {
							f=2;
							g.fillOval(100,300,f*100,f*100);
						}
						if(l==3) {
							f=3;
							g.fillOval(100,300,f*100,f*100);
						}
						if(l==4) {
							f=4;
							g.fillOval(100,300,f*100,f*100);
						}
					}
				}

				if(j==2) {
					g.setColor(Color.green);
					k=c3.getSelectedIndex();
					if(k==1) {
						l=c4.getSelectedIndex();
						if(l==1) {
							f=1;
							g.drawOval(100,300,f*100,f*100);
						}
						if(l==2) {
							f=2;
							g.drawOval(100,300,f*100,f*100);
						}
						if(l==3) {
							f=3;
							g.drawOval(100,300,f*100,f*100);
						}
						if(l==4) {
							f=4;
							g.drawOval(100,300,f*100,f*100);
						}
					}
					if(k==2) {
						l=c4.getSelectedIndex();
						if(l==1) {
							f=1;
							g.fillOval(100,300,f*100,f*100);
						}
						if(l==2) {
							f=2;
							g.fillOval(100,300,f*100,f*100);
						}
						if(l==3) {
							f=3;
							g.fillOval(100,300,f*100,f*100);
						}
						if(l==4) {
							f=4;
							g.fillOval(100,300,f*100,f*100);
						}
					}
				}
				if(j==3) {
					g.setColor(Color.blue);
					k=c3.getSelectedIndex();
					if(k==1) {
						l=c4.getSelectedIndex();
						if(l==1) {
							f=1;
							g.drawOval(100,300,f*100,f*100);
						}
						if(l==2) {
							f=2;
							g.drawOval(100,300,f*100,f*100);
						}
						if(l==3) {
							f=3;
							g.drawOval(100,300,f*100,f*100);
						}
						if(l==4) {
							f=4;
							g.drawOval(100,300,f*100,f*100);
						}
					}
					if(k==2) {
						l=c4.getSelectedIndex();
						if(l==1) {
							f=1;
							g.drawRect(100,300,f*100,f*100);
						}
						if(l==2) {
							f=2;
							g.drawRect(100,300,f*100,f*100);
						}
						if(l==3) {
							f=3;
							g.drawRect(100,300,f*100,f*100);
						}
						if(l==4) {
							f=4;
							g.drawRect(100,300,f*100,f*100);
						}
					}
				}
			}
		}			
	}
}

			
	
		
