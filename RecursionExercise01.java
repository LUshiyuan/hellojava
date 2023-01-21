public class RecursionExercise01 {
	public static void main(String[] args) {
		ba a = new ba();
		a.feibonaqie(6);
	}
}
class ba {
	public int feibonaqie(int n) {
		if (n >= 1) {
			if (n == 1 || n == 2) {
				return 1;
			} else {
				return feibonaqie(n-1) + feibonaqie(n-2);
			}
		} else {
			System.out.println("输入错误");
			return -1;
		}
	}
}