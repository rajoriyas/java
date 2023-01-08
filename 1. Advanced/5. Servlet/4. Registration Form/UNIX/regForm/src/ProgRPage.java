import javax.servlet.*;
import java.io.*;
public class ProgRPage extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try{
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<form method=post action=signup>");
			pw.println("Username:<input type=text size=20 name=T1><br>");
			pw.println("Password:<input type=password size=20 name=T2><br>");
			pw.println("Address:<input type=text size=20 name=T3><br>");
			pw.println("Email:<input type=text size=40 name=T4><br>");
			pw.println("Mobile:<input type=text size=20 name=T5><br>");
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
