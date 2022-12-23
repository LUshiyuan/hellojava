public class LogicOperator01 {
	public static void main(String[] args) {
		//短路或 和 逻辑或 演示
		int age = 50;                    //短路或语
		if(age > 20 || age < 60) {
			System.out.println("OK11");
		}
		
		
		
		if(age > 90 | age < 90) {          //逻辑或语
			System.out.println("ok22");
		}
		
		
		int a = 1;
		
		
		
		if(a > 1 || a++ < 5) {
			System.out.println("11");
			//                        ||如果第一个条件为true 则第二个条件不会判断最终结果直接为true 效率高
		}
		
		
		
		if(a >= 9 | a++ < 5) {
			System.out.println("11a");
			//                         | 对逻辑或而言不管第一个条件是否为true 都要判断第二个条件 效率低
		}
	}
}