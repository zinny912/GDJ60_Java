package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		// 회원가입 할 때 입력한 ID, PW
		int id = 1234;
		int pw = 5678;
		
		//키보드로부터 ID, PW 입력받아서 로그인 처리
		Scanner sc = new Scanner(System.in);

		System.out.print("ID 입력: ");
		int yId = sc.nextInt(); //*****
		System.out.print("PW 입력: ");
		int yPw = sc.nextInt(); //*****
		
		/*
		 if(id!=yId && pw!=yPw) {
			System.out.println("로그인 실패");
		} else {
			System.out.println("로그인 성공");
		}
		*/
		
		if(id==yId && pw==yPw) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}

	}

}
