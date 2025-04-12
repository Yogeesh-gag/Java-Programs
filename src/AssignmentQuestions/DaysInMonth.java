package AssignmentQuestions;
import java.util.Scanner;
class DaysInMonth {

	static int countNoDays(int m) {
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
			return 31;
		else if(m==4||m==6||m==9||m==11)
			return 30;
		else if(m==2)
			return 28;
		else 
			return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter the Month No : ");
		int m=sc.nextInt();
		int d=countNoDays(m);
		System.err.println("There are "+d+" days in a Month "+m);
		sc.close();
	}
}
