public class OverLoadExercise {
	public static void main(String[] args) {
		
		
		
		
		Methods method = new Methods();
		System.out.println(method.max(2.2, 30.5));
		System.out.println(method.max(2.2, 30.5, 6.5));
		System.out.println(method.max(2, 30));
		
		
		
		method.m(4);
		method.m(10, 20);
		method.m("奥力给");
		
	}
}
class Methods {
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2, double n3) {
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
		
	}
	
	
	
	public void m(int n) {
	System.out.println("平方=" + (n * n));
	}
	public void m(int n1, int n2) {
		System.out.println("相乘=" + (n1 * n2));
	}
	public void m(String str) {
		System.out.println("字符串=" + str);
	}
	
}