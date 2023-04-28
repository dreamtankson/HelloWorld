public class RecursionExercise01 {
	public static void main(String[] args) {
		T t1 = new T();
		int day = 1;
		int peachNum = t1.peach(day);
		if(peachNum != -1) {
			System.out.println("第" + day + "天有" +peachNum + "个桃子");
		}
	}
}
class T {
	public int fibonacci(int n) {
		if(n >= 1) {
			if(n == 1 || n == 2) {
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n-2);
			}
		} else {
			System.out.println("要求输入的 n>=1的整数");
			return - 1;
			
		}
	}
	public int peach(int day) {
		if(day == 10) {
			return 1;			
		} else if ( day >= 1 && day <= 9) {
			return (peach(day + 1) + 1) * 2;
		} else {
			System.out.println("day在1-10");
			return -1;
		}
	}
}