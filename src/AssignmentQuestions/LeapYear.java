package AssignmentQuestions;
import java.util.Scanner;
class LeapYear {
	static String checkLeapYear(int y) {
		if(y%4==0&&y%100!=0||y%400==0)
			return "true";
		else
			return "false";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int y=sc.nextInt();
		String res=checkLeapYear(y);
		System.out.println("The Year is : "+res);
	}

}
