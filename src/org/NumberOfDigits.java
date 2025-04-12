package org;
import java.util.Scanner;
class NumberOfDigits {
	static int numberOfDigits(int n) {
		int rem ,count=0;
		do {
			rem=n%10;
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int ed=numberOfDigits(n);
		System.out.println("The Sum of Even Digits are : "+ed);
	}

}
