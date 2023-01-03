package com.iu.s4.objects2;

public class Main {

	public static void main(String[] args) {

		ReturnTest returnTest = new ReturnTest();
		
		returnTest.t1();
		// int n = returnTest.t1(); 리턴할 게 없는 메서드여서 에러뜸 // void는 호출만 해라 대입은 안됨
		int num = returnTest.t2(); // 우측의 결과물을 좌측에 대입
		
		System.out.println(num);
		
		int [] ar = returnTest.t3();
		
		
		
	}

}
