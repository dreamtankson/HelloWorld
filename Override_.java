package com.hspedu.annotation_;

public class Override_ {
	public static void main(String[] args) {
		
	}

}
class Father{
	public void fly() {
		System.out.println("Father fly...");
	}
}
class son extends Father {
	public void fly() {
		System.out.println("son fly...");
	}
}


