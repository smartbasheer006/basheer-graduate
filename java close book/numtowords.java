package src.smartgraduate;

import java.util.Scanner;

public class numtowords {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int n1=n,n2=n;
		int b=n1%10,a=n/210;
		String[] single_digits=new String[] {"zero","one","three","foure","five","six","severn","eight","nine"};
		String[] double_digits=new String[] {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nighteen"};
		String[] tens_multiple=new String[] {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		if(a==1) {
			System.out.println(double_digits[b+1]);
		}
		else if(b==0)
			System.out.println(tens_multiple[a]);
		else 
			System.out.println(tens_multiple[a]+"-"+single_digits[b]);
	}

}
