import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class P1 extends Panel {
	Choice c1,c2;
	TextField t1,t2,t3;
	public P1() {
		setBackground(new Color(255,255,204));
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		c1=new Choice();
		c1.add("Select Branch");
		c1.add("EC");
		c1.add("EIC");
		c1.add("CS");
		c2=new Choice();
		c2.add("Select Sem.");
		c2.add("1st");
		c2.add("2nd");
		c2.add("3rd");
		c2.add("4th");
		c2.add("5th");
		c2.add("6th");
		c2.add("7th");
		c2.add("8th");
		
		setLayout(new GridLayout(10,2,0,0));
		setFont(new Font("Comic Sans MS",Font.BOLD,18));
		add(new Label("Name"));
		add(t1);
		add(new Label());
		add(new Label());
		add(new Label("Clg. Roll No."));
		add(t2);
		add(new Label());
		add(new Label());
		add(new Label("Univ. Roll No."));
		add(t3);
		add(new Label());
		add(new Label());
		add(new Label("Branch"));
		add(c1);
		add(new Label());
		add(new Label());
		add(new Label("Semester"));
		add(c2);
		add(new Label());
		add(new Label());
		
		c1.addMouseListener(new C());
		c2.addMouseListener(new D());	
		t1.addFocusListener(new tE());
		t2.addFocusListener(new tF());
		t3.addFocusListener(new tG());
	}
	class C extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			Random rand=new Random();
			int x=rand.nextInt(255);
			int y=rand.nextInt(255);
			int z=rand.nextInt(255);
			Color obj=new Color(x,y,z);
		//	Color obj2=new Color(z,y,x);
			c1.setForeground(obj);
		//	c1.setBackground(obj2);		error rutime see in program
		}
		public void mouseExited(MouseEvent e) {
			c1.setForeground(Color.black);
		}
		public void mouseClicked(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
		}
	}
	class D extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			Random rand=new Random();
			int x=rand.nextInt(255);
			int y=rand.nextInt(255);
			int z=rand.nextInt(255);
			Color obj=new Color(x,y,z);
			c2.setForeground(obj);
		}
		public void mouseExited(MouseEvent e) {
			c2.setForeground(Color.black);
		}
		public void mouseClicked(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
		}
	}
	class tE extends FocusAdapter {
		public void focusGained(FocusEvent e) {
			Random rand=new Random();
			int x=rand.nextInt(255);
			int y=rand.nextInt(255);
			int z=rand.nextInt(255);
			Color obj=new Color(x,y,z);
			t1.setBackground(obj);
		}
		public void focusLost(FocusEvent e) {
			t1.setBackground(null);
		}
	}
	class tF extends FocusAdapter {
		public void focusGained(FocusEvent e) {
			Random rand=new Random();
			int x=rand.nextInt(255);
			int y=rand.nextInt(255);
			int z=rand.nextInt(255);
			Color obj=new Color(x,y,z);
			t2.setBackground(obj);
		}
		public void focusLost(FocusEvent e) {
			t2.setBackground(null);
		}
	}
	class tG extends FocusAdapter {
		public void focusGained(FocusEvent e) {
			Random rand=new Random();
			int x=rand.nextInt(255);
			int y=rand.nextInt(255);
			int z=rand.nextInt(255);
			Color obj=new Color(x,y,z);
			t3.setBackground(obj);
		}
		public void focusLost(FocusEvent e) {
			t3.setBackground(null);
		}
	}
}
		