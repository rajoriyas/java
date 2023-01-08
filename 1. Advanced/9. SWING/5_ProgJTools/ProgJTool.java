import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
class ProgJTool extends JFrame { 
	JFrame f;
	JLabel l1,l2,l3,l4;  
	JTextField t1,t2;
	ButtonGroup bg;  
	JRadioButton r1, r2;
	JCheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;
	JButton b;
	DefaultTableModel model;
	JTable jt;
	String row[][]; 
	Container c;
	int i =0;
	ProgJTool() {
		
		l1=new JLabel("Name");  
		l2=new JLabel("Age"); 
		l3=new JLabel("Gender"); 
		l4=new JLabel("Subject"); 

		t1=new JTextField(10); 
		t2=new JTextField(5); 

		bg=new ButtonGroup();    
		r1=new JRadioButton("Male");    
		r2=new JRadioButton("Female");  
		bg.add(r1);
		bg.add(r2);

		checkBox1 = new JCheckBox("English");  
		checkBox2 = new JCheckBox("Maths");  
		checkBox3 = new JCheckBox("Science");  
		checkBox4 = new JCheckBox("Social Science"); 
		checkBox5 = new JCheckBox("Hindi"); 

		b=new JButton("OK");	
   
    	String column[]={"Name","Age","Gender","Subjects"};  
		String[][] data = {{"", "", "",""},{"", "", "",""},{"", "", "",""},{"", "", "",""},{"", "", "",""},{"", "", "",""}}; 
		model = new DefaultTableModel(data, column);
		jt = new JTable(model);

		c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(l1);  
		c.add(t1);
		c.add(l2);
		c.add(t2);
		c.add(l3);
		c.add(r1);
		c.add(r1);
		c.add(r2);
		c.add(l4);
		c.add(checkBox1);
		c.add(checkBox2);
		c.add(checkBox3);
		c.add(checkBox4);
		c.add(checkBox5);	
		c.add(b);
		c.add(jt);

		setSize(500,500);  	
		setVisible(true); 

		b.addMouseListener(new A()); 	
				 	
	}
	class A extends MouseAdapter {		
		public void mouseClicked(MouseEvent e) {
			try{
				String a,b,c,d;
				a=t1.getText();
				b=t2.getText();
				c="";
				d="";  
				if(r1.isSelected()){    
					c="Male"; 
				}    
				if(r2.isSelected()){    
					c="Female";     
				}
				if(checkBox1.isSelected()){    
					d+="English ";     
				}
				if(checkBox2.isSelected()){    
					d+="Maths ";     
				}
				if(checkBox3.isSelected()){    
					d+="Science ";     
				}
				if(checkBox4.isSelected()){    
					d+="Social Science ";     
				}
				if(checkBox5.isSelected()){    
					d+="Hindi";     
				}
				System.out.println(""+a+b+c+d);
		       		jt.setValueAt(a ,i, 0);  
				jt.setValueAt(b ,i, 1);
				jt.setValueAt(c ,i, 2);
				jt.setValueAt(d ,i, 3);
				i++;
			}
			catch(Exception exp) {
				System.out.println(""+exp);
			}
		}
	}		
	public static void main(String args[])  { 
		ProgJTool obj=new ProgJTool();
	}  
} 
