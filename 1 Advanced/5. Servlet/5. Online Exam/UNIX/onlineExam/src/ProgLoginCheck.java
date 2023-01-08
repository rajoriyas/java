import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class ProgLoginCheck extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try {
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineExam", "root", "root");
				String check="select * from onlineExam.tables where userid=? and password=?";
				PreparedStatement pst=cn.prepareStatement(check);
				pst.setString(1,req.getParameter("T1"));
				pst.setString(2,req.getParameter("T2"));
				//pst.executeUpdate();
				ResultSet rs=pst.executeQuery();
				String result="",userid="",password="";
				while(rs.next()) {
					userid=rs.getString(1);
					password=rs.getString(2);
					result=rs.getString(4);
				}
				if(result.equals("Pass") || result.equals("Fail")) {
					pw.println("You have examed");
					pw.println("<a href=login>Click Here</a>");
				}
				else if(userid.equals("") && password.equals("")) {
					RequestDispatcher rd=req.getRequestDispatcher("login");
					rd.forward(req, res);
				}
				else if(result.equals("") && userid.equals(req.getParameter("T1")) && password.equals(req.getParameter("T2"))) 					{		
					req.setAttribute("T1",req.getParameter("T1"));
					RequestDispatcher rd=req.getRequestDispatcher("exam");
					rd.forward(req, res);
				}
				else {
					pw.println("Invalid Entry");
					pw.println("<a href=login>Click Here</a>");
				}
				rs.close();
				pst.close();
				cn.close();	
			}
			catch(Exception e) {
				System.out.println(""+e);
			}
		}
		catch(Exception e1) {
			System.out.println(""+e1);
		}		
	}
}
