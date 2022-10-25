package src.smartgraduate;

import java.util.Scanner;

public class result2darray {
	public static void main(String[] args) {
		System.out.println("enter the number of students:");
		Scanner in=new Scanner(System.in);
		final int max=in.nextInt();
		int[][]arr=new int[max][5];
		for(int i=0;i<max;i++) {
			System.out.println("\nenter the 5 marks of the student:");
			for(int j=0;j<5;j++) {
				arr[i][j]=in.nextInt();
			}
		}
		int tot[]=new int[5];
		for(int i=0;i<max;i++) {
			for(int j=0;j<5;j++) {
				tot[i]=tot[i]+arr[i][j];
			}
		}
		for(int i=0;i<max;i++) {{
			System.out.println("the total marks of the the student"+(i+1)+"is"+tot[i]);
		}
	}

}
}