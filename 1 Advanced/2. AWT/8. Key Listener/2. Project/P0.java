import java.awt.*;
import java.awt.event.*;
public class P0 extends Panel {
	Label l3,l4;
	public P0() {
		Font font = new Font("Comic Sans MS",Font.BOLD,48);
		setFont(font);
		setBackground(new Color(255,255,204));
		setLayout(new GridLayout(4,1));
		add(new Label("Welcome",Label.CENTER));
		add(new Label("to",Label.CENTER));
		Label l3 = new Label("YARAS",Label.CENTER);
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,50));
		add(l3);
		Label l4 = new Label("International",Label.CENTER);
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		add(l4);
	}
}