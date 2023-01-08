import java.rmi.*;
public class ProgRMIServer {
	public static void main(String args[]) {
		try {
			ProgServant ser=new ProgServant();
			Naming.rebind("rmi://localhost:9272/rajoriyas",ser);
			System.out.println("Server is ready");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

