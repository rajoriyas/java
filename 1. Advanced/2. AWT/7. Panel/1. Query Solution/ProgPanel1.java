import java.awt.*;
import java.awt.event.*;
public class ProgPanel1 extends Panel {
	TextField t1,t2,t3,t4,t5;
	Button b1,b2;
	public ProgPanel1() {
		b1=new Button("OK");
		b2=new Button("Cancel");
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		t4=new TextField(20);
		t5=new TextField(20);
		setLayout(new GridLayout(6,2));
		add(new Label("Name"));
		add(t1);
		add(new Label("Branch"));
		add(t2);
		add(new Label("College Roll No."));
		add(t3);
		add(new Label("Semester"));
		add(t4);
		add(new Label("Password"));
		add(t5);
		add(b1);
		add(b2);
		setSize(250,400);
		setVisible(true);
	}
}