import java.awt.*;
import java.awt.event.*;
public class ProgPanel3 extends Panel {
	TextField t1,t2,t3,t4;
	Button b1;
	Panel P1,P2,P3;
	public ProgPanel3() {
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		t4=new TextField(20);
		b1=new Button("OK");
		P1=new Panel();
		P2=new Panel();
		P3=new Panel();
		setLayout(new GridLayout(3,1));
		P1.setLayout(new GridLayout(3,2));
		P2.setLayout(new BorderLayout());
		P3.setLayout(new GridLayout(1,1));
		P1.add(new Label("Reg. No."));
		P1.add(t1);
		P1.add(new Label("Password"));
		P1.add(t2);
		P1.add(new Label("Q."));
		P1.add(t3);
		P2.add(b1,BorderLayout.CENTER);
		P2.add(new Label("Ans."),BorderLayout.SOUTH);
		P3.add(t4);
		add(P1);
		add(P2);
		add(P3);
		setSize(250,400);
		setVisible(true);
	}
}