public class While01 {
	public static void main(String[] args) {
		int i = 1;//循环变量初始化
		while( i <= 10) {//循环条件
			System.out.println("你好，韩顺平教育" + i);//执行语句
			i++;//没有的话就会无限循环！
		}
		System.out.println("退出while循环，继续执行");
	}
}