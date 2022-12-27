import java.util.Scanner;
public class If01 {
	public static void main(String[] args) {
		
		
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("年齢を入力してください");
		int age = myScanner.nextInt();
		if(age > 18) {
			System.out.println("你年龄大于十八，要对自己的行为负责，送入监狱");
		}
		System.out.println("程序继续");
	}
}