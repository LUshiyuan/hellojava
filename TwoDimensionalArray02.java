public class TwoDimensionalArray02 {
	public static void main(String[] args) {
		/*
		 * 输出
		 * 1
		 * 22
		 * 333
		 * 4444
		 */
		int[][] arr = new int[3][];
		for (int i = 0; i < arr.length; i++) {
			//给每个一维数组开空间
			arr[i] = new int[i + 1];
		
			//遍历一维数组 并赋值
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j] = i + 1;
		}
		
			
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}
}
