import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class ProgReg extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try {
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			try { 
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/regForm","root","root");
				String insert="insert into regForm.tables values(?,?,?,?,?)";
				PreparedStatement pst=cn.prepareStatement(insert);
				pst.setString(1,req.getParameter("T1").trim());
				pst.setString(2,req.getParameter("T2").trim());
				pst.setString(3,req.getParameter("T3").trim());
				pst.setString(4,req.getParameter("T4").trim());				
				pst.setString(5,req.getParameter("T5").trim());
				int a=pst.executeUpdate();
				if(a==1) {
					pw.println("Sign Up Completed");
				}
				else {
					pw.println("Error in Sign Up");
				}
				pst.close();
				cn.close();	
			}
			catch(Exception e1) {
				System.out.println(""+e1);
			}				
		}
		catch(Exception e2) {
			System.out.println(""+e2);
		}			
	}
}	

