import javax.servlet.*;
import java.io.*;

public class ProgLoginPage extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try { 
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<form method=post action=check>");
			pw.println("User Id :<input type=text size=20 name=T1>");
			pw.println("Password :<input type=password size=20 name=T2>");
			pw.println("<input type=submit name=s1 value=Submit>");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");
		}
		catch(Exception e) {
			System.out.println(""+e);
		}
	}
}
