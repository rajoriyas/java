import javax.servlet.*;
import java.io.*;

public class ProgLPage extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try {
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<form method=\"post\" action=\"signin\">");
			pw.println("Username:<input type=\"text\" size=\"20\" name=\"T1\"><br>");
			pw.println("Password:<input type=\"password\" size=\"20\" name=\"T2\"><br>");
			pw.println("<input type=\"submit\" name=\"s1\" value=\"Submit\"><br>");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");
		}
		catch(Exception e) {
			System.out.println(""+e);
		}	
	}
}
