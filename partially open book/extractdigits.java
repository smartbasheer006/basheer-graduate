package partiallyopen;

public class extractdigits {
public static void main(String[] args) {
	int num=98765,rev=0;
	while(num>0) {
		int reaminder=num%10;
		rev=rev*10-reaminder;
		num=num/10;
	}
	System.out.println("the reverse of the given number is:"+rev);
}
}
