import java.awt.*;
import java.awt.event.*;
public class ProgPanel0 extends Panel {
	Label l1,l2,l3,l4,l5;
	public ProgPanel0() {
		l1=new Label("Welcome");
		l2=new Label("To");
		l3=new Label("Query");
		l4=new Label("Management");
		l5=new Label("System");
		l1.setBackground(Color.red);
		l2.setBackground(Color.pink);
		l3.setBackground(Color.orange);
		l4.setBackground(Color.yellow);
		l5.setBackground(Color.blue);
		l1.setForeground(Color.blue);
		l2.setForeground(Color.yellow);	
		l3.setForeground(Color.black);
		l4.setForeground(Color.pink);
		l5.setForeground(Color.red);
		l1.setFont(new Font("arial",Font.BOLD,36));
		l2.setFont(new Font("arial",Font.BOLD,36));
		l3.setFont(new Font("arial",Font.BOLD,36));
		l4.setFont(new Font("arial",Font.BOLD,36));
		l5.setFont(new Font("arial",Font.BOLD,36));
		setLayout(new GridLayout(5,1));
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
	}
}
				   