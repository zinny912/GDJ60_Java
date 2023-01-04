package com.iu.s4.object3.p1;

public class Secret {
	
	public int point=500;
	public int money=1000000000; //10억
	
	//기본생성자
	 public Secret() {
		
	}
	
	
	//접근지정자 [그외지정자 생략] 리턴타입(우선 void)
	public void s1() {
		System.out.println("Secret의 s1 메서드 실행");
		
	}
	
	/*default 접근지정자 생략가능 */void s2() {
		System.out.println("Default 접근지정자");
		
		
	}

}
