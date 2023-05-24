package com.hspedu.innerclass;

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Outer04 outer04 = new Outer04();
		outer04.method();
	}

}

class Outer04 {
	private int n1 = 10;
	public void method() {
		IA tiger= new Tiger();
		tiger.cry();
	}
}
interface IA {//接口
	public void cry();
}
class Tiger implements IA {

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("老虎叫唤...");
		
	}
	
}
class Father {
	public Father(String name) {
		
	}
}