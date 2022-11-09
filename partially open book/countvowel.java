package partiallyopen;

import java.util.Scanner;

public class countvowel {
public static void main(String[] args) {
	String line;
	double dig,vow;
	Scanner sc=new Scanner(System.in);
	System.out.println("\nenter the string");
	line=sc.next();
	int vowels=0,digits=0;
	line=line.toLowerCase();
	for(int i=0;i<line.length();i++) {
		char ch=line.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			++vowels;
		}
		else if(ch>='0'&&ch<='9') {
			++digits;
		}
		
	}
	vow=vowels/line.length();
	dig=digits/line.length();
	System.out.println("no of vowels in string:"+vowels+" "+vow);
	System.out.println("no of digits in string:"+digits+" "+dig);
}
}
