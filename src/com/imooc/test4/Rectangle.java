package com.imooc.test4;

public class Rectangle extends Shape {
	public int a;
	public int b;
	public void setA(int a){
		this.a=a;
	}
	public void setB(int b){
		this.b=b;
	}

	@Override
	public void zhouChang() {
		System.out.println("矩形的周长为:"+2*(a+b));
		// TODO 自动生成的方法存根

	}

	@Override
	public void mianJi() {
		System.out.println("矩形的面积为:"+a*b);
		// TODO 自动生成的方法存根

	}

}
