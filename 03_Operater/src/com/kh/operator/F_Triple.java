package com.kh.operator;

public class F_Triple {
	
	/*-3개의 항목을 가지고 연산하는 연산자
	 * [표현법]
	 * 조건식 ? 조건이 true인 경우 결과값 : 조건이 false인 경우 결과값
	 */
	
	public void method1() {
		int num = 50;
		
		// num의 값이 양수인지 아닌지 판단.
		boolean result = num > 0 ? true : false;
		System.out.println(result ? "양수입니다" : "음수입니다");
	}
	
	public void meathod() {
		int num = 0;
		
		//num의 값이 양수, 음수 , 0중 무엇인지 판단
		String result = num > 0 ? "양수" : 
			(num <0 ?"음수" : "0입니다" );
	}
	
	public void quiz() {
        int a = 5;
        int b = 10;
        int c = (++a) + b; //16
        int d = c / a; // 16 / 6 = 2
        int e = c % a; // 16 % 6 = 4
        int f = e++; // 4(5)
        
        int g = (--b) +(d--); //9 + 2(1) = 11
        int h = 2; 
        int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); // 6(7) + 10 / (15 / 4) * (11(10)- 2) % (6 + 2) = 
        													   //6+ 9 / 3 * 10 % 8 = 12
        
        
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e : "+e);
        System.out.println("f : "+f);
        System.out.println("g : "+g);
        System.out.println("h : "+h);
        System.out.println("i : "+i);
    }
	
	
}
