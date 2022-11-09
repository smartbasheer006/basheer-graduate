package partiallyopen;

public class factorialint {
public static void main(String[] args) {
	int i=1;
	int fact=1;
	while(Integer.MAX_VALUE/fact>=(i+1)) {
		fact=factl(i);
		System.out.println("the factorial of"+i+"is"+fact);
		i++;
	}
	System.out.println("the factorial of "+i+"is out of range");
}
public static int factl(int n) {
	if(n<2) {
		return 1;
	}
	return n*factl(n-1);
}
}
