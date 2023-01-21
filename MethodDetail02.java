public class MethodDetail02 {
	public void main(String[] args) {
		A a = new A();
		//a.sayOk();
		
	
		a.mi();
	}
}
class A {
	public void print(int n) {
		System.out.println("print方法被调用");
	}

	public void sayOk() {
		print(10);
		System.out.println("继续执行sayOk");
	}
	public void mi() {
		System.out.println("m1方法被调用");
		B b = new B();
		b.hi();
		
		System.out.println("m1继续执行");
	}
}
class B {
	public void hi() {
		System.out.println("b类中hi方法被调用");
	}
}