package src.smartgraduate;

import java.util.Arrays;

public class ascentodescen {
	private static Object arrays;

	public static void main(String[] args) {
		int arr[]= {30,40,13,20,59,90};
		int temp;
		System.out.println(Arrays.toString(arr));
		System.out.println("");
		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		System.out.println("array in asscending order:"+Arrays.toString(arr));
		System.out.println("");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("array in descending order:"+Arrays.toString(arr));
	}

}
