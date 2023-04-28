public class CharDetail {
	public static void main(String[] args) {
		//要输出对应的数字，可以用(int)字符
		char c1 = 97;//输出97相对应的字母
		System.out.println(c1);		
		char c2 = 'a';//输出‘a’相对应的数字
		System.out.println((int)c2);
		char c3 = '韩';//输出‘韩’相对应的数字
		System.out.println((int)c3);
		char c4 = 38889;//输出38889相对应的汉字
		System.out.println(c4);
		System.out.println('a'+10);//107
		char c5 = 'b'+1;//98+1=99
		System.out.println((int)c5);//99
		System.out.println(c5);//99对应的字符
	}
}