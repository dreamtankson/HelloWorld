package com.hspedu.innerclass;

public class MemberInnerClass01 {
	public static void main(String[] args) {
		Outer08 outer08 = new Outer08();
		outer08.t1();
	}

}
class Outer08 {//外部类
	private int n1 = 10;
	public String name ="张三";
	
	class Inner08 {//成员内部类
		public void say() {
			//可以直接访问外部类的所有成员，包括私有的
			System.out.println("n1=" + n1 + "name =" + name);
		}
	}
	public void t1() {
		Inner08 inner08 = new Inner08();
		inner08.say();
	}
}