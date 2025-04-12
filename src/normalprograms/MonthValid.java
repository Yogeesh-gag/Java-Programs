package normalprograms;
import java.util.Scanner;
class MonthValid {
	static void monthValid(int m) {
		if(m>=1&&m<=12)
			System.out.println(m+" is a valid Month");
		else
			System.out.println(m+" is not a valid Month");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Month Number : ");
		int m=sc.nextInt();
		monthValid(m);
		sc.close();
	}

}
