package AssignmentQuestions;

import java.util.Scanner;

class AreaOfCircle {
	final static double pi=3.14;
	static double calArea(int r) {
		double a=pi*r*r;
		return a;
	}
	static double calCircumference(int r) {
		double c=2*pi*r;
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		int r=sc.nextInt();
		double a=calArea(r);
		double c=calCircumference(r);
		System.out.println("Area : "+a);
		System.out.println("Circumference : "+c);
		sc.close();
	}
	

}
