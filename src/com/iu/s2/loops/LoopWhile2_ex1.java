package com.iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {

	public static void main(String[] args) {
		// MMORPG 게임
		//1. 로그인
		//2. 로그인 한 사용자만 게임 가능
		
		//---------------- 로그인 파트 -------------------
		//1.로그인 2.종료
		// 1: ID PW 입력 후 로그인 판단
		// 2: 종료
		
		//--------------- 게임 진행 파트 ------------------
		//1.로그인 성공 했을 때 진행
		//레벨은 1로 시작
		//초기 gold =0
		//5렙 달성시 1000gold 지급
		// 지급메세지
		//10렙 달성시 2000gold 지급
		//15랩 달성시 3000gold 지급
		
		//모든 몬스터의 경험치는 동일
		// 1->2 :3마리
		// 2->3 :6마리
		// 3->4 :9마리
		// 4->5 :12마리
		// 14->15:52마리
		// 만랩달성 축하, 현재 골드 출력 6000
		//몬스터 잡을때마다 몬스터사냥 성공 출력
		//레벨업 할때마다 축하메세지 출력
		
		Scanner sc = new Scanner(System.in);
		int idd = 1234;
		int pww = 5678;
		boolean check = true;
		
		System.out.println("로그인이 필요합니다");
		System.out.println("1.로그인 2.종료");
		
		int select = sc.nextInt();
		int level = 1;
		int gold = 0;
		int monster =0;
		
		while(check) {
			
			if(select==1) {
			System.out.print("ID: ");
				int id = sc.nextInt();
				System.out.print("PW: ");
				int pw = sc.nextInt();
				if(idd==id && pww==pw) {
					System.out.println("로그인 성공");
					System.out.println("게임을 시작합니다.");
					check = false;
					int i=0;
					int j=0;
					
					System.out.println(j);
					
					for(i=1; i<100; i++) {
						System.out.println("몬스터 사냥성공");
						//레벨2
						if(i==3) {
							System.out.println("레벨업 성공");
							level = level+1;
							System.out.println("현재레벨: "+level);}
						//레벨3
						if(i==9) {
							System.out.println("레벨업 성공");
							level = level+1;
							System.out.println("현재레벨: "+level);}
						//레벨4
						if(i==18) {
							System.out.println("레벨업 성공");
							level = level+1;
							System.out.println("현재레벨: "+level);}
						//레벨5
						if(i==30) {
							System.out.println("레벨업 성공");
							level = level+1;
							gold = gold + 1000;
							System.out.println("1000GOLD 냠냠");
							System.out.println("현재레벨: "+level);}
						//레벨6
						if(i==45) {
							System.out.println("레벨업 성공");
							level = level+1;
							System.out.println("현재레벨: "+level);}
						//레벨7
						if(i==63) {
							System.out.println("레벨업 성공");
							level = level+1;
							System.out.println("현재레벨: "+level);}
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					}
					System.out.println("만랩달성 축하");
					System.out.println("현재 gold: "+gold+"원");
				}else {
					System.out.println("로그인 실패");
					System.out.println("ID와 PW를 확인하세요");
					System.out.println("1.로그인 2.종료");
					select = sc.nextInt();					
				}
			}else {
				System.out.println("종료");
				check =false;
			}
			//몬스터 잡기....................
			
			
				
			
			
			
			
			
			}//while 끝
			
		}
		
		
		
		
}

		
		
		
		



