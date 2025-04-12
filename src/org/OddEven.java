package org;

import java.util.Scanner;

class OddEven {
	static boolean findOddEven(int n){
		int odd=0,even=0;
		do {
			int rem=n%10;
			if(rem%2==0)
				even++;
			else
				odd++;
			n=n/10;
		}while(n!=0);
		if(odd==even)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		boolean b=findOddEven(n);
		if(b)
			System.out.println(n+" is a good number");
		else
		System.out.println(n+" is a bad number");
	}

}
