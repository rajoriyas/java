/*
<applet code=ProgEnggDemo width=500 height=200>
</applet>
*/

//Prog to show exam 
import java.applet.Applet;
import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ProgEnggDemo extends Applet {
	Choice c1,c2,c3;
	public void init() {
		c1=new Choice();
		c2=new Choice();
		c3=new Choice();

		c1.add("BRANCH");
		c1.add("EC");
		c1.add("EIC");
		c1.add("CS");
		c1.add("IT");
		
		c2.add("SEM");
		c2.add("1st");
		c2.add("2nd");
		c2.add("3rd");
		c2.add("4th");
		c2.add("5th");
		c2.add("6th");
		c2.add("7th");
		c2.add("8th");

		c3.add("Exam");

		add(c1);		
		add(c2);
		add(c3);

		c1.addItemListener(new A());
		c2.addItemListener(new A());
		c3.addItemListener(new A());
	}
	class A implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int i=c1.getSelectedIndex();
			if(i==1) {
				int j=c2.getSelectedIndex();
				if(j==1) {
					c3.add("EC 2016-17");
				}
				if(j==2) {
					c3.removeAll();
					c3.add("EC 2017");
				}
				if(j==3) {
					c3.removeAll();
					c3.add("EC 2017-18");
				}
				if(j==4) {
					c3.removeAll();
					c3.add("EC 2018");
				}
				if(j==5) {
					c3.removeAll();
					c3.add("EC 2018-19");
				}
				if(j==6) {
					c3.removeAll();
					c3.add("EC 2019");
				}
				if(j==7) {
					c3.removeAll();
					c3.add("EC 2019-20");
				}
				if(j==8) {
					c3.removeAll();
					c3.add("EC 2020");
				}
			}
			if(i==2) {
				int j=c2.getSelectedIndex();
				if(j==1) {
					c3.add("EIC 2016-17");
				}
				if(j==2) {
					c3.removeAll();
					c3.add("EIC 2017");
				}
				if(j==3) {
					c3.removeAll();
					c3.add("EIC 2017-18");
				}
				if(j==4) {
					c3.removeAll();
					c3.add("EIC 2018");
				}
				if(j==5) {
					c3.removeAll();
					c3.add("EIC 2018-19");
				}
				if(j==6) {
					c3.removeAll();
					c3.add("EIC 2019");
				}
				if(j==7) {
					c3.removeAll();
					c3.add("EIC 2019-20");
				}
				if(j==8) {
					c3.removeAll();
					c3.add("EIC 2020");
				}
			}
			if(i==3) {
				int j=c2.getSelectedIndex();
				if(j==1) {
					c3.add("CS 2016-17");
				}
				if(j==2) {
					c3.removeAll();
					c3.add("CS 2017");
				}
				if(j==3) {
					c3.removeAll();
					c3.add("CS 2017-18");
				}
				if(j==4) {
					c3.removeAll();
					c3.add("CS 2018");
				}
				if(j==5) {
					c3.removeAll();
					c3.add("CS 2018-19");
				}
				if(j==6) {
					c3.removeAll();
					c3.add("CS 2019");
				}
				if(j==7) {
					c3.removeAll();
					c3.add("CS 2019-20");
				}
				if(j==8) {
					c3.removeAll();
					c3.add("CS 2020");
				}
			}
			if(i==4) {
				int j=c2.getSelectedIndex();
				if(j==1) {
					c3.add("IT 2016-17");
				}
				if(j==2) {
					c3.removeAll();
					c3.add("IT 2017");
				}
				if(j==3) {
					c3.removeAll();
					c3.add("IT 2017-18");
				}
				if(j==4) {
					c3.removeAll();
					c3.add("IT 2018");
				}
				if(j==5) {
					c3.removeAll();
					c3.add("IT 2018-19");
				}
				if(j==6) {
					c3.removeAll();
					c3.add("IT 2019");
				}
				if(j==7) {
					c3.removeAll();
					c3.add("IT 2019-20");
				}
				if(j==8) {
					c3.removeAll();
					c3.add("IT 2020");
				}
			}
		}
	}
}

				
