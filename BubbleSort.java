public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {23,45,34,41,89,-79,-31};
		int temp = 0;//用于辅助变量
		for( int i = 0; i < arr.length - 1; i++) {//外层循环是四次
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}
			}
			System.out.println("\n==第"+(i+1)+"轮==");
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "\t");
			}
			
		}
	}
}