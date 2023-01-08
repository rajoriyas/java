import java.net.*;
public class ProgFindAddress {
	public static void main(String args[]) {
		try {
			InetAddress obj=InetAddress.getLocalHost();
			System.out.println(obj);		
		}	
		catch(Exception e) {
			System.out.println(""+e);
		}
	}
}
