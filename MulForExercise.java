import java.util.Scanner;
public class MulForExercise {
	public static void main(String[] args) {
		//先写一个班五个人每个人的成绩
		//统计三个班的    int c = 0；
		Scanner myScanner = new Scanner(System.in);
		double sum1 = 0;              //三个班的总分
		int passNum = 0;
		for (int b = 1; b <= 3; b++ ) {    //表示班级
			
		
			double sum = 0;        //定义一个班级的总分
		for (int a = 1; a <= 5; a++) {
			System.out.println("输入第" +b+ "个班的第" +a+ "个学生的分数");
			double score = myScanner.nextDouble();    //接收到学生的成绩
			if (score >= 60) {
				passNum++;//当一个人的成绩>=60  passNum++
			}
			sum1 += sum;
			sum += score;                                  //一个班级的五个人的总分
			System.out.println("第"+a+"的分数是"+score);
		
		}
		System.out.println("五个人的平均分是" + (sum / 5));
		}
		System.out.println("三个班的平均分=" +(sum1/15));
		System.out.println("及格人数="+ passNum);
		
	
	}
}