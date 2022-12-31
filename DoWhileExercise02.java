import java.util.Scanner;
public class DoWhileExercise02 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ' ;
		do {
			System.out.println("打你");
			System.out.println("还不还钱y/n");
			answer = myScanner.next().charAt(0);
			
		}
		while (answer != 'y');
	}
}	