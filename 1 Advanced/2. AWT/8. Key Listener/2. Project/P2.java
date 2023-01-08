import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class P2 extends Panel {
	TextField t1,t2,t3,t4,t5,t6,t7,t8;
	Button b1;
	CheckboxGroup obj;
	Checkbox chk1,chk2,chk3;
	Choice c1,c2;
	Random rand=new Random();
	double reg;
	public P2() {
		setBackground(new Color(255,255,204));
		setLayout(new GridLayout(10,2,0,0));
		setFont(new Font("Comic Sans MS",Font.BOLD,18));
		c1=new Choice();
		c1.add("Select Branch");
		c1.add("EC");
		c1.add("EIC");
		c1.add("CS");
		
		c2=new Choice();
		c2.add("Select Year");
		c2.add("1st");
		c2.add("2nd");
		c2.add("3rd");
		c2.add("4th");
		c2.add("5th");
		c2.add("6th");
		c2.add("7th");
		c2.add("8th");
		
		t1=new TextField(20);
		t1.setEditable(false);
		t2=new TextField(20);
		t3=new TextField(20);
		t4=new TextField(20);
		t4.setEditable(false);
		t5=new TextField(20);
		t5.setEditable(false);
		t6=new TextField(20);
		t7=new TextField(20);
		t8=new TextField(20);
		
		obj=new CheckboxGroup();
		chk1=new Checkbox("BTECH",false,obj);
		chk2=new Checkbox("MTECH",false,obj);
		
		chk3=new Checkbox("Read T&C");
		
		b1=new Button("Finished");
		
		setLayout(new GridLayout(11,3));
		add(new Label("Reg. No.",Label.CENTER));
		
		reg=rand.nextInt(999999)+100000;
		t1.setText(""+reg);
		
		add(new Label());
		add(t1);
		add(new Label("Name",Label.CENTER));
		add(t2);
		add(t3);
		add(new Label("Branch",Label.CENTER));
		add(chk1);
		add(chk2);
		add(new Label());
		add(t4);
		add(new Label());
		add(new Label("Semester",Label.CENTER));
		add(new Label());	
		add(c2);
		add(new Label("Fee",Label.CENTER));
		add(new Label());
		add(t6);
		add(chk3);
		add(new Label());
		add(new Label());
		add(new Label());
		add(b1);
		add(new Label());
				
		chk1.addItemListener(new A());
		chk2.addItemListener(new A());
		chk3.addItemListener(new B());
		b1.addActionListener(new C());
	//	p1.addWindowListener(new D());		window listener doesn't work on panel, they only work on frame
			
	}
	class A implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(chk1.getState()) t4.setText(chk1.getLabel());
			if(chk2.getState()) t4.setText(chk2.getLabel());
		}
	}
	class B implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(chk3.getState()) chk3.setLabel("Accepted");
			else chk3.setLabel("Read T&C");
		}
	}
	class C implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Button b=(Button)e.getSource();
			if(b.equals(b1)) System.exit(0);
		}
	}
/*	class D extends WindowAdapter {
		public void windowOpened(WindowEvent e) {
			double reg=rand.nextInt(999999)+100000;
			t1.setText(""+reg);
		}
	}	*/
}

	
		
		
			
		
		