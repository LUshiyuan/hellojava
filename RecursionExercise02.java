public class RecursionExercise02 {
	public static void main(String[] args) {
		ba a = new ba();
		
		
		int day = 1;
		int peachNum = a.peach(day);
		if (peachNum != -1) {
			System.out.println("第"+ day +"天有"+ peachNum +"个桃");
		}
	}
}
class ba { 
	public int peach(int day) {
		if (day == 10) {
			return 1;
		} else if (day >= 1 && day <= 9) {
			return (peach(day + 1) + 1) * 2;
		} else {
			System.out.println("输入错误");
			return -1;
		}
		
	}
}