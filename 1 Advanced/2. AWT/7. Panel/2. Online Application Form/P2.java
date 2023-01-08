import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class P2 extends Panel implements MouseListener {
	Random rand=new Random();
	TextField t1,p1;
	CheckboxGroup obj;
	Checkbox c1,c2,c3,c4;
	Button b1;
	public P2() {
		Font font = new Font("arial", Font.BOLD,12);
		setFont(font);
		b1=new Button("Click");
		t1=new TextField(20);
		t1.setEditable(false);
		p1=new TextField(20);
		obj=new CheckboxGroup();
		c1=new Checkbox("TSR",true,obj); //in case of true no one is selected.
		c2=new Checkbox("Trojen",obj,true);
		c3=new Checkbox("Virus",obj,true);
		c4=new Checkbox("None of these",true,obj);
		setLayout(new GridLayout(6,2));
		add(new Label("Reg. No."));
		add(t1);
		add(new Label("To generate"));
		add(b1);
		add(new Label("Password"));
		add(p1);
		add(new Label("Q.) What is java?"));
		add(new Label());
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		b1.addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e) {
		int reg=rand.nextInt(999999999)+100000000;
		String no=String.valueOf(reg);
		
		Button b=(Button)e.getSource();
		if(b.equals(b1)) {
			t1.setText(no);
		}
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
}
		