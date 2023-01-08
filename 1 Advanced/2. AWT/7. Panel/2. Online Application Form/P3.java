import java.awt.*;
import java.awt.event.*;
public class P3 extends Panel {
	Panel P0,P1;
	TextField t1;
	TextArea ta1;
	public P3() {
		t1=new TextField(20);
		t1.setEditable(true);
		ta1=new TextArea(20,70);
		ta1.setEditable(true);
		P0=new Panel();
		P1=new Panel();
		setLayout(new GridLayout(2,1));
		P0.setLayout(new GridLayout(3,2));
		P1.setLayout(new GridLayout(1,1));
		P0.add(new Label("Reg. No."));
		P0.add(t1);
		P0.add(new Label());
		P0.add(new Label());
		P0.add(new Label("Result"));
		P0.add(new Label());
		P1.add(ta1);
		add(P0);
		add(P1);
	}
}
		