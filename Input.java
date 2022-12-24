import java.util.Scanner;  //表示把java。ntil下的Scanner类导入
public class Input {
	public static void main(String[] args) {
		
		//演示
		//Scanner类 表示简单的文本扫描器
		//引入导入Scanner类所在的包
		//创建Scanner对象 new 创建一个对象  er就是Scanner类的对象  
		
		Scanner er = new Scanner(System.in);
		
		System.out.println("请输入名字");//当程序执行到next方法时 会等待用户输入…………
		String name = er.next();//接收用户的输入
		
		System.out.println("请输入年龄");
		int age = er.nextInt();//接收用户的输入 int法
		
		System.out.println("请输入薪水");
		double sal = er.nextDouble();//接收 double法
		
		System.out.println("个人信息如下");
		System.out.println("名字=" + name + "年龄=" + age + "薪水=" + sal);
	}
}