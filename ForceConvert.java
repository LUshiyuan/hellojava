public class ForceConvert {
	public static void main(String[] args) {
		//数据大 =》 小需要强制转换
		//演示强制类型转换
		int n1 = (int)1.9;
		System.out.println("n1=" + n1);//1 造成精度损失
		
		
		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b1=" + b1);//-48 造成数据溢出
		
		
		//强转符号只针对于最近的操作有效 往往会使用小括号提升优先级
		//int x = (int)10*3.5+6*1.5;编译错误
		int x = (int)(10*3.5+6*1.5); //44  double(44.0=>44)int
		System.out.println(x);
		
		//char c1 = 100;
		int m = 100;
		char c3 = (char)m;
		System.out.println(c3); //输出100对应的字符d
	}
}