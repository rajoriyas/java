import java.awt.*;
import java.awt.event.*;
public class ProgScrollBarDemo extends Frame {
	Scrollbar s1,s2,s3;
	TextField t1,t2,t3;
	public ProgScrollBarDemo() {
		s1=new Scrollbar(0,0,10,0,265);
		s2=new Scrollbar(0,0,10,0,265);
		s3=new Scrollbar(0,0,10,0,265);
		t1=new TextField(5);
		t2=new TextField(5);
		t3=new TextField(5);
		setLayout(new FlowLayout());
		add(new Label("RED"));
		add(s1);
		add(t1);
		add(new Label("GREEN"));
		add(s2);
		add(t2);
		add(new Label("BLUE"));
		add(s3);
		add(t3);
		s1.addAdjustmentListener(new A());
		s2.addAdjustmentListener(new A());
		s3.addAdjustmentListener(new A());
		setSize(500,300);
		setVisible(true);
	}
	class A implements AdjustmentListener {
		public void adjustmentValueChanged(AdjustmentEvent e) {
			int a,b,c;
			a=s1.getValue();
			b=s2.getValue();
			c=s3.getValue();
			Color obj=new Color(a,b,c);
			setBackground(obj);
			t1.setText(" "+a);
			t2.setText(" "+b);
			t3.setText(" "+c);
		}
	}
	public static void main(String args[]) {
		ProgScrollBarDemo obj=new ProgScrollBarDemo();
	}
}