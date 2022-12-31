import java.util.Scanner;
public class For05 {
	public static void main(String[] args) {
	
		Scanner myScanner = new Scanner(System.in);
		
		double num1 = 0;   //三个班的总成绩
		int j = 0;           //三个班的及格人数
		for (int b = 1; b <= 3; b++) {          //班级的循环
			double num = 0;   //一个班的总成绩 
		for (int a = 1; a <= 5; a++) {          //每个人的循环
			System.out.println("请输入第" +b+ "个班的第" +a+ "名学生的分数");
			double score = myScanner.nextDouble();
			System.out.println("第"+b+"个班的第" +a+ "个学生的成绩=" +score );
			if (score >= 60) {
				j++;
			}
			num += score;                       //一个班的总成绩
	
			num1 += num;                   //三个班的总成绩

			}
				System.out.println("第" +b+ "个班5个人的平均分=" +(num / 5));
		}
		System.out.println("三个班的平均分=" +(num1 / 15));
		System.out.println("三个班的及格人数=" +j);
	}
}