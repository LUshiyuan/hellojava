public class LogicOperator {
	public static void main(String[] args) {
		//&& &使用案例
		int age = 50;  //短路语
		if(age > 20 && age < 60) {
			System.out.println("OK11");
		}
		
		if(age > 90 & age < 90) {  //逻辑语
			System.out.println("ok22");
		}
		int a = 1;
		
		if(a > 1 && a++ < 5) {
			System.out.println("11");
			//&&对短路语而言如果第一个判断语句位false 则不经过第二语句半段直接为否
		}
		if(a >= 9 & a++ < 5) {
			System.out.println("11a");
			//&对逻辑语而言如果第一个语句为false 还经过第二个判断语句
		}
		
			
	}
}	