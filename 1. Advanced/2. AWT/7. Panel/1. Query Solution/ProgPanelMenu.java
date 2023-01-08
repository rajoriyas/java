import java.awt.*;
import java.awt.event.*;

public class ProgPanelMenu extends Frame implements ActionListener {
	CardLayout c1;
	MenuBar bar;
	Menu first, second;
	MenuItem m1,m2,m3,m4,m5;
	ProgPanel0 a0;
	ProgPanel1 a1;
	ProgPanel2 a2;
	ProgPanel3 a3;
	public ProgPanelMenu() {
		bar=new MenuBar();
		
		first=new Menu("Registration");
		second=new Menu("Query");
		
		m1=new MenuItem("New");
		m2=new MenuItem("Open");
		m3=new MenuItem("Exit");
		m4=new MenuItem("Record");
		m5=new MenuItem("Solution");
		
		setMenuBar(bar);
		
		bar.add(first);
		bar.add(second);
		
		first.add(m1);
		first.add(m2);
		first.add(m3);
		
		second.add(m4);
		second.add(m5);
		
		c1=new CardLayout();
		setLayout(c1);
		
		a0=new ProgPanel0();		
		a1=new ProgPanel1();
		a2=new ProgPanel2();
		a3=new ProgPanel3();
		
		add(a0,"Welcome");		//Panel0 is selected first so it is also a default page.
		add(a1,"Registration Form");
		add(a2,"Query Form");
		add(a3,"Answer Form");
		
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);
		m5.addActionListener(this);
		
		setSize(250,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		MenuItem m=(MenuItem)e.getSource();
		if(m.equals(m3)) {
			System.exit(0);
		}
		if(m.equals(m1)) {
			c1.show(this,"Registration Form");
		}
		if(m.equals(m2)) {
			c1.show(this,"Welcome");
		}
		if(m.equals(m4)) {
			c1.show(this,"Query Form");
		}
		if(m.equals(m5)) {
			c1.show(this,"Answer Form");
		}
	}
	public static void main(String args[]) {
		ProgPanelMenu obj=new ProgPanelMenu();
	}
}