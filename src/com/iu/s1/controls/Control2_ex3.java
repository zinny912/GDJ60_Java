package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		
		System.out.print("ID 입력: ");
		int yId = sc.nextInt(); //*****
		System.out.print("PW 입력: ");
		int yPw = sc.nextInt(); //*****
		
		// 로그인이 성공했을 때만 실행
		// 급여를 입력
		// 정규직이면 1을 입력, 계약직이면 2를 입력
		// 실급여계산 
		// 정규직: 고용보험 2%, 의료보험 3%, 국민연금 1%, 산재보험 1%
		// 계약직: 원천징수 3.3%
		// 실급여 출력
		
		boolean check = false; //false: 로그인 X, true: 로그인 O
				
		if(id==yId && pw==yPw) {
			System.out.println("로그인 성공");
			check = true;
		}else {
			System.out.println("로그인 실패");
			check = false;
		}

		if(check) {
			System.out.println("급여계산실행");
		}else{
			System.out.println("로그인 한 사용자만 가능");
		}
		if(check) {
			System.out.print("급여 입력: ");
			int salary = sc.nextInt();
		
			System.out.print("정규직(1)계약직(2)입력:");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("정규직 선택");
				//고용보험
				int tax = 0;
				tax = tax + (int)(salary*0.02);
				//의료보험
				tax = tax + (int)(salary*0.03);
				//국민연금
				tax = tax + (int)(salary*0.01);
				//산재보험
				tax = tax + (int)(salary*0.01);
				salary = salary-tax;
			/*
				//고용보험
				int tax1 =(int)(salary*0.02);
				//의료보험
				int tax2 =(int)(salary*0.03);
				//국민연금
				int tax3 =(int)(salary*0.01);
				//산재보험
				int tax4 =(int)(salary*0.01);
				
				salary = salary-(tax1+tax2+tax3+tax4);
			*/		
				
			}else {
				System.out.println("계약직 선택");
				salary = (int)(salary*0.97);
			}
			System.out.println("실급여: "+salary);
		
					
		}
	}
}
			
			
			
		
	/*	boolean check = false;
		
		if(var1==1||var2==2) {
			
			double rmoney = money*0.93;
			int rmoney0 = (int)rmoney;
									
			System.out.println("실급여: "+rmoney0+"원");
			
			
				
			if(var==2) {
				double rmoney = money*0.967;
				int rmoney1 = (int)rmoney;
				System.out.println("실급여: "+rmoney1+"원");
			}
		}
		else {
			
			
		}
		
		
		
		
		/*
		 double money1 = money*0.02;
			double money2 = money*0.03;
			double money3 = money*0.01;
			double money4 = money*0.01;
			
			
			int rmoney1 = (int)money1;
			int rmoney2 = (int)money2;
			int rmoney3 = (int)money3;
			int rmoney4 = (int)money4;
			
			System.out.println("고용보험2%: "+rmoney1+"원");
			System.out.println("의료보험3%: "+rmoney2+"원");
			System.out.println("국민연금1%: "+rmoney3+"원");
			System.out.println("산재보험1%: "+rmoney4+"원");
		 */
		
		
		
		
		
	


