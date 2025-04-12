package org;
import java.util.Scanner;
 class SumOfEven {
	 static int sumOfEvenDigit(int n) {
		 int sum=0;
		 do{
			 int rem=n%10;
			 if(rem%2==0)
				 sum=sum+rem;
			 n=n/10;
		 }while(n!=0) ;
		 return sum;
	 }
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int ed=sumOfEvenDigit(n);
		System.out.println("The Sum of Even Digits are : "+ed);
		
	 }

}
