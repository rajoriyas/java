import java.sql.*;
public class ProgUpdateDEMO {
	public static void main(String args[]) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajoriyas","root","root");
			Statement st=cn.createStatement();
			int a=st.executeUpdate("Update stdata set firstname='rajoriyarahuls' where id=1");
			System.out.println(a);
			ResultSet rs=st.executeQuery("select * from rajoriyas.stdata");
			while(rs.next()) {
					System.out.println(rs.getInt("id")+" "+rs.getString("firstname")+" "+rs.getString("lastname"));
			}
			cn.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}		
