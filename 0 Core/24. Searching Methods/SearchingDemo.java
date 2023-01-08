import java.util.Scanner;
class SearchingDemo {
	public static void main(String args[]) {
		String str = args[0];
		char ch = str.charAt(3);
		int pos = str.indexOf('u');
		int rev_pos = str.lastIndexOf('u');
		int len = str.length();
		String trimed_str = str.trim();
		String upper_case_str = str.toUpperCase();
		String lower_case_str = str.toLowerCase();
	
		System.out.println("Character at 3 "+ch);
		System.out.println("Position of 'A' "+pos);
		System.out.println("Position of 'A' from last "+rev_pos);	
		System.out.println("Length of string "+len);
		System.out.println(trimed_str);
		System.out.println(upper_case_str);
		System.out.println(lower_case_str);
	}
}
