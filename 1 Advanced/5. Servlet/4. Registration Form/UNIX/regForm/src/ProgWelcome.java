import javax.servlet.*;
import java.sql.*;
import java.io.*;
public class ProgWelcome extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try {
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			pw.println("<html>");
			pw.println("<body>");
			pw.println("Welcome<br>");
			pw.println("To<br>");
			pw.println("rajEduTech.com<br>");
			pw.println("<a href=login>Login</a>");
			pw.println("<a href=reg>Register</a>");
			pw.println("</body>");
			pw.println("</html>");
		}
		catch(Exception e) {
			System.out.println(""+e);
		}
	}
}

