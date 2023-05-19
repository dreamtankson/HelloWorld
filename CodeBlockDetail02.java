package com.hspedu.codeblock_;

public class CodeBlockDetail02 {
	public static void main(String[] args) {
		A a = new A();
	}
	
}


class A {
	//静态属性的初始化
	private static int n1 = getN1();
			
			
			static {//静态代码块
		System.out.println("A静态代码块01");
	}
	public static int getN1() {
		System.out.println("getN1被调用。。。");
		return 100;
	}
}