import java.util.Scanner;

public class SeqSwarch {
	public static void main(String[] args) {
		String[]names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼幅王"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String findName =myScanner.next();
		for(int i = 0; i < names.length; i++) {
			if(findName.equals(names[i])) {
				System.out.println("恭喜你找到" + findName);
				System.out.println("下标为=" + i);
				break;//退出
				
			}
		}
	}
}