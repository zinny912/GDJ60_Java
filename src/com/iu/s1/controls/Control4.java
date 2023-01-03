package com.iu.s1.controls;

public class Control4 {

	public static void main(String[] args) {
		//다중선택
		//switch case
		/* 
		switch(정수식 또는 문자열) {
		case 1: case에 들어가는 값은 상수로만 가능 변수X / 연산 가능 ex)case 1*10 (O) / case c (X)
		
			break;
		}
		*/
		int num = 7;
		System.out.println("1.햄버거");
		System.out.println("2.샌드위치");
		System.out.println("3.샐러드");
		int c =1;
		String select = "3";
		switch(num) {
		case 1:
			System.out.println("1번 선택");
			break;
		case 2:
			System.out.println("2번 선택");
			break;
		case 3:
			System.out.println("3번 선택");			
			break;
			
		default:
			System.out.println("그외 나머지");
			
			
		}

	}

}
