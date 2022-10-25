package src.smartgraduate;

import java.util.Scanner;

public class daysinmonth {
public static void main(String[] args) {
	int month,year;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the month:");
	month=in.nextInt();
	System.out.println("\nenter the year:");
	year =in.nextInt();
	System.out.println();
	switch(month){
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("number of days is 31:");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println(" munber of daysn is 30:");
		break;
	case 2:
		if((year%400==0)||((year%100!=0)&&(year%4==0))) 
			
			System.out.println("number of days is 29");
		else 
			System.out.println("number od days is 28");
		break;
		default:
			System.out.println("invalied month:");
		break;
			
	}
}

}

			


