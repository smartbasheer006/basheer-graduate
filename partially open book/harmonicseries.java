package partiallyopen;

public class harmonicseries {
public static void main(String[] args) {
	final int max_demominator=50000;
	double suml2r=0.0;
	double sum2l=0.0;
	double absdiff;
	for(long denominator =1;denominator<=max_demominator;++denominator) {
		suml2r+=(double)1/denominator;
	}
	System.out.println("the sum from left is:"+suml2r);
	if(suml2r>suml2r) {
		absdiff=suml2r-suml2r;
		System.out.println("difference of series is:"+absdiff);
	}
	else if(suml2r>suml2r) {
		absdiff=suml2r-suml2r;
		System.out.println("difference of series:"+absdiff);
	}
	else {
		absdiff=0;
		System.out.println("difference of series is:"+absdiff);
	}
	
	
}
}
