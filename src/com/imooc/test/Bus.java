package com.imooc.test;

public class Bus extends Transportation {
	public Bus(){
		place ="陆地";
		number=40;
		System.out.println("我是公交车");
	}
	public void ability(){
		System.out.println("公交车"+place+"上开"+"\n"+"能载客"+number+"人");
		
	}

}
