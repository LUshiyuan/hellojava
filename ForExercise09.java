public class ForExercise09 {
	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {   //表示层数
			for (int k = 1; k <= 5 - a; k++) {
				System.out.print(" ");
			}
			for (int b = 1; b <= 2 * a - 1; b++) {
				if(b == 1 || b == 2 * a - 1 || a == 5) {
					System.out.print("*");
				} else 
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
 }