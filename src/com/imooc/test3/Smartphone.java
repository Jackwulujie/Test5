package com.imooc.test3;

public class Smartphone extends Telephone implements IPlaygame{

	@Override
	public void call() {
		System.out.println("����smartphone�Ĵ�绰����");
		// TODO �Զ����ɵķ������

	}

	@Override
	public void message() {
		System.out.println("����smartphone�ķ���Ϣ����");
		// TODO �Զ����ɵķ������

	}

	@Override
	public void Playgame() {
		System.out.println("����smartphone������Ϸ����");
		// TODO �Զ����ɵķ������
		
	}

}
