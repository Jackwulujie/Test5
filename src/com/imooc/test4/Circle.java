package com.imooc.test4;

public class Circle extends Shape {
	public int a;
	
	public void setA(int a){
		this.a=a;
	}

	@Override
	public void zhouChang() {
		System.out.println("圆形的周长为:"+2*Math.PI*10);
		// TODO 自动生成的方法存根

	}

	@Override
	public void mianJi() {
		System.out.println("圆的面积为:"+Math.PI*a*a);
		// TODO 自动生成的方法存根

	}

}
