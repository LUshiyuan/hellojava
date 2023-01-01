public class BreakExercise {
	public static void main(String[] gras) {
		int h = 0;
		int n = 0;
		for (int a = 1; a <= 100; a++) {
			
			h += a;
			if (h > 20) {
				System.out.println(a);
				n = h;
				break;
			}
		}
			System.out.println("n=" +n);
	
	}
}