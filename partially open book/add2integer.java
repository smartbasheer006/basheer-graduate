package partiallyopen;

import java.util.Scanner;

public class add2integer {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int num1,num2;
	int sum;
	System.out.println("enter the first intrger:");
	num1=in.nextInt();
	System.out.println("enter the second integer:");
	num2 =in.nextInt();
	in.close();
	sum=num1+num2;
	System.out.println();
	System.out.println("the sum of two integer is:"+sum);
}
}
