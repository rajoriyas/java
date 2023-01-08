import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.Random;
public class ProgFrame implements WindowListener {
	Frame frame;
	ProgPanel panel;
	public ProgFrame() {
		panel=new ProgPanel();
		frame=new Frame();
//		frame.setLayout(null);
		frame.add(panel);
//		panel.setLocation(0,75);
		frame.setTitle("Snake");
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setBackground(Color.black);
//		frame.setSize(870,650);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.addWindowListener(this);
	}
	public static void main(String args[]) {
		ProgFrame obj=new ProgFrame();
	}

	public void windowClosing(WindowEvent e) {
			frame.dispose();
	}
	public void windowDeactivated(WindowEvent e) {
	}
	public void windowActivated(WindowEvent e) {
	}
	public void  windowDeiconified(WindowEvent e) {
	}
	public void  windowIconified(WindowEvent e) {
	}
	public void  windowClosed(WindowEvent e) {
	}
	public void windowOpened(WindowEvent e) {
	}
}