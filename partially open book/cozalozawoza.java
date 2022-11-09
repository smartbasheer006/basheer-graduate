package partiallyopen;

public class cozalozawoza {
public static void main(String[] args) {
	final int lowerbound=1,upperbound=110;
	for(int num=lowerbound;num<=upperbound;++num) {
		if(num%3==0) {
			System.out.println("coza");
		}
		if(num%5==0) {
			System.out.println("loza");
		}
		if(num%7==0) {
			System.out.println("woza");
		}
		if(num%3==0&& num%5==0) {
			System.out.println("cozalaza");
		}
		if(num%11==0) {
			System.out.println();
		}
		else {
			System.out.println("space");
		}
	}
}
}
