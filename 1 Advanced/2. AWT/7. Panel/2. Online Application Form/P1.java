import java.awt.*;
import java.awt.event.*;
public class P1 extends Panel {
	TextField t1,t2;
	Choice c1,c2;
	public P1() {
		t1=new TextField(20);
		t2=new TextField(20);
		c1=new Choice();
		c1.add("Select Branch");
		c1.add("CS");
		c1.add("IT");
		c1.add("EC");
		c1.add("EIC");
		c2=new Choice();
		c2.add("Select Sem.");
		c2.add("1st");
		c2.add("2nd");
		c2.add("3rd");
		c2.add("4th");
		c2.add("5th");
		c2.add("6th");
		c2.add("7th");
		c2.add("8th");
		setLayout(new GridLayout(5,2));
		Font obj = new Font("arial", Font.BOLD,12);
		setFont(obj);
		add(new Label("**Student Login**"));
		add(new Label());
		add(new Label("Name"));
		add(t1);
		add(new Label("College Roll No."));
		add(t2);
		add(new Label("Branch"));
		add(c1);
		add(new Label("Semester"));
		add(c2);
	}
}
		