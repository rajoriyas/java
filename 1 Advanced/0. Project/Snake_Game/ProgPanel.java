import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;
public class ProgPanel extends Panel implements KeyListener {
	private Random rand=new Random();
	private Image title,left,right,up,down,enemy,tail;
	private int xloc,yloc,length;
	private int[] xcoor=new int[750];
	private int[] ycoor=new int[750];
	private int ch;
	private boolean leftDirection, rightDirection, upDirection, downDirection;
	private static final int WIDTH=900,HEIGHT=610;
	
	public ProgPanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		title =Toolkit.getDefaultToolkit().getImage("snaketitle.jpg"); 
		left=Toolkit.getDefaultToolkit().getImage("leftmouth.png");
		up=Toolkit.getDefaultToolkit().getImage("upmouth.png");
		down=Toolkit.getDefaultToolkit().getImage("downmouth.png");
		right=Toolkit.getDefaultToolkit().getImage("rightmouth.png");
		enemy=Toolkit.getDefaultToolkit().getImage("enemy.png");
		tail=Toolkit.getDefaultToolkit().getImage("snakeimage.png");
		
		length=1;	//for head
		xcoor[1]=125;
		ycoor[1]=125;		
		xloc=25*(rand.nextInt(31)+4);
		yloc=25*(rand.nextInt(14)+4);
		
		leftDirection = false;
		rightDirection = true;
		upDirection = false;
		downDirection = false;

		setLayout(new FlowLayout());
		setVisible(true);
		
		addKeyListener(this);
	//	addActionListener(this);
	}
	public void paint(Graphics g) {
		//draw title border
		g.setColor(Color.white);
		g.drawRect(24,10,851,55);
		//add image 															 														
		g.drawImage(title,25,11,this);		
//		Game Panel Border
		g.setColor(Color.white);
		g.drawRect(24,74,851,526);	
//		int w = title.getWidth(this); 
		g.setColor(Color.darkGray);
		g.fillRect(25,75,850,525);
		g.setColor(Color.white);
		Font font=new Font("Comic Sans MS",Font.BOLD,12);
		g.setFont(font);
		g.drawString("Score="+((length-1)*10),800,42);

		for(int i=2 ; i<=length ; i++) {
			if(xcoor[1]==xcoor[i] && ycoor[1]==ycoor[i]) {
				g.setColor(Color.white);
				Font font2=new Font("Comic Sans MS",Font.BOLD,30);
				g.setFont(font2);
				g.drawString("Game Over!",400,305);
				Font font3=new Font("Comic Sans MS",Font.BOLD,12);
				g.setFont(font3);
				g.drawString("Press Space to RESTART",410,330);
				rightDirection=false;
				leftDirection=false;
				upDirection=false;
				downDirection=false;
//				Scanner scn=new Scanner(System.in);				//method 1st
//				scn.nextLine();		
				
			/*	try {															//method 2nd
					System.in.read();
				}
				catch(Exception e) {
				}*/
			}
		}
		enemy();
		move();
		if(rightDirection == true) {	
			g.drawImage(right,xcoor[1],ycoor[1],this);
			for(int i=2; i <= length ; i++) {
				g.drawImage(tail,xcoor[i],ycoor[i],this);
			}
		}
		if(leftDirection == true) {	
			g.drawImage(left,xcoor[1],ycoor[1],this);
			for(int i=2; i <= length ; i++) {
				g.drawImage(tail,xcoor[i],ycoor[i],this);
			}
		}
		if(upDirection == true) {	
			g.drawImage(up,xcoor[1],ycoor[1],this);
			for(int i=2; i <= length ; i++) {
				g.drawImage(tail,xcoor[i],ycoor[i],this);
			}
		}
		if(downDirection == true) {	
			g.drawImage(down,xcoor[1],ycoor[1],this);
			for(int i=2; i <= length ; i++) {
				g.drawImage(tail,xcoor[i],ycoor[i],this);
			}
		}
		try {
			Thread.sleep(100);		
		}
		catch(Exception exp) {
		}
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT && !leftDirection) {
			leftDirection = false;
			rightDirection = true;
			upDirection = false;
			downDirection = false;
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT && !rightDirection) {
			leftDirection = true;
			rightDirection = false;
			upDirection = false;
			downDirection = false;	
		}
		else if(e.getKeyCode() == KeyEvent.VK_UP && !downDirection) {
			leftDirection = false;
			rightDirection = false;
			upDirection = true;
			downDirection = false;	
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN && !upDirection) {
			leftDirection = false;
			rightDirection = false;
			upDirection = false;
			downDirection = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			for(int i=2 ; i<=length ; i++) {
				if(xcoor[1]==xcoor[i] && ycoor[1]==ycoor[i]) {
					length=1;	//for head
					xcoor[1]=125;
					ycoor[1]=125;		
					
					leftDirection = false;
					rightDirection = true;
					upDirection = false;
					downDirection = false;
				}
			}
			repaint();
		}
	}
	public void keyTyped(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	
	public void move () {
		if(rightDirection) {
			for(int i=length ; i>=1 ; i--)  {
				ycoor[i+1]=ycoor[i];
			}
			for(int i=length ; i>=1 ; i--) {
				if(i==1)  xcoor[i] += 25;							//only head is there
				if(xcoor[i]==875) xcoor[i]=25;
				if(i!=1) xcoor[i]=xcoor[i-1];
			}
			repaint();
		}
		if(leftDirection) {
			for(int i=length ; i>=1 ; i--)  {
				ycoor[i+1]=ycoor[i];
			}
			for(int i=length ; i>=1 ; i--)  {
 				if(i==1)  xcoor[i] -= 25;							//only head is there
				if(xcoor[i]==0) xcoor[i]=850;
				if(i!=1) xcoor[i]=xcoor[i-1];
			}
			repaint();
		}
		if(upDirection) {
			for(int i=length ; i>=1 ; i--)  {
				xcoor[i+1]=xcoor[i];
			}
			for(int i=length ; i>=1 ; i--)  {
				if(i==1)  ycoor[i] -= 25;							//only head is there
				if(ycoor[i]==50) ycoor[i]=575;
				if(i!=1) ycoor[i] =ycoor[i-1];
			}
			repaint();
		}
		if(downDirection) {
			for(int i=length ; i>=1 ; i--)  {
				xcoor[i+1]=xcoor[i];
			}
			for(int i=length ; i>=1 ; i--)  {
				if(i==1)  ycoor[i] += 25;							//only head is there
				if(ycoor[i] == 600) ycoor[i]=75;
				if(i!=1) ycoor[i]=ycoor[i-1];
			}
			repaint();
		}
	}
	
	public void enemy() {
		Graphics g=getGraphics();				
		g.drawImage(enemy,xloc,yloc,this);
		if( xcoor[1]==xloc  && ycoor[1]==yloc ) {
			xloc=25*(rand.nextInt(31)+4);
			yloc=25*(rand.nextInt(14)+4);
			length++;
		}
	}
}
	