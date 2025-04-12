package org;
import java.util.Scanner;
class MultipleOfThree {
	static int findMultiOfThree(int n) {
		int count=0;
	/*	for(int i=1;i<=n;i++) {
			if(i%3==0)
				count++;
		}
		return count; */
		do {
			if(n%3==0)
				count++;
			n--;
		}while(n!=0);
		return count;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		int mt=findMultiOfThree(n);
		System.out.println("Multiple of three are : "+mt);
		}

}
