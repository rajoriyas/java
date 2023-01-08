import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class ProgOnlineExam extends Frame {
	CardLayout c1;
	Panel P4, P5;
	P0 p0;
	P1 p1;
	P2 p2;
	P3 p3;
	Button b1,b2;
	public ProgOnlineExam() {
		b1=new Button("Proceed");
		b2=new Button("Back");
		
		setLayout(new GridLayout(2,1));
		
		p0=new P0();
		p1=new P1();
		p2=new P2();
		p3=new P3();
		
		//Container is made
		P4=new Panel();
		P4.setLayout(new CardLayout());
		
		//Conatiner is filled from panel
		P4.add(p0,"Welcome");
		P4.add(p1,"Login");
		P4.add(p2,"Exam");
		P4.add(p3,"Result");
		
		P5=new Panel();
		P5.setLayout(new GridLayout(5,2));
		P5.add(new Label());
		P5.add(new Label());
		P5.add(new Label());
		P5.add(new Label());
		P5.add(new Label());
		P5.add(new Label());
		P5.add(new Label());
		P5.add(new Label());
		P5.add(b1);
		P5.add(b2);
		
		//CardLayout is provided the all Layout 
		c1=(CardLayout)P4.getLayout();
		//Force to show any one panel
		c1.show(P4,"Welcome");
				
		b1.addMouseListener(new A());
		b2.addMouseListener(new B());
		
		add(P4);
		add(P5);
		
		setSize(250,500);
		setVisible(true);
	}
	class A implements MouseListener {
		public void mouseEntered(MouseEvent e) {
			Random rand=new Random();
			int x1=rand.nextInt(255);
			int x2=rand.nextInt(255);
			int x3=rand.nextInt(255);
			Color obj1=new Color(x1,x2,x3);
			b1.setBackground(obj1);
		}
		public void mouseExited(MouseEvent e) {
			b1.setBackground(null);
		}
		public void mouseReleased(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseClicked(MouseEvent e) {
			Button button=(Button)e.getSource();
			if(button.equals(b1)) {
				c1.next(P4);
			}
		}
	}
	class B implements MouseListener {
		public void mouseEntered(MouseEvent e) {
			Random rand=new Random();
			int x1=rand.nextInt(255);
			int x2=rand.nextInt(255);
			int x3=rand.nextInt(255);
			Color obj1=new Color(x1,x2,x3);
			b2.setBackground(obj1);
		}
		public void mouseExited(MouseEvent e) {
			b2.setBackground(null);
		}
		public void mouseReleased(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseClicked(MouseEvent e) {
			Button button=(Button)e.getSource();
			if(button.equals(b2)) {
				c1.previous(P4);
			}
		}
	}
	public static void main(String args[]) {
		ProgOnlineExam obj=new ProgOnlineExam();
	}
}