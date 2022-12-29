import java.util.Scanner;
public class SwitchExercise {
	public static void main(String[] ages) {
		System.out.println("输入字母");
		Scanner myScanner = new Scanner(System.in);
		char n1 = myScanner.next().charAt(0);
		switch (n1) {
		case 'a' :
			System.out.println("A");
			break;
		case 'b' :
			System.out.println("B");
			break;
		case 'c' :
			System.out.println("C");
			break;
		case 'd' :
			System.out.println("D");
			break;
		case 'e' :
			System.out.println("E");
			break;
			default:
				System.out.println("other");
			}
	}
}