package listcomponents;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ProgListComp extends Frame {
	List l1,l2;
	Button b1,b2;
	public ProgListComp() {
		l1=new List();
		l2=new List();
		b1=new Button(">>");
		b2=new Button("<<");
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		setLayout(new FlowLayout());
		add(l1);
		add(b1);
		add(b2);
		add(l2);
		b1.addActionListener(new A());
		b2.addActionListener(new A());
/*		l1.addItemListener(new B());
		l2.addItemListener(new B());*/
		l1.addActionListener(new B());
		l2.addActionListener(new B());
		setSize(500,150);
		setVisible(true);
	}
	class A implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try{
				Button b=(Button)e.getSource();
				if(b.equals(b1)) l2.add(l1.getSelectedItem());			//can be replaced by getSelectedIndex()
				if(b.equals(b2)) l2.remove(l2.getSelectedItem());
			}
			catch(IllegalArgumentException exp) {
				JOptionPane.showMessageDialog(null,"'>>' for list 1st and '<<' for list 2nd");
			}
		}
	}
/*	class B implements ItemListener {								//use for single click
		public void itemStateChanged(ItemEvent e) {
			List l=(List)e.getSource();
			if(l.equals(l1)) l2.add(l1.getSelectedItem());
			if(l.equals(l2)) l2.remove(l2.getSelectedItem());
		}
	}*/
	class B implements ActionListener {								//use for single click
		public void actionPerformed(ActionEvent e) {
			List l=(List)e.getSource();
			if(l.equals(l1)) l2.add(l1.getSelectedItem());
			if(l.equals(l2)) l2.remove(l2.getSelectedItem());
		}
	}
	public static void main(String args[]) {
		ProgListComp obj=new ProgListComp();
	}
}