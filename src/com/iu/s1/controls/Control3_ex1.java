package com.iu.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		//Game : TRPG
		//마법사
		String name = "핫팩";
		int hp =20;
		int mp =20;
		
		String monsterName = "오크";
		int monsterhp =10;
		
		//1.HP보충(포션) 2.MP(보충) 3.마법1 4.마법2 5.턴을넘기기
		//HP: Max40 MP: Max40
		//보충시 랜덤하게 0~40사이의 숫자를 받아서 HP에 더하기
		
		//int test = random.nextInt(5); // 0~5미만의 정수 하나를 리턴
		//int test2= random.nextInt(30);
		//System.out.println("test: "+test);
		//System.out.println("test2: "+test2);
		
		System.out.println("1.HP보충 2.MP보충 3.마법1 4.마법2 5.턴넘기기");
		System.out.print("원하는 기능 선택: ");
		int select = sc.nextInt();
		
			if(select==1) {
			int hpcharge = random.nextInt(41);
			hp = hp + hpcharge; // 누적함수
			System.out.println("HP보충선택");
			System.out.println("HP보충량: "+hpcharge);
			
			if(hp>40) {
				hp=40;
			}
			System.out.println("총 HP: "+hp);
		
		//2.MP보충선택	
		} else if(select==2) {
			int mpcharge = random.nextInt(41);
			mp = mp + mpcharge;
			System.out.println("MP보충선택");
			System.out.println("MP보충량: "+mpcharge);
			
			if(mp>40) {
				mp=40;
			}
			System.out.println("총 MP: "+mp);
		
		//3. 마법1선택
		} else if(select==3) {
			//주문외우기
			//mp 3씩 감소
			//0~5 이하의 수치를 몬스터 hp 공격
			
			System.out.println("아브라카다브라");
			mp = mp -3;
			int hpp = random.nextInt(6);
			monsterhp = monsterhp - hpp;
			System.out.println("공격량: "+hpp);
			
		} else if(select==4) {
			//주문외우기
			//mp 5씩 감소
			//0~10이하의 수치를 공격
			System.out.println("하쿠나마타타");
			mp = mp -5;
			int hpp = random.nextInt(11);
			monsterhp = monsterhp - hpp;
			System.out.println("공격량: "+hpp);
			
			if(hpp==10) {
				System.out.println("크리티컬");
			}
			
		} else  {
			
			System.out.println("상대차례");
		}
			//코드
			//유저의 이름과 HP, MP
			//몬스터의 이름과 HP	
			
			System.out.println("유저: "+name);
			System.out.println(name+"의 HP: "+hp+" | MP: "+mp);
			System.out.println("몬스터: "+monsterName);
			System.out.println(monsterName+"의 HP: "+monsterhp);
	
	}

}

