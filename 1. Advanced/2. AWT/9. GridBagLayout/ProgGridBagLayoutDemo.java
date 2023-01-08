import java.awt.*;
import java.awt.event.*;
public class ProgGridBagLayoutDemo extends Frame {
	GridBagConstraints gbc;
	TextField t2;
	Button b1;
	public ProgGridBagLayoutDemo() {
		setBackground(Color.white);
		gbc = new GridBagConstraints();
		setLayout(new GridBagLayout());
		gbc.insets=new Insets(2,2,2,2);
		
		Font font= new Font("Comic Sans MS",Font.BOLD,20);
		Label l1=new Label("9272.com",Label.CENTER);
		l1.setFont(font);
		gbc.gridx=0;
		gbc.gridy=0;
		add(l1,gbc);
				
		Font font2= new Font("Comic Sans MS",Font.BOLD,12);
		setFont(font2);
		Label l2=new Label("Name");
		gbc.gridx=0;
		gbc.gridy=1;
		add(l2,gbc);
		
		TextField t1=new TextField(12);
		gbc.gridx=1;
		gbc.gridy=1;
		add(t1,gbc);
		
		Label l3=new Label("DOB");
		gbc.gridx=0;
		gbc.gridy=2;
		add(l3,gbc);
		
		t2=new TextField(12);
		gbc.gridx=1;
		gbc.gridy=2;
		add(t2,gbc);
		t2.setForeground(Color.gray);
		t2.setText("YYYY/MM/DD");
		
		Label l4=new Label("Birth Place");
		gbc.gridx=0;
		gbc.gridy=3;
		add(l4,gbc);
		
		TextField t3=new TextField(12);
		gbc.gridx=1;
		gbc.gridy=3;
		add(t3,gbc);
		
		Label l5=new Label("Religion");
		gbc.gridx=0;
		gbc.gridy=4;
		add(l5,gbc);
		
		TextField t4=new TextField(12);
		gbc.gridx=1;
		gbc.gridy=4;
		add(t4,gbc);
		
		b1=new Button("Finished");
		gbc.gridx=0;
		gbc.gridy=5;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		add(b1,gbc);
		
		t2.addFocusListener(new A());
		addWindowListener(new B());
		b1.addActionListener(new C());
				
		setSize(220,270);
		setVisible(true);	
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawLine(10,75, 210, 75);
	}
	class A implements FocusListener {
		public void focusGained(FocusEvent e ) {
			if(t2.getText().equals("YYYY/MM/DD")) {
				t2.setText("");
				t2.setForeground(Color.black);
			}
		}
		public void focusLost(FocusEvent e ) {
			if(t2.getText().equals("")) {
				t2.setForeground(Color.gray);
				t2.setText("YYYY/MM/DD");
			}
		}
	}
	class B implements WindowListener {
		public void windowClosing(WindowEvent e) {
			dispose();
		}
		public void windowDeactivated(WindowEvent e) {
		}
		public void windowActivated(WindowEvent e) {
		}
		public void  windowDeiconified(WindowEvent e) {
		}
		public void  windowIconified(WindowEvent e) {
		}
		public void  windowClosed(WindowEvent e) {
		}
		public void windowOpened(WindowEvent e) {
		}
	}
	class C implements ActionListener {
		public void actionPerformed(ActionEvent e)  {
			System.exit(0);
		}
	}
	public static void main(String args[]) {
		new ProgGridBagLayoutDemo();	
	}
}