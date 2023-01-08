import java.rmi.*;
import java.rmi.server.*;
public class ProgServant extends UnicastRemoteObject implements ProgRInter {
	public ProgServant() throws Exception {
		super();
	}
	public int add(int a, int b) throws Exception {
		return a+b;
	}
	public String getName() throws Exception{
		return "yara";
	}
}
