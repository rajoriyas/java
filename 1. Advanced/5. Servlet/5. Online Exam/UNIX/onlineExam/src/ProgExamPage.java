import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class ProgExamPage extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try{
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<form method=post action=check_exam>");
			pw.println("User:<input type=text name=T1 size=5 value="+(String)req.getAttribute("T1")+" readonly><br>");
			pw.println("Q.1) What is Java?<br>");
			pw.println("<input type=radio name=choice value=Language>Language<br>");
			pw.println("<input type=radio name=choice value=OOP>OOP<br>");
			pw.println("<input type=radio name=choice value=Virus>Virus<br>");
			pw.println("<input type=radio name=choice value=None>None<br>");
			pw.println("<input type=submit name=s1 value=Submit><br>");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");
		}
		catch(Exception e1) {
			System.out.println(""+e1);
		}
	}
}
