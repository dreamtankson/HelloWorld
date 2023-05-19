package com.hspedu.abstract_;

public class AbstractDetail02 {
	public static void main(String[] args) {
		System.out.println("hello");
		
	}

}
//抽象方法不能使用private final 和 static来修饰，因为这些关键字都是和重写违背的
abstract class H {
	public abstract void hi();//抽象方法
}

abstract class E {
	public abstract void hi();
}
abstract class F extends E {
	
}

class G extends E {
	public void hi() {
}
//抽象类色本质还是类
abstract class D {
	public int n1 = 10;
	public static String name = "韩顺平教育";
	public void hi() {
		System.out.println("hi");
	}
	public abstract void hello();
	public static void ok() {
		System.out.println("ok");
	}
}
}
