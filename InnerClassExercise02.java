package com.hspedu.innerclass;

public class InnerClassExercise02 {
	public static void main(String[] args) {
		
		
		CellPhone cellPhone = new CellPhone();
		cellPhone.alarmClock(new Bell() {
			
			public void ring() {
				System.out.println("懒猪起床了");
		}
	});
	}
}
interface Bell{//接口
	void ring();//方法
}
class CellPhone{//类
	public void alarmClock(Bell bell) {//形参是bell接口类型
		bell.ring();
	}
}