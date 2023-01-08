import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class ProgShowDataBase extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res) {
		try {
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/displayData","root","root");
				Statement st=cn.createStatement();
				ResultSet rs=st.executeQuery("Select * from displayData.tables");
				ResultSetMetaData rsmd=rs.getMetaData();
				pw.println("<table border=2>");
				pw.println("<tr>");
				for(int i=1 ; i<=rsmd.getColumnCount() ; i++) {
					pw.println("<th>"+rsmd.getColumnName(i)+"</th>");			
				}
				pw.println("</tr>");
				while(rs.next()) {
					pw.println("<tr>");
					pw.println("<td>"+rs.getString(1)+"</td>");
					pw.println("<td>"+rs.getString(2)+"</td>");
					pw.println("<td>"+rs.getString(3)+"</td>");
					pw.println("<td>"+rs.getString(4)+"</td>");
					pw.println("<td>"+rs.getString(5)+"</td>");
				}
				pw.println("</table>");
			}
			catch(Exception e) {
				pw.println(""+e);
			}
		}
		catch(Exception exp) {
			System.out.println(""+exp);
		}
			
	}
}
