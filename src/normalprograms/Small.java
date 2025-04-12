package normalprograms;
import java.util.Scanner;
class Small {
	static void  printSmall(int a,int b, int c) {
		int small=a;
		if(b<small)
			small=b;
		if(c<small)
			small=c;
		System.out.println("The Smaller Number is : "+small);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the first number : ");
	int a=sc.nextInt();
	System.out.print("Enter the first number : ");
	int b=sc.nextInt();
	System.out.print("Enter the first number : ");
	int c=sc.nextInt();
	printSmall(a,b,c);
	sc.close();
}
}
