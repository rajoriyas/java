//Program to show data on a Grid layout.
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class ProgShow extends Frame implements ActionListener {
	Button b1;
	TextArea ta;
	public ProgShow() {
		b1=new Button("Generate");
		ta=new TextArea(15,80);
		ta.setEditable(false);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.fill=GridBagConstraints.BOTH;
		add(b1,gbc);
		
		gbc.gridx=0;
		gbc.gridy=2;
		add(ta,gbc);
		
		b1.addActionListener(this);
		
		setSize(1000,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		Button b=(Button)e.getSource();
		if(b.equals(b1)){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajoriyas","root","root");
				Statement st=cn.createStatement();
				ResultSet rs=st.executeQuery("select * from rajoriyas.stdata");
				String data="id\tfirstname\t\tlastname";
				while(rs.next()) {
					data=data+"\n";
					data=data+rs.getInt("id")+"\t";
					data=data+rs.getString("firstname")+"\t\t";
					data=data+rs.getString("lastname")+"\t";
				}
				//can't print direct because it is printing line by line
				ta.setText(data);
				cn.close();
			}
			catch(Exception exp) {
				System.out.println(exp);
			}
		}
	}
	public static void main(String[] args) {
		ProgShow obj=new ProgShow();
	}
}
		