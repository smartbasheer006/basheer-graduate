package src.smartgraduate;

import java.util.Scanner;

public class triangle {
public static void main(String[] args) {
	Scanner Scanner=new Scanner(System.in);
	System.out.println("enter the width of the triangle:");
	double base=Scanner.nextDouble();
	System.out.println("enter the heigth of the rectangle:");
	 double height=Scanner.nextDouble();
	 double area=(base* height)/2;
	System.out.println("area of the triangle is"+area);
	
	
}
}
