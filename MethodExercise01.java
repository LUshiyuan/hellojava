public class MethodExercise01 {
	public static void main(String[] args) {
		AA a = new AA();
//		if ( a.isOdd(6)) {
//			System.out.println("奇数");
//		} else {
//			System.out.println("偶数");
//		}
		a.printChar(5, 3, 'o');
		
		
	}
}
class AA {
	/*
	 * 判断一个数是odd奇数还是偶数
	 * 方法的返回类型   boolean
	 * 方法的名字      isOdd
	 * 方法的行参     （int num）
	 * 方法体        判断
	 */
	public boolean isOdd(int num) {
		//return num % 2 != 0 ? true; false;
		return num % 2 != 0; //true false
	}
	/*
	 * 思路
	 * 方法返回类型  void
	 * 方法名字   printChar
	 * 方法的行参   （int row，int col，char c）
	 * 方法体  循环
	 */
	public void printChar(int row, int col, char c) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(c);
			}
			System.out.println(); //换行
		}
	}
}