package com.kh.practice.func.OperatorPractice;

import java.util.Scanner;

public class operatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.println("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 " + (candy / person));
		System.out.println("남는 사탕 개수 " + (candy % person));
		
	}
	
	
	 public void practice2() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("이름 : ");
		 String name = sc.next();
		 
		 System.out.print("성별 : ");
		 char ch = sc.next().charAt(0);
		 
		 System.out.print("학년 : ");
		 int grade = sc.nextInt();
				 
		 System.out.print("반 : ");
		 int classes = sc.nextInt();
		 
		 System.out.print("번호 : ");
		 int 번호 = sc.nextInt();
		 
		 System.out.print("성적 : ");
		 double d = sc.nextDouble();
		 
		 System.out.println(grade+"학년 "+classes+"반 "+번호+"번 "+
				            name+(ch == 'M'?"남학생" : "여학생")+"의 성적은 "+d+"이다.");
		 
	 }
	 
	
	public void practice3() {
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		String str = age <= 13 ? "어린이" : 
						(age <= 19 ? "청소년" : "성인");
		System.out.println(str);
	}
	
	
	
	public void practice4() {
		System.out.print("국 : ");
		int kor = sc.nextInt();
		
		System.out.print("영 : ");
		int eng = sc.nextInt();
		
		System.out.print("수 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
	
		System.out.println("합계 : " +sum);
		System.out.println("평균 : " +avg);
		
		System.out.println(
				kor >= 40 && eng >= 40 && math >= 40
				&& avg >= 60.0 ? "합격" : "불합격");
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void practice5() {
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String str = sc.next();
		char gender = sc.next().charAt(7);
		System.out.println(gender == '1' || gender =='3'? "남자" : "여자" );
		
	}
	

}
