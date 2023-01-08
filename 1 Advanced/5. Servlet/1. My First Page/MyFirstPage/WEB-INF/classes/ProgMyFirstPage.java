import javax.servlet.*;
import java.io.*;

public class ProgMyFirstPage extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try {
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<font face=\"Arial\" size=8 color=red>");
			pw.println("Welcome<br>");
			pw.println("To<br>");
			pw.println("YARAs International<br>");
			pw.println("</font>");
			pw.println("<a href=\"Login Page\"> Login</a>");
			pw.println("</body>");
			pw.println("</html>");
		}
		catch (Exception e) {
			System.out.println(""+e);
		}
	}
}