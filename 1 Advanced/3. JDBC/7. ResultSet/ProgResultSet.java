import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class ProgResultSet extends Frame implements ActionListener {
	Label l1;
	Button b1;
	TextField t1;
	TextArea ta;
	public ProgResultSet() {
		l1=new Label("Name");
		b1=new Button("OK");
		t1=new TextField(20);
		ta=new TextArea(15,80);
		
		l1.setBounds(50,100,50,30);
		add(l1);
		t1.setBounds(100,100,100,30);
		add(t1);
		b1.setBounds(100,150,50,30);
		add(b1);
		ta.setBounds(50,200,150,200);
		add(ta);
		
		b1.addActionListener(this);
		setLayout(null);
		setVisible(true);
		setFocusable(true);
		setSize(250,400);
		
	}
	public static void main(String args[]) {
		ProgResultSet obj=new ProgResultSet();
	}
	public void actionPerformed(ActionEvent e) {
		Button b=(Button)e.getSource();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/regno","root","root");
			PreparedStatement pst;
			ResultSet rs; 
			if(b.equals(b1)) {
				String s=t1.getText();
				String insert="select * from tables where name like '%"+s+"%'";
				pst=cn.prepareStatement(insert);
				
//				pst.setString(1,s);
	//			pst.executeUpdate();
				
				rs=pst.executeQuery();				
				String t="";
				while(rs.next()) {
					t=t+rs.getString(1)+"\t";
					t=t+rs.getString(2)+"\t";
					t=t+rs.getString(3)+"\t";
					t=t+rs.getString(4)+"\t";
					t=t+"\n";		
				}
				ta.setText(t);
			}				
		}
		catch(Exception exp) {
			ta.setText(""+exp);
		}
	}
}
