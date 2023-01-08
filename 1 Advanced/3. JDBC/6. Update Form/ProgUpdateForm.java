import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class ProgUpdateForm extends Frame implements ActionListener {
	Button b1,b2;
	TextField t0,t1,t2,t3,t4,t5,t6,t7,t8,t9;
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	Choice c1;
	GridBagConstraints gbc1, gbc2, gbc3;
	GridBagLayout gbl2, gbl3;
	Panel P1,P2;
	public ProgUpdateForm() {
		P1=new Panel();
		P2=new Panel();
				
		setLayout(new GridLayout(2,1));
		
		gbl2=new GridBagLayout();
		P1.setLayout(gbl2);
		gbc2=new GridBagConstraints();
		gbc2.insets=new Insets(2,2,2,2);
		
		gbl3=new GridBagLayout();
		P2.setLayout(gbl3);
		gbc3=new GridBagConstraints();
		gbc3.insets=new Insets(2,2,2,2);

		 l1=new Label("Registration No.");
		gbc2.gridx=0;
		gbc2.gridy=0;
		P1.add(l1,gbc2);

		t1=new TextField(15);
		gbc2.gridx=1;
		gbc2.gridy=0;
		P1.add(t1,gbc2);

		t0=new TextField(15);
		t0.setEditable(false);
		gbc2.gridx=1;
		gbc2.gridy=0;
		P1.add(t0,gbc2);

		b1=new Button("Procced");
		gbc2.gridx=2;
		gbc2.gridy=0;
		gbc2.gridwidth=1;
		gbc2.gridheight=1;
		gbc2.fill=GridBagConstraints.BOTH;
		P1.add(b1,gbc2);

		l2=new Label("Name");
		gbc2.gridx=0;
		gbc2.gridy=2;
		gbc2.gridwidth=1;
		gbc2.fill=GridBagConstraints.HORIZONTAL;
		P1.add(l2,gbc2);

		t2=new TextField(15);
		gbc2.gridx=1;
		gbc2.gridy=2;	
		t2.setEditable(false);
		P1.add(t2,gbc2);

		t3=new TextField(15);
		gbc2.gridx=2;
		gbc2.gridy=2;
		P1.add(t3,gbc2);

		l3=new Label("College Roll No.");
		gbc2.gridx=0;
		gbc2.gridy=3;
		gbc2.gridwidth=1;
		gbc2.fill=GridBagConstraints.HORIZONTAL;
		P1.add(l3,gbc2);

		t4=new TextField(15);
		gbc2.gridx=1;
		gbc2.gridy=3;	
		t4.setEditable(false);
		P1.add(t4,gbc2);

		t5=new TextField(15);
		gbc2.gridx=2;
		gbc2.gridy=3;
		P1.add(t5,gbc2);

		l4=new Label("Branch");
		gbc2.gridx=0;
		gbc2.gridy=4;
		gbc2.gridwidth=1;
		gbc2.fill=GridBagConstraints.HORIZONTAL;
		P1.add(l4,gbc2);

		t6=new TextField(15);
		gbc2.gridx=1;
		gbc2.gridy=4;	
		t6.setEditable(false);
		P1.add(t6,gbc2);

		c1=new Choice();
		c1.add("Select Branch");
		c1.add("EC");
		c1.add("EIC");
		c1.add("CS");
		c1.add("IT");
		gbc2.gridx=2;
		gbc2.gridy=4;
		gbc2.gridwidth=1;
		gbc2.gridheight=1;
		gbc2.fill=GridBagConstraints.BOTH;
		P1.add(c1,gbc2);
		
		gbc2.gridx=0;
		gbc2.gridy=5;
		gbc2.gridwidth=1;
		gbc2.gridheight=1;
		gbc2.fill=GridBagConstraints.BOTH;
		P1.add(new Label(),gbc2);
		
		b2=new Button("Update");
		gbc2.gridx=1;
		gbc2.gridy=5;
		gbc2.gridwidth=1;
		gbc2.gridheight=2;
		gbc2.fill=GridBagConstraints.BOTH;
		P1.add(b2,gbc2);
		
		gbc2.gridx=1;
		gbc2.gridy=6;
		gbc2.gridwidth=1;
		gbc2.gridheight=1;
		gbc2.fill=GridBagConstraints.BOTH;
		P1.add(new Label(),gbc2);
		
		l5=new Label("Updated Entry",Label.CENTER);
		gbc3.gridx=0;
		gbc3.gridy=0;
		gbc3.gridwidth=2;
		gbc3.fill=GridBagConstraints.HORIZONTAL;
		Font font=new Font("arial", Font.BOLD, 16);
		l5.setFont(font);
		P2.add(l5,gbc3);
		
		l6=new Label("Name");
		gbc3.gridx=0;
		gbc3.gridy=1;
		gbc3.gridwidth=1;
		gbc3.fill=GridBagConstraints.HORIZONTAL;
		P2.add(l6,gbc3);

		t7=new TextField(15);
		gbc3.gridx=1;
		gbc3.gridy=1;	
		t7.setEditable(false);
		P2.add(t7,gbc3);	
		
		l7=new Label("College Roll No.");
		gbc3.gridx=0;
		gbc3.gridy=2;
		P2.add(l7,gbc3);
		
		t8=new TextField(15);
		gbc3.gridx=1;
		gbc3.gridy=2;	
		t8.setEditable(false);
		P2.add(t8,gbc3);
		
		l8=new Label("Branch");
		gbc3.gridx=0;
		gbc3.gridy=3;
		P2.add(l8,gbc3);
		
		t9=new TextField(15);
		gbc3.gridx=1;
		gbc3.gridy=3;	
		t9.setEditable(false);
		P2.add(t9,gbc3);
				
		add(P1);
		add(P2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		Button b=(Button)e.getSource();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/regno","root","root");	
			PreparedStatement pst;
			ResultSet rs;
	//		Statement st=cn.createStatement();
			if(b.equals(b1)) {
				//sql code
				String insert="select * from tables where regno=?";
				//prepared statement 
				pst=cn.prepareStatement(insert);
				int regno=Integer.parseInt(t1.getText());
				pst.setInt(1,regno);

				//ResultSet wants only for show
				rs=pst.executeQuery();
				t1.setVisible(false);		
				t0.setText(t1.getText());
				if(rs.next()) {
					t2.setText(rs.getString(2));
					t4.setText(rs.getString(3));
					t6.setText(rs.getString(4));
				}
				else {
					t1.setText("Invalid Reg. No.");
					t1.setVisible(true);
				}
			}
			if(b.equals(b2)) {
				String update="update tables set name=?, clgrollno=?, branch=? where regno=?";
				
				pst=cn.prepareStatement(update);
				
				int regno=Integer.parseInt(t1.getText());
				pst.setInt(4,regno);
				
				String name=t3.getText();
				pst.setString(1,name);
				
				String clgrollno=t5.getText();
				pst.setString(2,clgrollno);
				
				String branch=c1.getSelectedItem();
				pst.setString(3,branch);
				
				pst.executeUpdate();
								
				String insert="select * from tables where regno=?";
				pst=cn.prepareStatement(insert);
				pst.setInt(1,regno);
				rs=pst.executeQuery();
				if(rs .next()) {
					t7.setText(rs.getString(2));
					t8.setText(rs.getString(3));
					t9.setText(rs.getString(4));
				}
			}	
			cn.close();
		}
		catch(Exception exp) {
			System.out.println(exp);
		}
	}
	public static void main(String args[]) {
		ProgUpdateForm obj=new ProgUpdateForm();
	}
}
