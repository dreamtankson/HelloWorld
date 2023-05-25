package com.hspedu.annotation_;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings_ {
	
	//当我们不希望看到这些警告的时候 可以使用SuppressWarnings注解来抑制警告信息
	//在{""}中 可以写入你希望抑制（不显示）警告信息
	@SuppressWarnings({"rawtypes","unchecked","unused"})
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("jack");
		list.add("tom");
		list.add("mary");
		int i;
		System.out.println(list.get(1));
	}

}
