public class TernaryOperatorDetail {
	public static void main(String[] args) {
		
		//如果true 输出第一个 否则输出第二个  ？ ： 
		int a = 1;
		int b = 2;
		int c = a > b ? (int)1.1 : (int)2.1;
		System.out.println(c);
		
		
		//满足int =》 double
		double d = a > b ? a : b + 3;
		System.out.println(d);
	}
}