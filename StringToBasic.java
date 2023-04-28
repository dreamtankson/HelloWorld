public class StringToBasic {
	public static void main(String[] args) {
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + " " + s2 + " " +s3 + " "+ s4);		

		String s5 = "123";
		//String s5 ->对应的基本数据类型
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		short num4 = Short.parseShort(s5);
		long num5 = Long.parseLong(s5);
		byte num6= Byte.parseByte(s5);
		boolean b = Boolean.parseBoolean("true");
		System.out.println("=============");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(b);	
		//怎么把字符串转成字符 char ->含义是指 把字符串的第一个字符得到
		//解读 s5.charAt（0） 得到 s5字符串的第一个字符
		System.out.println(s5.charAt(0));
		
	}
}