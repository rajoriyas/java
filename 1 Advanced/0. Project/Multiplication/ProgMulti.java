import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Formatter;
public class ProgMulti {
	public static void main(String args[]) {
		DecimalFormat df = new DecimalFormat("#");			
		Scanner scr=new Scanner(System.in);
		String a=scr.nextLine();		
		String b=scr.nextLine();
		System.out.println("\n  "+a+"\nx "+b+"\n_______");		
		int l=b.length();
		double[] num1=new double[l];	
		for(int i=0 ; i<=l-1 ; i++) {
			num1[i] = Character.getNumericValue(b.charAt(l-1-i));		//	ASCII Conversion
	//		System.out.println(num1[i]);	
		}
	//	System.out.println(num1);														// what is the problem?
		double num2=Double.parseDouble(a);	
		double[] multi=new double[l];	
		double[] multi2=new double[l];	
		double p;
		for(int i=0; i<=l-1;i++) {	
			multi[i]=num2*num1[i];
	//		System.out.println(multi[i]);	
		}		
		for(int i=0; i<= l-1;i++) {	
			p=Math.pow(10, i);
			multi2[i]=multi[i]*p;
			System.out.println(df.format(multi2[i]));			
		}	
		for(int i=1; i<= l-1;i++) {	
			multi2[i]=multi2[i]+multi2[i-1];
		}
		System.out.println("_______\n"+df.format(multi2[l-1]));	
	}
}