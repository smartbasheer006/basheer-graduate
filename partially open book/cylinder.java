package partiallyopen;

import java.util.Scanner;

public class cylinder {
public static void main(String[] args) {
	double radius,surarea,basearea;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the radius of cylinder:");
	radius=s.nextDouble();
	basearea=Math.PI*radius*radius;
	surarea=2.0*Math.PI*radius+2.0*basearea;
	System.out.printf("surface area is:%.2f%n",surarea);
	System.out.printf("basearea is:.2f%n",basearea);
}
}
