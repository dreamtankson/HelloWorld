package com.hspedu.interface_;

public interface AInterface {
	//写属性
	public int n1 = 10;
	//写方法
	public void hi();
	default public void ok() {
		System.out.println("ok...");
		
	}

	public static void cry() {
		System.out.println("cry...");
	}
}
