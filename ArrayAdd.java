public class ArrayAdd {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] arrNew = new int [arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		//把4赋给arrNew最后一个元素
		arrNew[arrNew.length - 1] = 4;
		//让 arr 指向 arrNew ，
		arr = arrNew;
		System.out.println("====arr扩容后元素情况====");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}