import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class ProgExamCheck extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try {
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineExam", "root", "root");
				String insert="update onlineExam.tables set answer=?, result=? where userid=?";
				PreparedStatement pst=cn.prepareStatement(insert);
				String T1=(String)req.getParameter("T1");
			//	pst.setString(4,req.getParameter("T2"));
				pst.setString(1,req.getParameter("choice"));

				Connection cn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/ansKey", "root", "root");
				Statement st=cn1.createStatement();
				ResultSet rs1=st.executeQuery("select * from ansKey.tables");

				String cor_ans="";
				String result="";
				while(rs1.next()) {
					cor_ans=rs1.getString("correct_ans").trim();
				}
				if(cor_ans.equals(req.getParameter("choice").trim())) {
					pw.println("you have passed.");
					result="Pass";
				}
				else {
					pw.println("you have failed.");
					result="Fail";					
				}
				pst.executeUpdate();
				pst.close();
				st.close();
				rs1.close();
				cn1.close();
				cn .close();				
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
