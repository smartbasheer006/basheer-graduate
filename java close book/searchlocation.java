package src.smartgraduate;

import java.util.Scanner;

public class searchlocation {
public static void main(String[] args) {
	int arr[]= {30,69,19,25,22,40,30};
	System.out.println("enter the element to be searched:");
	Scanner in=new Scanner(System.in);
	int search=in.nextInt();
	boolean check=true;
	int count=0;
	for(int idx=0;idx<arr.length;idx++) {
		if(search==arr[idx]) {
			System.out.println("the searched element located in:"+idx);
			check=false;
			count++;
		}
	}
	if(check) {
		System.out.println("the searched element is not in the array");
	}
	else {
		System.out.println("the searched number repeats"+count+"number of times");
	}
}
}
