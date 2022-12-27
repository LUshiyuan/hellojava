import java.util.Scanner;
public class If04 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入芝麻信用分");
		int grade = myScanner.nextInt();
		if (grade == 100) {
			System.out.println("信用极好");
		} else if (80 < grade && grade <= 99) {
			System.out.println("信用优秀");
		} else if (grade >= 60 && grade <= 80) {
			System.out.println("信用一般");
		} else {
			System.out.println("不及格");
		}
	}
}