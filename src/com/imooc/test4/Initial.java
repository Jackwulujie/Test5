package com.imooc.test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Initial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("�������⳵����,�⳵����");
	       int[] b=new int[2];
	       int m=0;
	       for(;m<2;m++)  { 
	          b[m]=scan.nextInt();
	       }
	       System.out.println("���ܹ���Ҫ֧����"+50*b[0]*b[1]+"Ԫ~");

	
//		Scanner sc=new Scanner(System.in);
//		System.out.print( "Please enter a string : " );  
//		System.out.print( "Your input is : " + sc.next( ) );
		
		
//		String input = "";
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(in);
//        System.out.print("���������������");
//        try {
//            input = bufferedReader.readLine();//�������
//        } catch (IOException e) {
//            e.printStackTrace();
//            //System.out.println(e.toString());
//        }
//        System.out.println(input);
		
		
//		String tx="";
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("������Ҫ���������:");
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
		// TODO �Զ����ɵķ������

	}

}
