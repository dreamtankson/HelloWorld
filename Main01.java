package com.hspedu.main_;

public class Main01 {
	
	private static String name = "韩顺平教育";
	private int n1 = 10000;
	
	public static void hi() {
		System.out.println("Main01的 hi方法");
	}
	public void cry() {
		System.out.println("Main01的 hi方法");
	}
	public static void main(String[] args) {
		//可以直接使用name
		//静态方法可以访问本类的静态成员
		System.out.println("name=" + name);
		hi();
		//静态方法main 要访问本类的非静态成员 需要先创建对象 再调用即可
		Main01 main01 = new Main01();
		System.out.println(main01.n1);
		main01.cry();
	}

}
