import java.net.*;
import java.io.*;
public class ProgUDPClient {
	public static void main(String args[]) {
		try {
			DatagramPacket pk;
			DatagramSocket soc=new DatagramSocket(1997);
			DatagramSocket sos=new DatagramSocket();
			InetAddress ip=InetAddress.getLocalHost();

			pk=new DatagramPacket(new byte[1024],1024);
			soc.receive(pk);
			String msg=new String(pk.getData());
			System.out.println("Server Message:"+msg);		

			byte b[]="Fine, thank you".getBytes();
			pk=new DatagramPacket(b,b.length,ip,1998);
			sos.send(pk);
		}
		catch(Exception e) {
			System.out.println(""+e);
		}
	}
}
