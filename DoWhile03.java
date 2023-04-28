public class DoWhile03 {
	public static void main(String[] args) {
		int i =  1;
		int count = 0;//统计满足个数条件
		do {
			if( i % 5 == 0 && i % 3 != 0) {
				System.out.println("i=" + i);
				count++;
			}
			i++;
		}while(i <= 200);
	}
}