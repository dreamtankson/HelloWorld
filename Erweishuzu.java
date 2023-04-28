public class Erweishuzu {
	public static void main(String[] args) {
		int[][] arr = { {0,0,0,0,0,0},
				        {0,0,1,0,0,0},
				        {0,2,0,3,0,0},
				        {0,0,0,0,0,0} };
		System.out.println("二位数组的元素个数=" + arr.length);
		System.out.println("第三个一位数组的第4个值=" + arr[2][3]);
		//输出二维图形
		for(int i = 0; i < arr.length; i++ ) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + "");
			}
			System.out.println();
		}
	}
}