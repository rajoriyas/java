import java.sql.*;
public class ProgInsertRecord {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajoriyas","root","root");  
			//here rajoriyas is database name, root is username and password  
			Statement st = cn.createStatement();  
			int a = st.executeUpdate("insert into stdata values(3,'rajoriyas','9272')");
			System.out.println(a);
			cn.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}	