package com.hspedu.enum_;

public class Enumeration02 {
	public static void main(String[] args) {
		
		System.out.println(Season.AUTUMN);
		System.out.println(Season.SPRING);
	}

}
class Season {
	private String name;
	private String desc;
	
	
	public static Season SPRING = new Season("春天","温暖");
	public static Season WINTER = new Season("冬天","寒冷");
	public static Season SUMMER = new Season("夏天","炎热");
	public static Season AUTUMN = new Season("秋天","凉爽");
	
	
	//1.将构造器私有化 目的防止 直接new
	//2.去掉setXxx方法，防止属性被修改
	//3.在Season内部 直接创建固定的对象
	private Season(String name, String desc) {

		this.name = name;
		this.desc = desc;
	} 
	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}
	@Override
	public String toString() {
		return "Season{" +
	            "name'" + name + '\'' +
	            ",desc'" + desc + '\'' +
	            '}';
	}

}