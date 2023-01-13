public class TwoDimensionalArray {
	public static void main(String[] args) {
		int q = 0;
		int arr[][] = {{4,6},{1,4,5,7},{-2}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				q += arr[i][j];
			}
		}
		System.out.println(q);
	}
}