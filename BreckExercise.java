import java.util.Scanner;
public class BreckExercise {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String  name = "";
		String passwd = "";
		int chance = 3;//登录一次，就少一次
		for(int i = 1; i <= 3; i++) {
			System.out.println("请输入名字");
			name = myScanner.next();
			System.out.println("请输入密码");
			passwd = myScanner.next();
			if("丁真".equals(name) &&
					"666".equals(passwd)) {
				System.out.println("恭喜你，登录成功～");
				break;
			}
			chance --;
			System.out.println("你还有" + chance + "次登录机会");
		}
	}
}