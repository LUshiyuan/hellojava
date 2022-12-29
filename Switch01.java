import java.util.Scanner;
public class Switch01 {
	public static void main(String[] args) {
		System.out.println("输入a-g");
		Scanner myScanner = new Scanner(System.in);
		char c1 = myScanner.next().charAt(0);

		switch(c1) {
		case 'a' :
			System.out.println("星期一");
			break;
		case 'b' :
			System.out.println("星期二");
			break;
		case 'c' :
			System.out.println("星期三");
			default:
				System.out.println("输入有误 无匹配");
		}
		System.out.println("继续操作");
		
	}
}