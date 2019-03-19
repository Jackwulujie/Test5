package com.imooc.test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Initial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入租车天数,租车数量");
	       int[] b=new int[2];
	       int m=0;
	       for(;m<2;m++)  { 
	          b[m]=scan.nextInt();
	       }
	       System.out.println("您总共需要支付："+50*b[0]*b[1]+"元~");

	
//		Scanner sc=new Scanner(System.in);
//		System.out.print( "Please enter a string : " );  
//		System.out.print( "Your input is : " + sc.next( ) );
		
		
//		String input = "";
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(in);
//        System.out.print("请输入你的姓名：");
//        try {
//            input = bufferedReader.readLine();//获得数据
//        } catch (IOException e) {
//            e.printStackTrace();
//            //System.out.println(e.toString());
//        }
//        System.out.println(input);
		
		
//		String tx="";
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("输入你要输入的内容:");
//		try{
//		tx=br.readLine();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//		System.out.println(tx);

		Shape shape1=new Rectangle();
		shape1.setA(5);
		shape1.setB(4);
		shape1.zhouChang();
		shape1.mianJi();
		Shape shape2=new Circle();
		shape2.setA(10);
		shape2.zhouChang();
		shape2.mianJi();
		// TODO 自动生成的方法存根

	}

}
