package partiallyopen;

public class fibonacccint {
public static void main(String[] args) {
	int i=0;
	int fiboterm=fibo(i);
	while(Integer.MAX_VALUE-fibo(i-1)>=fibo(i-2)) {
		System.out.println("f("+i+")="+fibo(i));
		i++;
	}
	System.out.println("f("+i+")is out the range of int:");
}
public static int fibo(int n) {
	if(n<2) {
		return 1;
	}
	return fibo(n-1)+fibo(n-2);
}
}
