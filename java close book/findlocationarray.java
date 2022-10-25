package src.smartgraduate;

import java.util.Scanner;

public class findlocationarray {
	public static void main(String[] args) {
		int arr[]= {2,3,5,7,9};
		System.out.println("enter the element to be search:");
		Scanner in=new Scanner(System.in);
		int search=in.nextInt();
		boolean check=true;
		for(int idx=0;idx<5;idx++) {
			if(search==arr[idx]) {
				System.out.println("the element located in:"+idx);
				check=true;
			}
		}
		if(check) {
			System.out.println("the element is not located in this array!!");
		}
	}

}
