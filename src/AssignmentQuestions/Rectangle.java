package AssignmentQuestions;

import java.util.Scanner;

class Rectangle {
	static int calArea(int l,int b) {
		int a=l*b;
		return a;
	}
	static int calPerimeter(int l,int b) {
		int p=2*(l+b);
		return p;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breath :");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int a=calArea(l,b);
		int p=calPerimeter(l,b);
		System.out.println("Area  : "+a);
		System.out.println("Perimeter : "+p);
		sc.close();
	}
}
