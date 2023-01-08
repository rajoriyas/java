import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class ProgSearchEngine extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try {	
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			String s=req.getParameter("T1");
			if(s.trim().equals("")) s="";
			else s=s.trim();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/searchEngine","root","root");
				String sql="select * from searchEngine.tables where discription like'%"+s+"%'";
				Statement st=cn.createStatement();
				ResultSet rs=st.executeQuery(sql);
				while(rs.next()) {
					pw.println(rs.getString(1)+": "+rs.getString(2)+"<br>");
				}
			}
			catch(Exception e) {
				System.out.println(""+e);
			}
		}
		catch(Exception e) {
			System.out.println(""+e);
		}
	}
}
