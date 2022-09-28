package src.smartgraduate;

import java.util.Scanner;

public class rectangle {
public static void main(String[] args) {
	Scanner Scanner=new Scanner(System.in);
	System.out.println("enter the length of the rectangle");
	double length=Scanner.nextDouble();
	System.out.println("enter the width of the rectangle");
	double width=Scanner.nextDouble();
	double area=length*width;
	System.out.println("area of the rectangle is:"+area);
	
}
}
