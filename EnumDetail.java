package com.hspedu.enum_;

public class EnumDetail {
	public static void main(String[] args) {
		Music.CLASSICMUSIC.playing();
	}

}
class A {
	
}
interface IPlaying {
	public void playing();
}

enum Music implements IPlaying {
	CLASSICMUSIC;
	public void playing() {
		System.out.println("播放好听的音乐。。。");
	}
}