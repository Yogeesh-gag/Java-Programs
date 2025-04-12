package simpleNumerals;
import java.util.Scanner;
class LargestOfThree {
	static void findLargeOfThree(int a,int b,int c) {
		if(a>=b&&a>=c)
			System.out.println(a+" is the largest number");
		if(b>=a&&b>=c)
			System.out.println(b+" is the largest number");
		if(c>=b&&c>=b)
			System.out.println(c+" is the largest number");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a=sc.nextInt();
		System.out.println("Enter the second number :");
		int b=sc.nextInt();
		System.out.println("Enter the third number :");
		int c=sc.nextInt();
		findLargeOfThree(a,b,c);
		sc.close();
	}
}
