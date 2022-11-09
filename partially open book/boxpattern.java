package partiallyopen;

import java.util.Scanner;

public class boxpattern {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number:");
	int n=in.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==j||i+j==n+1)
				System.out.println("*");
			else
				System.out.println(" ");
			
				
		}
		System.out.println();
	}
	System.out.println();
	for(int row=0;row<n;row++) {
		for(int colum=0;colum<n;colum++) {
			if(row==0||row==n-1||colum==n-1-row) {
				System.out.println("*");
			}else {
				System.out.println(" ");
			}
		}
		System.out.println();
	}
} 

}
