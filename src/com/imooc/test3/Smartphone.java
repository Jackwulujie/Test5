package com.imooc.test3;

public class Smartphone extends Telephone implements IPlaygame{

	@Override
	public void call() {
		System.out.println("我是smartphone的打电话功能");
		// TODO 自动生成的方法存根

	}

	@Override
	public void message() {
		System.out.println("我是smartphone的发短息功能");
		// TODO 自动生成的方法存根

	}

	@Override
	public void Playgame() {
		System.out.println("我是smartphone的玩游戏功能");
		// TODO 自动生成的方法存根
		
	}

}
