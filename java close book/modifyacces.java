package src.smartgraduate;

public class modifyacces {
public static void main(String[] args) {
	int d=10;//it is right so no error
	final int n=100;// constant variable
	int a=10;//static member inside a static method
}
int test(int b) {
	//static int's c=b; error,static can't go inside non static
	//static is only executed inside
	return 0;
	
}
test ts=new test();
//ts.test();  show an error
}
//class is created
class test{
	int test(int i) {
		return i;
	}

}
