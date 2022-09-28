package src.smartgraduate;

import java.util.Scanner;

public class square {
public static void main(String[] args) {
	System.out.println("enyer the side of square");
	Scanner scan=new Scanner(System.in);
	double side =scan.nextDouble();
	double area=side*side;
	System.out.println("area of thesquare is"+area);
	
}
}
