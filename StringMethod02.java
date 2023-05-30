package com.hspedu.String_;

public class StringMethod02 {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(s.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		String s1 = "宝玉";
		s1 = s1.concat("林黛玉").concat("薛宝钗").concat("together");
		System.out.println(s1);
		
		
		s1 = "宝玉 and 林黛玉 林黛玉 林黛玉";
		String s11 = s1.replace("宝玉","jack");
		System.out.println(s1);
		System.out.println(s11);
		
		String poem = "锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆辛苦";
		String[] split = poem.split(",");
		poem = "E:\\aaa\\bbb";
		split = poem.split("\\\\");
		
		System.out.println("==分割后内容==");
		//String poem = "E:\\aaa\\bbb";
		//String[] split = poem.split("\\\\");
				 for(int i = 0; i < split.length; i++) {
					 System.out.println(split[i]);
				 }
				 s = "happy";
				 char[] chs = s.toCharArray();
				 for(int i = 0; i < chs.length; i++) {
					 System.out.println(chs[i]);
				 }
				 String a = "jac";
				 String b = "jack";
				 System.out.println(a.compareTo(b));
				
	}

}
