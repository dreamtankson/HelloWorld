package com.hspedu.interface_;

public class InterfacePolyParameter {
	public static void main(String[] aargs) {
		IF if01 = new Monster();
		if01 = new Car();
		
		//继承体现多态
		//父类类型的变量 a 可以指向 继承AAA子类的对象实例
		AAA a = new BBB();
		a = new CCC();
		
	}

}


interface IF{}
class Monster implements IF{}
class Car implements IF{}

class AAA {
	
}
class BBB extends AAA {}
class CCC extends AAA {}