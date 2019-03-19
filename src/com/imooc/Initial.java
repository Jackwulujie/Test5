package com.imooc;

public class Initial {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
			System.out.println("转换成功");
		}else{
			System.out.println("无法进行类型转换");
		}
		if(animal2 instanceof Cat){
			Cat cat2=(Cat)animal2;
			System.out.println("转换成功了");
		}else{
			System.out.println("无法完成类型的转换");
		}

	}

}
