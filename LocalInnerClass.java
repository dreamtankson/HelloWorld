package com.hspedu.innerclass;

public class LocalInnerClass {
	public static void main(String[] args) {
		
		Outer02 outer02 = new Outer02();
		outer02.m1();
	}

}


class Outer02 {
	private int n1 = 100;
	private void m2() {
		System.out.println("Outer02 m2()");
	}//私有方法
	public void m1() {//方法
		//1.局部内部类是定义在外部类的局部位置，通常在方法
		//3.不能添加访问修饰符，但是可以使用final修饰
		//4.作用域 :仅仅在定义它的方法或代码块中 
		final class Inner02 {//局部内部类（本质仍然是一个类）
			//2.可以直接访问外部类的所有成员，包括私有的
			public void f1() {
				//5.局部内部类可以直接访问外部类的成员，比如下面 外部类n1和 m2（）
				System.out.println("n1=" + n1);
				m2();
			}
		}
		//6.外部类在方法中，可以创建Inner02对象，然后调用方法即可
		Inner02 inner02 = new Inner02();
		inner02.f1();
	}
}