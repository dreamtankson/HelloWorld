import java.util.Scanner;
public class If01 {
	public static void main(String [] args) {
		//定义一个Scanner 对象
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		//把年龄保存到一个变量 int age
		int age = myScanner.nextInt();
		//使用if 判断， 输出信息
		if(age > 18) {
			System.out.println("你的年龄大于18，"
					+ "要对自己的行为负责，送入监狱");
}	
		System.out.println("程序继续...");
		}
	}
