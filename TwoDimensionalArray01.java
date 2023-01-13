public class TwoDimensionalArray01 {
	public static void main(String[] args) {
	int[][] arr = {{1,2,3,4,5,6},
					{1,2,3,4,5,6}};
	
	//二维数组的个数 arr.length（2个）
	//第一个一位数组的第二个值 arr【0】【1】
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println("");
	}
	}
}