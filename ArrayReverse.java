public class ArrayReverse {
	public static void main(String[] args) {
//		/*
//		 * 把元素内容反转
//		 * arr {11 22 33 44 55 66} > {66 55 44 33 22 11}
//		 * 先把第一个和最后一个互换{66 22 33 44 55 11}
//		 *                     {66 55 33 44 22 11}
//		 *                     {66 55 44 33 22 11}
//		 *需要换三次 arr。length/2
//		 *末尾的下标 arr。length-1-i
//		 */
//		int[] arr = {11,22,33,44,55,66};
//		for (int i = 0; i < arr.length; i++) {
//			int q = arr[arr.length-1-i];
//			arr[arr.length-1-i] = arr[i];
//			arr[i] = q;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		
		
		int[] arr = {11,22,33,44,55,66};
		int[] arr2 = new int[arr.length];
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			arr2[j] = arr[i];
		}
		arr = arr2;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		
	}
}