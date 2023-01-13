public class Method01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.speak();
		
		p1.cal02(5);
		
		//
		int returnRes = p1.getSum(3,12);
		System.out.println(returnRes);
	}
}
class Person {
	String name;
	int age;
	
	public void speak() {
	System.out.println("我是一个好人");
	}
	
	//void表示方法没有返回值
	public void cal02(int n) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			res += i;
		}
		System.out.println(res);
	}
	
	//添加getSum成员方法 计算两个数的和
	//public 表示方法是公开的
	//int 表示方法执行后返回一个int值
	//getSum 方法名
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
}