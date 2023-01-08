import java.awt.*;
import java.awt.event.*;
public class ProgPanelMenu extends Frame {
	CardLayout card;
	MenuBar bar1,bar2;
	Menu first,second,third;
	MenuItem m1,m2,m3,m4,m5;
	P0 panel1;
	P1 panel2;
	P2 panel3;
	Panel Panel0, Container;		//Container
	Button b1,b2;
	public ProgPanelMenu() {
		setBackground(new Color(255,255,204));
		bar1=new MenuBar();
		bar2=new MenuBar();
		
		first=new Menu("File");
		second=new Menu("Edit");
		third=new Menu("View");
		
		m1=new MenuItem("Home");
		m2=new MenuItem("Registration");
		m3=new MenuItem("Deposit");
		m4=new MenuItem("Exit");
		m5=new MenuItem("Login");
		
		b1=new Button("->>");
		b2=new Button("<<-");
		
		setMenuBar(bar1);
	//	setMenuBar(bar2);		can't two bar exist.
		
		bar1.add(first);
		bar1.add(second);
		bar1.add(third);
		
		first.add(m1);
		first.add(m2);
		first.add(m3);
		
		second.add(m4);
		
		third.add(m5);
		
		panel1=new P0();
		panel2=new P1();
		panel3=new P2();
		
		setLayout(new FlowLayout());
		
		Panel0=new Panel();
		Panel0.setLayout(new FlowLayout());
		
		Container=new Panel();
		Container.setLayout(new CardLayout());
		
		Container.add(panel1,"Home");
		Container.add(panel2,"Login");
		Container.add(panel3,"Registration");
		
		m1.addActionListener(new A());
		m2.addActionListener(new A());
		m3.addActionListener(new A());
		m4.addActionListener(new A());
		m5.addActionListener(new A());
		
		b1.addActionListener(new B());
		b2.addActionListener(new B());
		
		card=(CardLayout)Container.getLayout();
		card.show(Container,"Home");
		
		add(Container);
		add(Panel0);
		
		Panel0.add(b2); 
		Panel0.add(b1);
				
		setSize(700,600);
		setVisible(true);
	}
	class B implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String b=e.getActionCommand();
			if(b.equals("->>")) {
				card.next(Container);
			}
			else if(b.equals("<<-")) {
				card.previous(Container);
			}
		}
	}
	class A implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MenuItem m=(MenuItem)e.getSource();
			if(m.equals(m1)) {
				card.first(Container);
			}
			else if(m.equals(m2)) {
				card.show(Container,"Login");
			}
			else if(m.equals(m3)) {
				card.last(Container);
			}
			else if(m.equals(m4)) {
				System.exit(0);
			}
			else if(m.equals(m5)) {
				card.show(Container,"Login");
			}
		}
	}
	public static void main(String args[]) {
		ProgPanelMenu obj=new ProgPanelMenu();
	}
}
			
			
		
		