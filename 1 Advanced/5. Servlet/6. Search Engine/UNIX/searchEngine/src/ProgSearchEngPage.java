import javax.servlet.*;
import java.io.*;
public class ProgSearchEngPage extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try {
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			pw.println("<html><body>");
			pw.println("<form method=post action=search>");
			pw.println("Search=<input type=text size=20 name=T1><br>");
			pw.println("<input type=submit name=s1 value=Submit>");
			pw.println("</form>");
			pw.println("</body></html>");
		}
		catch(Exception e) {
			System.out.println(""+e);
		}
	}	
}	
