package normalprograms;
import java.util.Scanner;
class MonthNumber {
	static void monthValid(int n) {
		if(n==31)
			System.out.println("Jan,Mar,May,July,Aug,Oct,Dec");
		else if(n==30)
			System.out.println("Apr,June,Sep,Nov");
		else if(n==28&&n==29)
			System.out.println("Feb");
		else
			System.out.println("It is invalid Number");	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		monthValid(n);
		sc.close();
	}


}
