import java.awt.*;
import java.awt.event.*; 
import java.util.Random;
public class P0 extends Panel {
	Label l1,l2,l3,l4,l5;
	public P0() {
		l1=new Label("Welcome!");
		l2=new Label("to");
		l3=new Label("Rajoriyas");
		l4=new Label("Techno");
		l5=new Label("Point");
		Random rand=new Random();
		int x=rand.nextInt(255);
		int y=rand.nextInt(255);
		int z=rand.nextInt(255);
		Color obj=new Color(x,y,z);
		l1.setForeground(obj);
		l1.setFont(new Font("arial",Font.BOLD,40));
		l2.setForeground(obj);
		l2.setFont(new Font("arial",Font.BOLD,40));
		l3.setForeground(obj);
		l3.setFont(new Font("arial",Font.BOLD,40));
		l4.setForeground(obj);
		l4.setFont(new Font("arial",Font.BOLD,40));
		l5.setForeground(obj);
		l5.setFont(new Font("arial",Font.BOLD,40));
		setLayout(new GridLayout(5,1));
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
	}
	
}