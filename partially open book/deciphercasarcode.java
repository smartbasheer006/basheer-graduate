package partiallyopen;

import java.util.Scanner;

public class deciphercasarcode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input the ciphertext string:");
		String ciphertext=sc.nextLine();
		System.out.println("\n enter the shift value:");
		int shift=sc.nextInt();
		String decryptmessage="";
		for(int i=0;i<ciphertext.length();i++) {
			char alphabet=ciphertext.charAt(i);
			if(alphabet >='a'&& alphabet<='z') {
				alphabet=(char)(alphabet-shift);
				if(alphabet<'a') {
					alphabet=(char)(alphabet-'a'+'z'+1);
				}
				decryptmessage=decryptmessage+alphabet;
			}
			else {
				decryptmessage=decryptmessage+alphabet;
			}
		}
		System.out.println("\n theplaintext string is:"+decryptmessage);
	}

}
