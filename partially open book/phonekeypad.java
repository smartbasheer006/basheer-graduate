package partiallyopen;

import java.util.Scanner;

public class phonekeypad {
public static void main(String[] args) {
phonekeypad aphonekeypad=new phonekeypad();
aphonekeypad.run();
}
private void run() {
	Scanner in=new Scanner(System.in);
	String str;
	System.out.println("please enter the string:");
	str=in.next();
	int digit=0;
	for(int i=0;i<str.length();i++) {
		switch(str.toUpperCase().charAt(i)) {
		case'a': case'b': case'c':
		digit=2;
		break;
		case 'd': case 'e': case'f':
			digit=3;
			break;
			case'g':case'h':case'i':
				digit=4;
				break;
			case'j':case'k':case'l':
				digit=5;
				break;
			case'm':case'n':case'o':
				digit=6;
				break;
			case'p': case'q': case'r':
				digit=7;
				break;
				case 's': case 't': case'u':
					digit=8;
					break;
					case'v':case'w':case'x':case'y':case'z':
						digit=9;
						break;
					
		}
		System.out.println(digit);
	}
	System.out.println();
}
	
}


