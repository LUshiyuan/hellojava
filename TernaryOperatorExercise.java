public class TernaryOperatorExercise {
	public static void main(String[] args) {
		int n1 = 55;
		int n2 = 33;
		int n3 = 123;
		//思路 先得到n1和n2种的最大值 保存到max1
		//在求出max1 和 n3 中的最大数 保存到max2
		
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println(max2);
		
//		//可以一条语句实现
//		int max2 = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
//		System.out.println(max2);
	}
}	
