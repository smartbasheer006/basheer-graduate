package partiallyopen;

import java.util.Scanner;

public class avgwithininput {
public static void main(String[] args) {
	final int max=3;
	int numin;
	int sum=0;
	boolean isvalied;
	double avg;
	Scanner in=new Scanner(System.in);
	for(int studentno=1;studentno<=max;studentno++) {
		isvalied=false;
		do 
		{
			System.out.println("enter a number between 0-100:");
			numin=in.nextInt();
			if(numin>=0&&numin<=100) {
				isvalied=true;
			}
			else {
				System.out.println("invalied input,try again");
			}
		}
		while(!isvalied);
		sum+=numin;
	}
	avg=(double)sum/max;
System.out.println("you have entered :%.2f"+avg);
}
}
