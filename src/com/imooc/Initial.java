package com.imooc;

public class Initial {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		Animal obj1=new Animal();
//		Animal obj2=new Dog();
//		Animal obj3=new Cat();
//		obj1.eat();
//		obj2.eat();
//		obj3.eat();
		Dog dog=new Dog();
		
		Cat cat=new Cat();
		Animal animal=dog;
		Animal animal2=cat;
		if(animal instanceof Dog){
			Dog dog2=(Dog)animal;
			System.out.println("ת���ɹ�");
		}else{
			System.out.println("�޷���������ת��");
		}
		if(animal2 instanceof Cat){
			Cat cat2=(Cat)animal2;
			System.out.println("ת���ɹ���");
		}else{
			System.out.println("�޷�������͵�ת��");
		}

	}

}
