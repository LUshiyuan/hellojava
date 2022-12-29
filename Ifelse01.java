import java.util.Scanner;
public class Ifelse01 {
	public static void main(String[] args) {
		System.out.println("请输入月份");
		Scanner myScanner = new Scanner(System.in);
		int month = myScanner.nextInt();
		
		if (month == 4 ) {
			System.out.println("请输入年龄");
			int Nianling = myScanner.nextInt();
			if (18 < Nianling && Nianling < 60 ) {
				System.out.println("60");
			} else if (Nianling < 18) {
				System.out.println("半价");
			} else if (Nianling > 60) {
				System.out.println("3/1");
			}
		} else {
			System.out.println("请输入年龄");
			int Nianling = myScanner.nextInt();
			if (18 < Nianling && Nianling < 60) {
				System.out.println("40");
			} else {
				System.out.println("20");
		}
		}
	}
}