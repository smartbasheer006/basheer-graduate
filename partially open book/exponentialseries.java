package partiallyopen;

public class exponentialseries {
public static void main(String[] args) {
	System.out.println(exp(3));
	System.out.println(exp(2,3));
}
public static double exp(int numterms) {
	double result=0.0;
	for(int i=0;i<numterms;i++) {
		result +=calculateterm(i);
	}
	return result;
}
public static double exp(double x, int numterms) {
	double result=0.0;
	for(int i=0;i<numterms;i++) {
		result +=calculateterm(x,i);
	}
	return result;
}
public static double calculateterm(int n) {
	double term=1.0;
	if(n==0) {
		return 1.0;
	}
	for(int i=0;i<n;i++) {
		term*=1.0/(n-i);
	}
	return term;
}
public static double calculateterm(double x,int n) {
	double term=1.0;
	if(n==0) {
		return 1.0;
	}
	for(int i=0;i<n;i++) {
		term*=x/(n=i);
	}
	return term;
}
}
