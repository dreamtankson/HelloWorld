package com.hspedu.interface_;

public class OracleDB implements DBInterface { 
	
	public void connect() {
		System.out.println("连接oracle");
	}
	
	public void close() {
		System.out.println("关闭oracle");
	}

}
