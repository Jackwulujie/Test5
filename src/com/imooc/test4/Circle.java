package com.imooc.test4;

public class Circle extends Shape {
	public int a;
	
	public void setA(int a){
		this.a=a;
	}

	@Override
	public void zhouChang() {
		System.out.println("Բ�ε��ܳ�Ϊ:"+2*Math.PI*10);
		// TODO �Զ����ɵķ������

	}

	@Override
	public void mianJi() {
		System.out.println("Բ�����Ϊ:"+Math.PI*a*a);
		// TODO �Զ����ɵķ������

	}

}
