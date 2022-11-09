package partiallyopen;

public class copy {
public static void main(String[] args) {
	int []arr= {30,56,15,22,45};
	int[]arrcpy=copy(arr);
	System.out.println("the element on the copied array are");
	for(int i=0;i<arrcpy.length;i++) {
		System.out.println(arrcpy[i]+" ");
	}
}
public static int[]copy(int[]arr){
	int[]copy=arr;
	return copy;
}
}
