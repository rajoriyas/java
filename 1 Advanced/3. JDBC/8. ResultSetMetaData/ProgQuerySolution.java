import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class ProgQuerySolution extends Frame implements ActionListener {
	Label l1;
	Button b1;
	TextField t1;
	TextArea ta1;
	public ProgQuerySolution() {
		setLayout(null);
		
		l1=new Label("Select Query");
		t1=new TextField(20);
		b1=new Button("Solve");
		ta1=new TextArea(20,20);
		
		l1.setBounds(50,100,100,30);
		add(l1);
		t1.setBounds(150,100,100,30);
		add(t1);
		b1.setBounds(110,150,80,30);
		add(b1);
		ta1.setBounds(10,200,280,200);
		add(ta1);
		
		b1.addActionListener(this);
		setBackground(Color.orange);
		setVisible(true);
		setFocusable(true);
		setSize(300,500);
	}
	public static void main(String args[]) {
		ProgQuerySolution pqs=new ProgQuerySolution();
	}
	public void actionPerformed(ActionEvent e) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/QueryManagement","root","root");
			String insert="select * from tables where Sr=?";
			//create statement 
			PreparedStatement pst=cn.prepareStatement(insert);
			//ResultSet is created which is used to execute my statement
			String col=t1.getText().trim();
			pst.setString(1,col);
			ResultSet rs=pst.executeQuery();
			//ResultSetMetaData is created
			ResultSetMetaData rsmd=rs.getMetaData();
			Button b=(Button)e.getSource();
			if(b.equals(b1)) {
				//use to count Coloumn
				int n=rsmd.getColumnCount();
				String s="";
				for(int i=1;i<=n;i++) {
					s=s+rsmd.getColumnName(i)+"\t\t";
				}
				while(rs.next()) {
					s=s+"\n";
					for(int i=1;i<=n;i++) {
						s=s+rs.getString(i)+"\t ";
					}
				}
				ta1.setText(s);
			}
			cn.close();
		}
		catch(Exception exp) {
			ta1.setText(""+exp);
		}
	}
}