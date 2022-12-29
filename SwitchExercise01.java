import java.util.Scanner;
public class SwitchExercise01 {
	public static void main(String[] args) {
		System.out.println("输入分数");
		Scanner myScanner = new Scanner(System.in);
		int score = myScanner.nextInt();
		if (score < 100 && score > 0) {
			
		
		switch((int)(score / 60)) {
		case 0 :
		System.out.println("不及格");
		break;
		case 1 :
		System.out.println("及格");
		break;
//		default:
//			System.out.println("输入有误"); 
		}
		}else {
			System.out.println("请把成绩输入在0-100之间");
		}
		}
	}
