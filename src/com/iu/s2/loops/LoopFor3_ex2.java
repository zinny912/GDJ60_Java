package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {

	public static void main(String[] args) {
		//배그
		//총알 30발	 -> 1탄창
		//캐릭터당		 -> 3탄창
		
		//1. 단발
		//2. 점사
		
		//1번이면 "탕" 30번 반복 출력
		//2번이면 "탕탕탕" 10번 반복 출력
		Scanner sc = new Scanner(System.in);
		for(int t=1; t<4; t++) {
		System.out.println("1.단발  2.점사");
		int select = sc.nextInt();
		
		System.out.println(select);
		//2.
		//int count =0;
		//String sound ="";
		
		//3.
		int count =10;
		String sound ="탕탕탕";
		if(select==1) {
			sound="탕";
			count=30;	
			
			}//else {
				//sound="타타탕";
				//count=10;
			//}
		
		for(int b=0;b<count;b++) {
			System.out.println(b+"번째 소리 : "+sound);
			}
			
		System.out.println("탄창하나소비");
	}
	}				
	}
// 1.
//		for(int t=1; t<4; t++) {
//			System.out.println("1.단발  2.점사");
//			int select = sc.nextInt();
//			
//			System.out.println(select);
//			
//			if(select==1) {
//				for(int b=1;b<31;b++) {
//					System.out.println("탕");
//				}
//			}else {
//				for(int b=1;b<11;b++) {
//					System.out.println("타타탕");
//						
//				}
//			}
//		}
//	
//		System.out.println("탄창하나소비");
//	}
//}		
		
		
		
//		내가
//		boolean check = false;
//		//탄창충전
//		for(int ttt=0; ttt<3; ttt++) {
			
//			System.out.println("총을 선택하세요");
//			System.out.println("1. 단발  2. 점사");
//			int gun = sc.nextInt();
//	
//		//1.단발총 선택
//		for(int i=0; i<30; i++) {
//			
//			if(gun==1) {
//				System.out.println("탕");
//				check = true;
//				continue;
//			}
//			if(gun==2) {
//				i=i+2;
//				System.out.println("탕탕탕");
//				check = true;
//				continue;
//			}
//			
//		}//안쪽 for 끝 
//		if(check) {
//			System.out.println("탄창충전필요");
//		}
//		
//	}//바깥for 끝
//		System.out.println("탄창을 구하세요");
//		
//	}//main 끝
//	
//
//}//클래스 끝
