import java.rmi.*;
public interface ProgRInter extends Remote {
	public int add(int a, int b) throws Exception;
	public String getName() throws Exception;
}
