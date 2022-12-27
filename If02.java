import java.util.Scanner;
public class If02 {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入年龄");
		int age = myScanner.nextInt();
		if(age > 18) {
			System.out.println("大于十八岁要对自己负责，进监狱");
		} else {
			System.out.println("年龄不够 放过你了");
		}
	}
}