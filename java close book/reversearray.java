package src.smartgraduate;

import java.util.Arrays;

public class reversearray {
	public static void main(String[] args) {
		int[]arr={12,34,2,5,6};
		System.out.println("the array:"+Arrays.toString(arr));
	System.out.println();
	int temp;
	int a=arr.length-1;
	System.out.println("reverse of array is:");
	for(int i=a;i>=0;i--) {
		System.out.println(arr[i]+" ");
	}
	
	
	}

}
