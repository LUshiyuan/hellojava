import java.util.Scanner;
public class ArrayAdd {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
			int[] arr = {1,2,3};
		do {	
			
			int[] arrNew = new int[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
			}
			System.out.println("请输入需要添加的数字");
			int num = myScanner.nextInt();
			arrNew[arrNew.length - 1] = num;
			arr = arrNew;
			
			for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
			}
			System.out.println("是否继续添加");
			char key = myScanner.next().charAt(0);
			if (key == 'n') {
				break;
			}
		} while(true);
		
		
//		int[] arr = {1,2,3};
//		int[] arrNew = new int[arr.length + 1];
//		for (int i = 0; i < arr.length; i++) {
//			arrNew[i] = arr[i];
//		}
//		arrNew[arrNew.length - 1] = 4;
//		arr = arrNew;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
	}
}