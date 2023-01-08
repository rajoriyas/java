//Program to show oval magic
import java.awt.*;
import java.awt.event.*;
public class ProgOvalDemo extends Frame {
	Scrollbar s1;
	TextField t1;
	ProgOvalDemo() {
		s1=new Scrollbar(0,0,10,0,110);
		t1=new TextField(3);
		setLayout(new FlowLayout());
		s1.addAdjustmentListener(new A());
		add(new Label("Oval"));
		add(s1);
		add(t1);
		setSize(500,500);
		setVisible(true);
	}
	class A implements AdjustmentListener {
		public void adjustmentValueChanged(AdjustmentEvent e) {
			int a;
			a=s1.getValue();
			t1.setText(" "+a);
			Graphics g=getGraphics();
			g.clearRect(0,0,500,500);
			g.drawOval(250-a,250-a,50+a,50+a);
		}
	}
	public static void main(String args[]) {
		ProgOvalDemo obj=new ProgOvalDemo();
	}
}
			