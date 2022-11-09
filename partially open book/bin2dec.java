package partiallyopen;

import java.util.Scanner;

public class bin2dec {
public static void main(String[] args) {
	String str;
	System.out.println("enter the binary string:");
	Scanner in=new Scanner(System.in);
	str=in.next();
	boolean
	isvalied=false;
	char ch;
	for(int get=0;get<str.length();get++){
		ch=str.charAt(get);
		if(ch=='0'||ch=='1') {
			isvalied=true;
			
		}
		else {
			isvalied=false;
			break;
			
		}
	}
	if(isvalied) {
		int decimal=Integer.parseInt(str,2);
		System.out.println("the equivalent decimal"+"\""+str+"\"is:"+decimal);
		
	}
	else
		System.out.println("error :invalied binary string"+"\""+str+"\"");
}
}
