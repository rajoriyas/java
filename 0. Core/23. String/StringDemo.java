import java.util.Scanner;
class StringDemo {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);	
		String str1 = input.nextLine();
		//using cmd args to take i/0
		System.out.println(args[0]+str1);

		String str2 = args[0];
		Oprators obj = new Oprators(str1, str2);
		obj.compare();
		
		BooleanEqual obj2 = new BooleanEqual(str1, str2);
		obj2.boolean_equal();
		obj2.boolean_equalIgnoreCase();
	
		BooleanCompareTo obj3 = new BooleanCompareTo(str1 , str2);
		obj3.compareTo();
		obj3.compareToIgnoreCase() ;
	
		Boolean_WITH obj4 = new Boolean_WITH(str1, str2);
		obj4.startsWith();
		obj4.endsWith();
	}
}
class Oprators {
	String str1,str2;
	Oprators(String str1, String str2) {
		this.str1=str1;
		this.str2=str2;
	}

	//making string from character
	char ch[] = {'r','a','h','u','l',' ','r','a','j','o','r','i','y','a'};
	String str3 = new String(ch);

	//concatenate string
	String str4 = str1+str2;	//'+=' also use to concatenate

	void compare() {
		//returns true and false not -1 , 0 or 1
		if(str3 == str4) {	
			System.out.println(str3+"equal to"+str4+"="+str3==str4);
		}
 		else {	
			System.out.println(str3+"equal to"+str4+"="+str3==str4);
		}
	} 
}
class BooleanEqual {
	String str1, str2;
	BooleanEqual(String str1, String str2) {
		this.str1=str1;		
		this.str2=str2;
	}
	void boolean_equal() {
		if(str1.equals(str2)) {
			System.out.println(str1+" equal to "+str2+" = "+str1.equals(str2));
		}
		else {
			System.out.println(str1+" equal to "+str2+" = "+str1.equals(str2));
		}
	}
	void boolean_equalIgnoreCase() {
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println(str1+" equal (IGNORE CASE) to "+str2+" = "+str1.equalsIgnoreCase(str2));
		}
		else {
			System.out.println(str1+" equal (IGNORE CASE) to "+str2+" = "+str1.equalsIgnoreCase(str2));
		}
	}
}
class BooleanCompareTo {
	String str1, str2;
	BooleanCompareTo(String str1, String str2) {
		this.str1=str1;		
		this.str2=str2;
	}
	void compareTo() {
		//if(str1.compareTo(str2)) {
			System.out.println(str1+" is compared to "+str2+" gives "+str1.compareTo(str2));
		//}
		//else {
			System.out.println(str1+" is compared to "+str2+" gives "+str1.compareTo(str2));
		//}
	}
	void compareToIgnoreCase() {
		//if(str1.equalIgnoreCase(str2)) {
			System.out.println(str1+" is compared (IGNORE CASE) to "+str2+" gives "+str1.compareTo(str2));
		//}
		//else {
			System.out.println(str1+" is compared (IGNORE CASE) to "+str2+" gives "+str1.compareTo(str2));
		//}
	}
}
class Boolean_WITH {
	String str1, str2;
	Boolean_WITH(String str1, String str2) {
		this.str1=str1;		
		this.str2=str2;
	}
	void startsWith() {
		if("rahuls".startsWith(str1)) {
			System.out.println("Starts with rahuls");
		}
		else {
			System.out.println("Does not start with rahuls");
		}
	}
	void endsWith() {
		if("ya".endsWith(str2)) {
			//System.out.println(endsWith(str2));
			System.out.println("Ends with ya");
		}
		else {
			System.out.println("Does not end with ya");
		}
	}
}
	
	
			
																													
