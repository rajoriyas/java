import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class ProgLogin extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try {
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/regForm", "root", "root");
				String login="select * from regForm.tables where username=? and password=?";
				PreparedStatement pst=cn.prepareStatement(login);
				pst.setString(1,req.getParameter("T1"));
				pst.setString(2,req.getParameter("T2"));
				ResultSet rs=pst.executeQuery();
				if(rs.next()) {
					pw.println("Address:"+rs.getString(3)+"<br>");	
					pw.println("Email:"+rs.getString(4)+"<br>");
					pw.println("Mobile No.:"+rs.getString(5)+"<br>");				
				}
				else {
					pw.println("Wrong Entry");
				}
				rs.close();
				pst.close();
				cn.close();	
			}
			catch(Exception exp1) {
				System.out.println(""+exp1);
			}		
		}
		catch(Exception exp2) {
			System.out.println(""+exp2);
		}
	}
}
