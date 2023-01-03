package com.iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1_1 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		int id = 1234;
		int pw = 5678;
		
		while(check) {
			System.out.println("1. 로그인 2.종료");
			int select =sc.nextInt();
			if(select==1) {
				System.out.println("ID입력");
				int yId=sc.nextInt();
				System.out.println("PW입력");
				int yPw=sc.nextInt();
				
				if(yId==id && yPw==pw) {
				//	if(yPw==pw) { 이렇게 해도 되지만 코드를 더 써야하는 불편함 있음!
				System.out.println("로그인 성공");
				break;
				
				}else {
					System.out.println("로그인 실패");
				}
			}else {
				System.out.println("종료합니다");
				check=!check; // check = false;
			}
		}//while 끝
			System.out.println("Check: "+check);
		
	//게임 진행 파트
		if(check) {
			
			int level = 1;
			int gold = 0;
			
			for(;level<15;level++) {
				System.out.println("현재 레벨: "+level);
				//1.
//				if(level==5) {
//					System.out.println("5레벨 달성 축하금");
//					gold = gold+1000;
//				}
//				
//				if(level==10) {
//					System.out.println("10레벨 달성 축하금");
//					gold = gold+2000;
//				}
				
				if(level%5==0) {
					System.out.println(level+" 레벨 달성 축하금");
					gold = gold+level/5*1000;
				}
				
				for(int m=0; m<level*3;m++) {
					System.out.println(m+1+" 번째 사냥 성공");
				}
				System.out.println("축 레벨업");
				
			}//바깥쪽 for 문
			
			System.out.println(level + " 레벨 달성축하");
			gold = gold+level/5*1000;
			System.out.println("Gold: "+gold);
			
		}

	}
		

}
