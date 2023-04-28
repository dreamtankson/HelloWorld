public class ForceConvertDetail {
	public static void main(String[] args) {
		int x = (int)(10*3.5+6*1.5);
		System.out.println(x);//44	
		int m =100;//ok
		//char c2 = m错误 , int>char
		char c3 = (char)m;//ok
		System.out.println(c3);//100相对应的字符，d
	}	
}