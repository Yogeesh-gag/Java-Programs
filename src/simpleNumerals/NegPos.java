package simpleNumerals;
import java.util.Scanner;
class NegPos {
static void findNegPos(int n) {
	if(n<0)
		System.out.println(n+" is Negative number");
	else
		System.out.println(n+" is a Positive number");
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an integer : ");
	int n=sc.nextInt();
	findNegPos(n);
	sc.close();
}
}
