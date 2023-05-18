package com.hspedu.static_;

public class StaticMethodDetail {
	public static void main(String[] args) {
		
		
		D.hi();//ok
		//非静态方法，不能通过类名调用
		//D.say（）； 错误，需要先创建对象再调用
		new D().say();
		   
	}

}

class D {
	
		private int n1 = 100;
		private static int n2 = 200;
		public void say() {
		
		
		
	}
	
	public static void hi() {//静态方法，类方法
		//累方法中不允许使用和对象有关的关键字
		//比如this和super 普通方法（成员方法）可以
		//System.out.println(this.n1;) 不可以
		
	}
	public static void hello() {
		System.out.println(n2);
		System.out.println(D.n2);
		hi();
	}
	//普通成员既可以访问非静态成员，也可以访问静态成员
	public void ok() {
		System.out.println(n1);
		say();//非静态
		System.out.println(n2);
		hello();//静态

		
	}
}