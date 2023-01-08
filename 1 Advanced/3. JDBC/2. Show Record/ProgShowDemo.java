import java.sql.*;
public class ProgShowDemo {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajoriyas","root","root");  
			//here rajoriyas is database name, root is username and password  
			Statement st = cn.createStatement();  
			ResultSet b = st.executeQuery("select * from rajoriyas.stdata");
			while(b.next()) {
				System.out.println(b.getInt("id")+" "+b.getString("firstname")+" "+b.getString("lastname"));
			}
			cn.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}	