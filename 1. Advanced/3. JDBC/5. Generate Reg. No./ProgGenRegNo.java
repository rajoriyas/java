//Program to generate registration number in database & layout
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class ProgGenRegNo extends Frame implements ActionListener {
	TextField t1,t2,t4;
	Choice c3;
	Button b1;
	public ProgGenRegNo() {
		b1=new Button("Generate");
		t1=new TextField(20);
		t2=new TextField(20);
		c3=new Choice();
		c3.add("Select Branch");
		c3.add("EC");
		c3.add("EIC");
		c3.add("CS");
		c3.add("IT");
		t4=new TextField(20);
		t4.setEditable(false);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.insets=new Insets(2,2,2,2);
		
		gbc.gridx=0;
		gbc.gridy=0;
		add(new Label("Name"),gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		add(t1,gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		add(new Label("College Roll No."),gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		add(t2,gbc);
		gbc.gridx=0;
		gbc.gridy=2;
		add(new Label("Branch"),gbc);
		gbc.gridx=1;
		gbc.gridy=2;
		add(c3,gbc);
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.gridwidth=2;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		add(b1,gbc);
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth=2;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		add(t4,gbc);
		
		
		b1.addActionListener(this);
		
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		Button b=(Button)e.getSource();
		try {
			if(b.equals(b1)) {
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/regno","root","root");
				//create to execute sql code
				Statement st=cn.createStatement();
				ResultSet rs=st.executeQuery("select * from regno.tables");
				int reg=1;
				if(rs.next()) {
					while(rs.next()) {
						reg=rs.getInt("regno");
					}
					++reg;
				}
				String name=t1.getText();
				String clgrollno=t2.getText();
				String branch=c3.getSelectedItem();
				String insert="insert into tables values(?,?,?,?)";
				
				PreparedStatement pst=cn.prepareStatement(insert);
				pst.setInt(1,reg); //1=1st coloum
				pst.setString(2,name);
				pst.setString(3,clgrollno);
				pst.setString(4,branch);
				pst.executeUpdate();
				t4.setText(""+reg);
				cn.close();
			}
		}
		catch(Exception exp) {
			System.out.println(exp);
		}
	}
	public static void main(String[] args) {
		ProgGenRegNo obj=new ProgGenRegNo();
	}
}
			
			
		
