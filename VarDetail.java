public class VarDetail {
	public static void main(String[] args) {
	char c1 = 'a';
	char c2 = '\t';
	char c3 = '韩';
	char c4 = 97;  //说明字符可直接存放数字；
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);   //当输出c4时会输出97表示的字符a 编码的概念
	
	
	/*char本质是一个整数 在输出时 是unicode码对应的字符
	char a = 97;
	
	char字符可以进行运算 相当于一个整数 因为他都有对应的unicode码
	*/
	System.out.println('a' + 1); //97+1=98
	char c5 = ('d' + 1);
	System.out.println((int)c5);
	System.out.println(c5);
	
	
	//ASCII编码表网上可查
	}
	}