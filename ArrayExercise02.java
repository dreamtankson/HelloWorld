public class ArrayExercise02 {
	public static void main(String[] args) {
		int[] arr = {4,-1,9,10,23,110,239,990,129};
		int max = arr[0];//假定第一个元素就是最大值
		int maxIndex  = 0;
		
		for(int i = 1;  i < arr.length; i++) {//从下标1 开始遍历arr
			
			if(max < arr[i]) {//如果max < 当前元素
				max = arr[i];//把max设置成 当前元素
				maxIndex = i;
				
			}
		}
		//当我们遍历这个数组arr后，max就是真正的最大值，maxIndex最大值下标
		System.out.println("max=" + max + "maxIndex" + maxIndex);
		
	}
}