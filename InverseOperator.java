public class InverseOperator {
	public static void main(String[] args) {
		
		//  !  操作是相反
		System.out.println(80 > 30);
		System.out.println(!(80 > 30));
		
		// a^b 逻辑异或  当a和b不同时 则结果为true 否则为假
		boolean b = (10 > 1) ^ (10 < 3);
		System.out.println("b=" + b);
	}
}
