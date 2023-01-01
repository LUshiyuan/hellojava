import java.util.Scanner;
public class BreakExercise01 {
	public static void main(String[] gras) {
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;
		for (int a = 1; a <= 3; a++) {
			System.out.println("请输入名字");
			name = myScanner.next();
			System.out.println("请输入密码");
			passwd = myScanner.next();
			if ("丁真".equals(name) && "666".equals(passwd)) {
				System.out.println("登录成功");
				break;
			} 
			chance--;
			System.out.println("你还有"+chance+"次机会");
		}
	}
}