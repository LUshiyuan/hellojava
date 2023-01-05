import java.util.Scanner;
public class ArrayReduce {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
	/*
	 * 先创建原始数组【12345】
	 * 在创建一个缩减一个值后的数组【1234】 int arrnew【arr。length-1】
	 */ //Newarr 1,2,3,4
	int[] arr = {1,2,3,4,5};
	do {
		int[] arrNew = new int[arr.length - 1];
		//用for循环导入数组
		for (int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
			
			arr = arrNew;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.println("数否继续缩减n/y");
			char q = myScanner.next().charAt(0);
			if (q == 'n') {
				break;
			}
		}
	} while (true);
	
	}
}