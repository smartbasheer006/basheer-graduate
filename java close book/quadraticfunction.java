package src.smartgraduate;

import java.util.Scanner;

public class quadraticfunction {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter a:");
		int a=in.nextInt();
		System.out.println("\nenter b:");
		int b=in.nextInt();
		System.out.println("\nenter the c:");
		int c=in.nextInt();
		System.out.println("\nenter the d:");
		int d=in.nextInt();
		System.out.println("\ntherefore f("+d+")is :");
		quadric qu=new quadric(a,b,c);
		int fx=qu.cal(d);
		System.out.println(fx);
		
	}

}
class quadric{
	int a;
	int b;
	int c;
	int d;
	quadric(){
		a=1;
		b=1;
		c=1;
	}
	quadric(int n1,int n2,int n3){
		a=n1;
		b=n2;
		c=n3;
	}
	int cal(int n) {
		d=(a*n*n)+(b*n)+c;
		return d;
	}
}
