public class DoWhileExercise {
	public static void main(String[] args) {
		int a = 1;
		int h = 0;
		//int count = 0;
		do {
			//if (a % 5 == 0 && a % 3 != 0) {
			System.out.println("a=" + a);
			System.out.println("h=" + (h += a));
		//	count++;
		//	}
			a++;
			

		}
		
		while (a <= 100); 
		//System.out.println(count);
	}
}