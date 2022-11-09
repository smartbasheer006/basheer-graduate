package partiallyopen;

public class arithmetic {
public static void main(String[] args) {
	if(args.length!=3) {
		System.out.println("usage:java arithmetic int1 int2 op");
		return;
		
	}
	int opr1=Integer.parseInt(args[0]);
	int opr2=Integer.parseInt(args[1]);
	char opra=args[2].charAt(0);
	System.out.println(args[0]+args[2]+args[1]+"=");
	switch(opra) {
	case '+':
		System.out.println(opr1+opr2);
		break;
	case'-':
		System.out.println(opr1-opr2);
		break;
	case '*':
		System.out.println(opr1*opr2);
		break;
	case'%':
		System.out.println(opr1%opr2);
		break;
	case '/':
		System.out.println(opr1/opr2);
		break;
		default:
			System.out.println("error! invailed operator:");
		
	}	
}
}
