public class AirthmeticOperatorExercise {
	public static void main(String[] args) {
		//12345天一共有几个星期零几天
		//思路分析
		//int变量day 12345  weeks 零几天lastdays 
//		int days = 12345;
//		int weeks = 12345 / 7;
//		int lastDays = 12345 % 7;
//		System.out.println("一共有" + weeks + "个星期零" + lastDays + "天");
		
		//设置变量 double fahrenheit 变量保存
		//公式5/9*(fahrenheit-100);= temperature
		
		double fahrenheit = 234.5;
		double temperature = 5.0 / 9.0 * (fahrenheit - 100);//double  int  xiangchuzhongdian
		System.out.println("华氏温度时是" + temperature);
	}
}