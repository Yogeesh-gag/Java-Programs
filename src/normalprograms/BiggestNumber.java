package normalprograms;
import java.util.Scanner;
class BiggestNumber {
	static void biggestNumber(double a,double b,double c,double d) {
		double big=a;
		if(b>big)
			big=b;
		else if(c>big)
			big=c;
		else if(d>big)
			big=d;
		System.out.println("Biggest Number is : "+big);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers : ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		biggestNumber(a,b,c,d);
		sc.close();
	}

}
