package org;

import java.util.Scanner;

class AverageDigit {
	static int averageSum(int n) {
		int rem,sum=0,count=0;
		do {
			rem=n%10;
			sum=sum+rem;
			count++;
			n=n/10;
		}while(n!=0);
		int avg=sum/count;
		return avg;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int avg=averageSum(n);
		System.out.println("The Average of "+n+" is "+avg);
	}

}
