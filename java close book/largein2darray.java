package src.smartgraduate;

import java.util.Arrays;

public class largein2darray {
	public static void main(String[] args) {
		int [][]arr= {{30,25},{10,19},{69,55},{42,57},{14,99}};
		System.out.println("this is the array:");
		System.out.println(Arrays.deepToString(arr));
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0]>arr[i][1]) {
				System.out.println("in the row"+i+",the greatest element is:"+arr[i][0]);
			}
			else {
				System.out.println("in the row"+i+",the grestest element is:"+arr[i][0]);
			}
			
		}
		
	}

}
