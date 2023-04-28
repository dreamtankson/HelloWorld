public class ForExercise {
	public static void main(String[] args) {
		int count = 0;//统计9的倍数个数 变量
		int sum = 0;//总和
		int start = 10;
		int end = 200;
		int t = 9;//倍数
		for(int i = start; i <= end; i++) {
			if(i % t == 0) {
				System.out.println("i=" + i);
				count++;
				sum += i;//积累
			}
		}
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);
	}
}