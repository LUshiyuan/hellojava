public class Double {
	public static void main(String[] sarg) {
		double num1 = 2.7;
		double num2 = 8.1 / 3;  //小数除得到一个近似得数的小数  电脑以为8.1是8.1000000001；
		System.out.println(num2);
		
//		if ( num1 == num2 ) {
//			System.out.println("相等");
//		if ( num1 > num2 ) {
//			System.out.println("11");
//			
			
		if (Math.abs(num1 - num2 ) < 0.0000001 ) {
			System.out.println("差值很小 认为相等");
			//以两个数相差值的绝对值在某一个精度的范围判断
		}
		}
//		}
//	}
} 