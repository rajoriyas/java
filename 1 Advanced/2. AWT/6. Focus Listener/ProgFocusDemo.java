import java.awt.*;
import java.awt.event.*;

public class ProgFocusDemo extends Frame {
	Button b1,b2;
	TextField t1;
	Choice c1;
	public ProgFocusDemo() {
		b1=new Button("OK");
		b2=new Button("Cancel");
		t1=new TextField(20);
		c1=new Choice();
		c1.add("Select Branch");
		c1.add("EIC");
		c1.add("EC");
		c1.add("CS");
		c1.add("IT");
		setLayout(new GridLayout(3,2));
		add(new Label("Name"));
		add(t1);
		add(new Label("Branch"));
		add(c1);
		add(b1);
		add(b2);
		t1.addFocusListener(new tA());
		c1.addFocusListener(new tB());
		b1.addFocusListener(new tC());
		b2.addFocusListener(new tD());
		setSize(250,200);
		setVisible(true);
	}
	class tA implements FocusListener {
		public void focusGained(FocusEvent e) {
			t1.setBackground(Color.yellow);
			t1.setForeground(Color.red);
		}
		public void focusLost(FocusEvent e) {
			t1.setBackground(null);
			t1.setForeground(Color.black);
		}
	}
	class tB implements FocusListener {
		public void focusGained(FocusEvent e) {
			c1.setBackground(Color.yellow);
			c1.setForeground(Color.red);
		}
		public void focusLost(FocusEvent e) {
			c1.setBackground(null);
			c1.setForeground(Color.black);
		}
	}
	class tC implements FocusListener {
		public void focusGained(FocusEvent e) {
			b1.setBackground(Color.yellow);
			b1.setForeground(Color.red);
		}
		public void focusLost(FocusEvent e) {
			b1.setBackground(null);
			b1.setForeground(Color.black);
		}
	}
	class tD implements FocusListener {
		public void focusGained(FocusEvent e) {
			b2.setBackground(Color.yellow);
			b2.setForeground(Color.red);
		}
		public void focusLost(FocusEvent e) {
			b2.setBackground(null );
			b2.setForeground(Color.black);
		}
	}
	public static void main(String args[]) {
		ProgFocusDemo obj=new ProgFocusDemo();
	}
}