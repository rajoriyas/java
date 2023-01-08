//Program to create a basic menu for Library Application

package menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProgMenuDemo extends Frame {
	MenuBar bar;
	Menu first, second;
	MenuItem m1, m2, m3, m4, m5;
	public ProgMenuDemo() {		//Default Constructor
		bar=new MenuBar();
		first=new Menu("Lib");
		second=new Menu("Book");
		m1=new MenuItem("Registration");
		m2=new MenuItem("Delete");
		m3=new MenuItem("Exit");
		m4=new MenuItem("Issue");
		m5=new MenuItem("Deposit");
		setLayout(new FlowLayout());
		setMenuBar(bar);
		bar.add(first);
		bar.add(second);
		first.add(m1);
		first.add(m2);
		first.add(m3);
		second.add(m4);
		second.add(m5);
		m1.addActionListener(new A());
		m2.addActionListener(new A());
		m3.addActionListener(new A());
		m4.addActionListener(new A());
		m5.addActionListener(new A());
		setSize(500,500);
		setVisible(true); 
	}
	class A implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MenuItem m=(MenuItem)e.getSource();
			if(m.equals(m1)) JOptionPane.showMessageDialog(null,"New Registration");
			if(m.equals(m2)) JOptionPane.showMessageDialog(null,"Delete");
			if(m.equals(m3)) System.exit(0);
			if(m.equals(m4)) JOptionPane.showMessageDialog(null,"Issue");
			if(m.equals(m5)) JOptionPane.showMessageDialog(null,"Deposit");
		}
	}
	public static void main(String args[]) {
		ProgMenuDemo obj=new ProgMenuDemo();
	}
}
