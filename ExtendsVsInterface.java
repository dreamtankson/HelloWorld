package com.hspedu.interface_;

public class ExtendsVsInterface {
	public static void main(String[] args) {
		LittleMonkey wuKong = new LittleMonkey("悟空");
		wuKong.climbing();
		wuKong.swimming();
		wuKong.flying();
		
	}

} 
class Monkey {
	private String name;
	
	public Monkey(String name) {
		this.name = name;
	}
	public void climbing() {
		System.out.println(name + "会爬树。。。");
		
	}
	public String getName() {
		return name;
	}
}
//接口
interface Fishable {
	void swimming();
}
interface Birdable {
	void flying();
}
//继承
class LittleMonkey extends Monkey implements Fishable,Birdable {

	

	public LittleMonkey(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "通过学习，可以像鱼儿一样游泳");
		
	}

	@Override
	public void flying() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "通过学习，可以像鸟儿一样飞翔");
	}
	


	
}