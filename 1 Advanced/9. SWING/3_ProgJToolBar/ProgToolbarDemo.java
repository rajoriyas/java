import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ProgToolbarDemo extends JFrame {
	JToolBar tb;
	JButton b1,b2,b3;
	Container c;
	public ProgToolbarDemo() {
		tb=new JToolBar();
		b1=new JButton("Cut");
		b2=new JButton("Copy");
		b3=new JButton("Paste");
		tb.add(b1);
		tb.addSeparator();
		tb.add(b2);
		tb.addSeparator();
		tb.add(b3);
		c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(tb);
		
		setSize(500,500);
		setVisible(true);
	}	
	public static void main(String args[]) {
		ProgToolbarDemo x=new ProgToolbarDemo();
	}
}
