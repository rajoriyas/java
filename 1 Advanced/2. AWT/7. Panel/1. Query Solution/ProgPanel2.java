import java.awt.*;
import java.awt.event.*;
public class ProgPanel2 extends Panel {
	Button b1,b2;
	TextField t1,t2,t3,t4;
	Panel P1,P2,P3;
	public ProgPanel2() {
		b1=new Button("OK");
		b2=new Button("Cancel");
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		t4=new TextField(20);
		
		P1=new Panel();
		P2=new Panel();
		P3=new Panel();
		setLayout(new GridLayout(3,1));
		P1.setLayout(new GridLayout(3,2));
		P2.setLayout(new GridLayout(2,1));
		P3.setLayout(new GridLayout(1,2));
		P1.add(new Label("Reg. No."));
		P1.add(t1);
		P1.add(new Label("Password"));
		P1.add(t2);
		P1.add(new Label("Subject"));
		P1.add(t3);
		P2.add(new Label("Question"));
		P2.add(t4);
		P3.add(b1);
		P3.add(b2);
		
		add(P1);
		add(P2);
		add(P3);
		
		setSize(250,450);
		setVisible(true);
	}
}