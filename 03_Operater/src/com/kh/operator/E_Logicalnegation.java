package com.kh.operator;

public class E_Logicalnegation {
	/*
	 * 논리부정연산자 !(단항연산다)
	 * 
	 * !논리값 -논리삽을 반대로 바꿔주는 연산자
	 */
	public void method() {
		System.out.println("true의 부정" + !true);

		boolean b = true;
		boolean b2 = !b;

		boolean b3 = !(5 > 3);
	}

}
