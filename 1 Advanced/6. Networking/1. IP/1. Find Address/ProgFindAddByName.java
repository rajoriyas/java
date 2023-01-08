import java.net.*;
public class ProgFindAddByName {
	public static void main(String args[]) {
		try {
			InetAddress obj=InetAddress.getByName("rajoriyas-x55u");
			System.out.println(obj);		
		}	
		catch(Exception e) {
			System.out.println(""+e);
		}
	}
}
