package com.kh.variable;

import java.util.Scanner;

public class C_Scanner {
	// 사용자가 키보드로 직접 입력한 값을 변수에 저장할 수 있게 도와주는 클래스

	public void inputTest1() {
		
		Scanner sc = new Scanner(system.in);
		
		// 사용자의 인적사항정보 입력받기
		System.out.print("당신의 이름을 입력해주세여...");
		// 사용자가 입력한 값을 "문자열"로 받아오는 메서드
		//1. nextLine() : 사용자가 입력한 값을 "엔터" 를 기준으로
		// 모두 가져오는 메서드. 값을 가져온 후 개행문자(엔터)는 비워준다.
		//2. next() : 사용자가 입력한 값을 공백 기준으로 가져오는 메서드 
		
		
	String name = sc.nextLine();
	
		//이
		//정환
		String firstname = sc.next();//이/n 개행문자남음
		sc.nextLine();// 개행문자 비워주기 작업 필요
		String lastname = sc.nextLine();//정환
		
		System.out.println(firstname + lastname);
		System.out.println("당신의 나이는 몇살 입니까?");
		int age = sc.nextaInt();
		
		System.out.println("당신의 키는 몇 cm입니까");
		double height = sc.nextDouble()
		
		// 입력한 데이터를 문자형으로 뽑기
	    // string의 charAt (0) => 문자열의 첫번째 글자를 문자로 뽑는 메서드
		System.out.println("당신의 성별은? (m/f");
		//chat gender = scnext() .charAt(0);
		strinf gender = sc.next();
		char gender2 = gender.charAt(0);
		
			
		
		
		
		
		

	}

}
