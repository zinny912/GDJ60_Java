package com.iu.s4.objects1;

public class MethodTest {
	// 기본이 제일 중요~!!!
	//메서드 선언 공식
	//public static void main(String [] args){}
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){}
	//[] 필요하면 쓰고 필요없으면 생략가능
	
	//접근지정자		: public
	//그외지정자		: 생략
	//리턴타입		: void
	//메서드명		: 작명(소문자, 두단어 이상 합쳐지면 두번째단어 첫글자 대문자로)
	//매개변수		: 생략
	
	public void t1() {//메서드의 header(선언부)
		//{} 메서드의 body(내용)
		//제어문, 반복문 등등
		System.out.println("t1 메서드 실행시작");
		MethodTest2 mt2 = new MethodTest2();
		mt2.info();
				
		int num =10;
		System.out.println("T1 Num: "+num);
		System.out.println("t1 메서드 종료");
		
	}
	
	//t2 메서드 선언
	public void t2() {
		System.out.println("t2 메서드 실행시작");
		int num =20;
		System.out.println("T2 Num: "+num);
		System.out.println("t2 메서드 종료");
	}

}
