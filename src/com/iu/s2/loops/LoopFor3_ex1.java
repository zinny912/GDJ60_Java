package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 분과 초를 입력받아서
		// 해당 분 초가 되면 반복문을 모두 종료
		
		System.out.println("분과 초를 입력하세요");
		System.out.print("분: ");
		int bb = sc.nextInt();
		System.out.print("초: ");
		int ss = sc.nextInt();	
	
		//1.
//		for(int b=0; b<60; b++) {
//			for(int s=0; s<60; s++) {
//				System.out.println(b+" 분 "+s+" 초");	//print위치 잘 잡기
//				if(s==ss && b==bb) {
//					s=60;
//					b=60;
//				}			
//													
//			}//안쪽 for 끝
//			
//		}//바깥 for 끝
//		System.out.println("프로그램 종료");

		//2.
//		for(int b=0; b<60; b++) {
//			for(int s=0; s<60; s++) {
//				System.out.println(b+" 분 "+s+" 초");	//print위치 잘 잡기
//				if(s==ss && b==bb) {
//					b=60;
//					break;
//				}		
//			}
//		}
//		System.out.println("프로그램 종료");
//		
		
		//3.
		boolean check = false;
		for(int b=0; b<60; b++) {
			for(int s=0; s<60; s++) {
				System.out.println(b+" 분 "+s+" 초");	//print위치 잘 잡기
				if(s==ss && b==bb) {
					check = true;
					break;
				}
				}//for안쪽 끝
			if(check) {
				break;
			}
		}//바깥쪽 for 끝
		System.out.println("프로그램 종료");
		
	}//main 끝

}//class 끝
