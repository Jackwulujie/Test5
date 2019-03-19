package com.imooc.test3;

public class Initial {

	public static void main(String[] args) {
		Telephone tel1=new Cellphone();
		Telephone tel2=new Smartphone();
		tel1.call();
		tel2.call();
		IPlaygame ip1=new Smartphone();
		IPlaygame ip2=new Psp();
		ip1.Playgame();
		ip2.Playgame();
		IPlaygame ip3=new IPlaygame(){

			@Override
			public void Playgame() {
				// TODO 自动生成的方法存根
				System.out.println("使用匿名内部类来实现接口");
			}
			
		};
		ip3.Playgame();
		new IPlaygame(){
			public void Playgame() {
				// TODO 自动生成的方法存根
				System.out.println("使用匿名内部类来实现接口");
			}
			
		}.Playgame();
		// TODO 自动生成的方法存根

	}

}
