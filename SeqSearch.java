import java.util.Scanner;
public class SeqSearch {
	public static void main(String[] args) {
		String[] name = {"白眉鹰王","金毛狮王","紫衫龙王","老大王"};
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入名字");
		String fingName = myScanner.next();
		
		int index = -1;
		for (int i = 0; i < name.length; i++) {
			if (fingName.equals(name[i])) {
				System.out.println("已找到");
				System.out.println("下标为" + i);
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("没找到");
		}
		
	}
}