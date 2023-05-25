package com.hspedu.annotation_;

public class Deprecated_ {
	public static void main(String[] args) {
		A a = new A();
		a.hi();
		System.out.println(a.n1);
	}

}
//1.@Deprecated 修饰某个元素 便是该元素已经过时
//2.既不在推荐使用 但是依然可以使用
@Deprecated
class A {
	@Deprecated
	public int n1 = 10;
	public void hi() {
		
	}
}