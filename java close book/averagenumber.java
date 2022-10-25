package src.smartgraduate;

import java.util.Scanner;

public class averagenumber {
	void avg(int a,int b,int c) {
		double avg=(double)(a+b+c)/3;
		System.out.println("the average is:"+avg);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter 3 number:");
		int n1=in.nextInt();
		int n2=in.nextInt();
		int n3=in.nextInt();
		System.out.println();
		averagenumber obj=new averagenumber();
		obj.avg(n1,n2,n3);
	}
	

}
