package simpleNumerals;

import java.util.Scanner;
class ZeroNonZero {
	static void findNonZero(int n) {
		if(n==0)
			System.out.println(n+" is Zero number");
		else
			System.out.println(n+" is a not a Zero number");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int n=sc.nextInt();
		findNonZero(n);
		sc.close();
	}

}
