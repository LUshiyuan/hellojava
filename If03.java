import java.util.Scanner;
public class If03 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入年龄");
		int ags = myScanner.nextInt();
		if(ags > 20) {
			System.out.println("已成年");
		} else {
			System.out.println("未成年");
		}
		System.out.println("继续执行...");
		
	
	
		System.out.println("输入年薪");
		double okane = myScanner.nextDouble();
		if (okane < 10000) {
			System.out.println("你吃粑粑了？");
		} else {
			System.out.println("理所应当 继续努力");
		}
		System.out.println("In End");
	}
}