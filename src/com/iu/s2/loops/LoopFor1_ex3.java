package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id=1234;
		int pw=5678;
		//boolean check = false;
		//int a = 0;
		// 로그인 시도 총 5번 가능
		//int i = 0;
		
		for(int i=0; i<5; i++) {
			System.out.println("ID를 입력");
			int yId = sc.nextInt();
			System.out.println("PW를 입력");
			int yPw = sc.nextInt();
			
			if(yId==id && yPw==pw) {
				System.out.println("로그인 성공");
				//check=true;
				//a=0;
				//i=1000;
				break;
			}else {
				System.out.println("로그인 실패");
			}
			
		
		if(/*a==0, check */ i>1000) {
		System.out.println("환영합니다");
		} else {
		System.out.println("은행을 방문 하세요");
		}
		
		System.out.println("반복문 종료");
		

		}

	}
}

