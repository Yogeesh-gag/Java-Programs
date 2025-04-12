package simpleNumerals;

import java.util.Scanner;

//class NonPrime{
//	int a=10;
//	void lrime(){
//		System.out.println("89028");
//	}
//	static{
//	System.out.println("2423");	
//	}
//	{
//		int a=20;
//		System.out.println(a);
//	}
//}

public class Prime{


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int a=sc.nextInt();
//		String res="Positive";
//		if(a<0)
//			a=a*-1;
//		String result="pos";
//		System.out.println(result);
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sm=a;
		if(b<a)
			sm=b;
		else
			sm=c;
		if(sm==a)
			System.out.println(b+""+c);
		else if(sm==b)
			System.out.println(a+""+c);
		else {
			System.out.println(a+""+b);
//		if(a>b&&a>c||b>c) {
//			System.out.println(a+""+b);
//			System.out.println(c);
		}
//		else if(b<c) {
//			System.out.println(a);
//			System.out.println(c);
//		}
//		else {
//			System.out.println(a);
//			System.out.println(b);
//		}
//		if(a>b&&a>c||b>c&&b>a)
//			System.out.println(a+" "+b+""+c);
//		else if(b>a&&b>c||c>a&&c>b)
//			System.out.println(b+" "+c+""+a);
//		else
//			System.out.println(c+" "+a+""+b);

		
	}
}
