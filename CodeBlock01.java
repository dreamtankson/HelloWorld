package com.hspedu.codeblock_;

public class CodeBlock01 {
	public static void main(String[] args) {
		Movie movie= new Movie("你好，李焕英");
		System.out.println("==============");
		new Movie("唐探3",100,"陈思诚");
	}

}

class Movie {
	private String name;
	private double price;
	private String director;
	//3个构造器=》重载
	//下面三个构造器都有相同的语句，代码看起来会比较麻烦
	//这时我们可以把相同的语句放入到一个代码块中，即可
	{
        System.out.println("电影屏幕打开");
        System.out.println("广告开始。。。");
        System.out.println("电影正式开始。。。");
	}
	public Movie(String name) {
		System.out.println("Movie(String name)被调用。。。");
		
		this.name = name;
	}
	public Movie(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public Movie(String name, double price, String director) {

		this.name = name;
		this.price = price;
		this.director = director;
	}
	
	
}