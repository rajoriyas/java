import java.rmi.*;
public class ProgRMIClient {
	public static void main(String args[]) {
		try{
			ProgRInter p;
			p=(ProgRInter)Naming.lookup("rmi://localhost:9272/rajoriyas");
			int x=p.add(2,9);
			System.out.println(x);
			System.out.println(p.getName());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
