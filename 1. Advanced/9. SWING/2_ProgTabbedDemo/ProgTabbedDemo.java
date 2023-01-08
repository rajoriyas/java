import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ProgTabbedDemo extends JFrame {
	JTabbedPane tab;
	JPanel p1,p2;
	JButton b1,b2;
	JTextField t1,t2,t3,t4,t5;
	
	public ProgTabbedDemo() {
		tab=new JTabbedPane();
		p1=new JPanel();
		p2=new JPanel();
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		b1=new JButton("Ok");
		b2=new JButton("Ok");

		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		
		p1.add(new JLabel("user"));
		p1.add(t1);
		p1.add(new JLabel("Password"));
		p1.add(t2);
		p1.add(b1);


		p2.add(new JLabel("Name"));
		p2.add(t3);
		p2.add(new JLabel("Branch"));
		p2.add(t4);
		p2.add(new JLabel("Semester"));
		p2.add(t5);
		p2.add(b2);

		tab.add(p1,"Login");
		tab.add(p2,"Registration");
		c.add(tab);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[]) {
		ProgTabbedDemo x=new ProgTabbedDemo();
	}
}
