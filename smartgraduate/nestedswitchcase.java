package src.smartgraduate;

public class nestedswitchcase {
public static void main(String[] args) {
	int tech=1;
	int course=1;
	switch(tech) {
	case 1:
		System.out.println("python");
		break;
	case 2:
		switch(course) {
		case 1:
			System.out.println("j2ee");
			break;
		case 2:
			System.out.println("advance java");
		}
	}
	
		
		
}
}
