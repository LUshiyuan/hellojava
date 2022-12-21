public class AutoConvertDetail {
	public static void main(String[] args) {
//		细节1 //有多种数据类型混合运算时
//		//系统首先自动将所有数据转换成容量大的那种数据类型，然后进行运算
//		int ni = 10;
//		float d1 = n1 + 1.1;//false (float int double)(double高精度给不了佛float低精度）
//		double d1 = n1 + 1.1;//true (double类型可给double）
//		float d1 = n1 + 1.1F;//true（float int float）
//		细节2 //精度大的转不了精度小的
//		int n2 = 1.1;//false(double转换不了int；）
//		
//		
//		
//		细节3 //（byte，short）和char之间不会相互转换
//		//当把具体数值付给byte时 先判断该数值是否在byte范围内 如果是就可以
//		byte b1 = 10;   //byte( -128 - 127 )
//		int n2 = 1;
//		byte b2 = n2;  //false 
//		char c1 = b1; //false byte不能自动转成char
		
//		//细节4  byte short char 它们三者可以计算 在计算时首先转换成为int类型
//		byte b2 = 1;
//		short s1 = 1;
//		short s2 = b2 + s1; //false 先转int 转不了short

		
//		//细节5 boolean不参与转换
//		boolean pass = true;
//		int num11 = pass;  //false
//		
//		//自动提升原则 表达式结果自动提升为操作数中最大的类型
//		byte b4 = 1;
//		short s3 = 1;
//		int num1 = 1;
//		double num2 = 1.1;
//		
//		int num3 = b4 + s3 + num1 + num2;
//		//false 最大的类型为double 转换不了int类型
	}
}