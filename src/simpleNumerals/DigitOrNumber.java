package simpleNumerals;
import java.util.Scanner;
class DigitOrNumber {
	static void findDigitOrNumber(int n) {
		int samp=n;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		if(count==0)
			System.out.println(samp+" is a digit");
		else
			System.out.println(samp+" is a number");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		findDigitOrNumber(n);
		sc.close();
	}

}
