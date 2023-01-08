import java.net.*;
import java.io.*;
public class ProgUDPServer {
	public static void main(String args[]) {
		try {
			DatagramPacket pk;
			DatagramSocket sos=new DatagramSocket();
			DatagramSocket soc=new DatagramSocket(1998);
			InetAddress ip=InetAddress.getByName("rajoriyas-x55u");
	
			byte b[]="Hello".getBytes();
			pk=new DatagramPacket(b,b.length,ip,1997);
			sos.send(pk);	

			pk=new DatagramPacket(new byte[1024],1024);
			soc.receive(pk);
			String s=new String(pk.getData());
			System.out.println("Client message:"+s);
		}
		catch(Exception e) {
			System.out.println(""+e);
		}
	}
}
