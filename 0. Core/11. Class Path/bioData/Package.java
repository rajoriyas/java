package bioData;
import java.util.Scanner;
class BioData {
	Scanner input = new Scanner(System.in);
	public void getdata() {
		System.out.print("Enter your name	-	");
		String name = input.nextLine();
		System.out.print("Enter your date of birth (YYYY/MM/DD)	-	");
		String dob = input.nextLine();
		System.out.print("Enter your age	-	");
		String age = input.nextLine();
	}
	public static void main(String[] args){
		BioData object = new BioData();
		object.getdata();
	}
}
			