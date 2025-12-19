package com.kh.practice2.func;

import java.util.Scanner;

public class VariablePractice2{
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.next();
		
		System.out.println("성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.println("키 "+height+"cm인 "+age+"살 "+
				gender+"자 "+name+"님 반갑습니다 ^^");
		
		
		
		
		
	}
	
}
	




