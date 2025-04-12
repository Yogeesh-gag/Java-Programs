package simpleNumerals;
import java.util.Scanner;
class PositiveInteger {
static void printPositive(int n) {
	int p=0;
	if(n<0) {
		p=-1*n;
		System.out.println(p+" is its positive Number");
	}
	else
		System.out.println(n+" is already positive number");
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Integer : ");
	int n=sc.nextInt();
	printPositive(n);
	sc.close();
}
}
