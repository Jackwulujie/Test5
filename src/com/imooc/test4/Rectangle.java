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
		System.out.println("���ε��ܳ�Ϊ:"+2*(a+b));
		// TODO �Զ����ɵķ������

	}

	@Override
	public void mianJi() {
		System.out.println("���ε����Ϊ:"+a*b);
		// TODO �Զ����ɵķ������

	}

}
