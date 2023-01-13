public class Object01 {
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.name = "小猫";
		cat1.age = 3;
		cat1.color = "红色";
		System.out.println("小猫的信息" + cat1.name + cat1.age + cat1.color);
	}
}
class Cat {
	String name;
	int age;
	String color;
}