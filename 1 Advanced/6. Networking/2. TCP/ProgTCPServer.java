import java.net.*;
import java.io.*;
public class ProgTCPServer {
	public static void main(String arhs[]) {
		try {
			ServerSocket ss=new ServerSocket(1998);
			Socket soc;
			PrintWriter pw;
			BufferedReader br;
			for(;;) {
				System.out.println("Server is started");
				System.out.println("Waiting for server.....");
				soc=ss.accept();
				System.out.println("Client is connected");
				DataOutputStream out=new DataOutputStream(soc.getOutputStream());
				DataInputStream in=new DataInputStream(soc.getInputStream());
				out.writeUTF("You can ask for date and name");
				String s=in.readUTF();
				String ans="";
				if(s.equalsIgnoreCase("Date")) ans=ans+new java.util.Date();
				else if(s.equalsIgnoreCase("Name")) ans=ans+"rajoriyarahuls";
				else ans=ans+"Invalid Choice";
				out.writeUTF(ans);	//send to the client
				soc.close();	
			}
		}
		catch(Exception e) {
			System.out.println(""+e);
		}
	}	
}
