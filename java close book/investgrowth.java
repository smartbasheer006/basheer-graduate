package src.smartgraduate;

import java.util.Scanner;

public class investgrowth {
public static void main(String[] args) {
	double invest;
	Scanner in= new Scanner(System.in);
	System.out.println("enter the invest:");
	invest=in.nextDouble();
	System.out.println();
	invest=invest+(((double)40/100)*invest);
	invest=invest-1500;
	invest=invest+(((double)12/100)*invest);
	System.out.println("the investment gonna worth:"+invest);
}
}
