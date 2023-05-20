package com.hspedu.interface_;

public class InterfaceDetail02 {
	public static void main(String[] args) {
		//接口中的属性是 public static final
		System.out.println(IB.n1);//说明n1就是static
		//IB.n1 = 30; 说明n1是final
	}

}
interface IB{
	//接口中的属性，只能是final而且是 public static final修饰符
	int n1 = 10;//等价 public static final  int n1 = 10;
	void hi();
}
interface IC{
	void say();
}
interface ID extends IB,IC {
	
}
//接口的修饰符 只能是public和默认，这点和类的修饰符是一样的
interface IE{}
//一个类可以同时实现多个接口

class Pig implements IB,IC {

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		
	}
	
}