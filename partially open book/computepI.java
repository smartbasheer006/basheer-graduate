package partiallyopen;

public class computepI {
public static void main(String[] args) {
	double sum=0.0;
	final int MAX_DENOMINATOR=100000;
	for(int denominator=1;denominator<=MAX_DENOMINATOR;denominator+=2) {
		if(denominator%4==1) {
			sum+=1.0/denominator;
		}
		else if(denominator%4==3) {
			sum-=1.0/denominator;
		}
		else {
			System.out.println("impossible!!!");
		}
	}
	System.out.println("the sum is :"+sum);
	System.out.println(Math.PI);
}
}
