import java.util.Scanner;
public class Nestedlf {
	public static void main(String[] Args) {
		System.out.println("输入决赛成绩");
		Scanner myScanner = new Scanner(System.in);
		double score = myScanner.nextDouble();

		if (score > 80.089) {
			System.out.println("进入决赛");
			System.out.println("输入性别");
			char gender = myScanner.next().charAt(0);
			if (gender == '男') {
				System.out.println("进入男子组");
			} else if (gender == '女') {System.out.println("进入女子组");
			
			} else System.out.println("输入有误 请重新输入");
		} else System.out.println("淘汰"); 
	}
}