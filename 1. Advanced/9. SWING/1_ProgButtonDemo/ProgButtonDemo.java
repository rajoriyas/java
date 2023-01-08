import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ProgButtonDemo extends JFrame {
	Container c;
	JButton b1,b2,b3;
	public ProgButtonDemo() {
		Icon i=new ImageIcon("usr.gif");
		b1=new JButton(i);
		i=new ImageIcon("python.gif");
		b2=new JButton("Ok",i);
		b3=new JButton("Retry");
		c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b1);
		c.add(b2);
		c.add(b3);
		b1.addActionListener(new A());
		setSize(500,500);
		setVisible(true);
	}
	class A implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			c.setBackground(Color.red);
		}	
	}
	public static void main(String args[]) {
		ProgButtonDemo x=new ProgButtonDemo();
	}
}
