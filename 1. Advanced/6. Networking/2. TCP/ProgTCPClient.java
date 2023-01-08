import java.net.*;
import java.io.*;
import javax.swing.*;
public class ProgTCPClient {
	public static void main(String args[]) {
		try {
			Socket sos=new Socket("127.0.1.1",1998);
			DataOutputStream out=new DataOutputStream(sos.getOutputStream());
			DataInputStream in=new DataInputStream(sos.getInputStream());
			String s=in.readUTF();
			System.out.println("Server sent: '"+s+"'");
			String t=JOptionPane.showInputDialog(null,"Enter choice");
			out.writeUTF(t);
			s=in.readUTF();
			System.out.println("Server Responed: '"+s+"'");		
			sos.close();

		}
		catch(Exception e) {
			System.out.println(""+e);
		}
	}
}
