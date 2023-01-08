import java.awt.*;
import java.awt.event.*;

class OtherColorException extends Exception {
}
class MyExceptionClass {
	void check(String s) throws OtherColorException {
		if(!s.equalsIgnoreCase("v") && !s.equalsIgnoreCase("i") && !s.equalsIgnoreCase("b") && !s.equalsIgnoreCase("g") && !s.equalsIgnoreCase("y") && !s.equalsIgnoreCase("o") && !s.equalsIgnoreCase("r")) { 
			OtherColorException obj=new OtherColorException();
			throw obj;
		}
	}
}
public class ProgKeyListener extends Frame {
	TextField t1,t2;
	public ProgKeyListener() {
		t1=new TextField(20);
		t2=new TextField(20);
		t2.setEditable(false);
		setLayout(new FlowLayout());
		add(new Label("Character"));
		add(t1);
		add(new Label("Color"));
		add(t2);
		t1.addKeyListener(new A()); 	//action of key like type, key released, key pressed
		setSize(250,100);
		setVisible(true);
	}
	class A extends KeyAdapter {		
	//	public void keyTyped(KeyEvent e) { means key+enter
		public void keyReleased(KeyEvent e) {
			try {
					
				String s = t1.getText().trim();
				t2.setBackground(null);
				t2.setText(null);
	
				MyExceptionClass exp1 = new MyExceptionClass();
				exp1.check(s);
				
				if(s.equalsIgnoreCase("v")) {
					System.out.println(s);
					t2.setBackground(new Color(128,0,128));
					t2.setText("Violet");
				}
				else if(s.equalsIgnoreCase("i")) {
					t2.setBackground(new Color(75,0,130));
					t2.setText("Indigo");
				}
				else if(s.equalsIgnoreCase("b")) {
					t2.setBackground(Color.blue);
					t2.setText("Blue");
				}
				else if(s.equalsIgnoreCase("g")) {
					t2.setBackground(Color.green);
					t2.setText("Green");
				}
				else if(s.equalsIgnoreCase("y")) {
					t2.setBackground(Color.yellow);
					t2.setText("Yellow");
				}
				else if(s.equalsIgnoreCase("o")) {
					t2.setBackground(Color.orange);
					t2.setText("Orange");
				}
				else if(s.equalsIgnoreCase("r")) {
					t2.setBackground(Color.red);
					t2.setText("Red");
				}
			}
			catch(OtherColorException exp) {
				t1.setText(null);
				t2.setText("ONLY 'V I B G Y O R'");
			}
		}
	}
	public static void main(String args[]) {
		ProgKeyListener obj=new ProgKeyListener();
	}
}

			
	