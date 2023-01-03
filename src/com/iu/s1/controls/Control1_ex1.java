package com.iu.s1.controls;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		//키보드로부터 국어, 영어, 수학 점수 입력받음
		//촘점과 평균 계산
		
		//평균이 90점 이상이면 A를 출력
		//평균이 80점 이상이면 B를 출력
		//평균이 70점 이상이면 C를 출력
		//그외 나머지 F를 출력
		
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;
		
		//기본값 char ch = ' ';
		//기본값 boolean check = false;
		
		//내가
			//int kor = sc.nextInt();
			//int eng = sc.nextInt();
			//int math = sc.nextInt();
		
		System.out.print("국어 입력: ");
		kor = sc.nextInt();
		
		System.out.print("영어 입력: ");
		eng = sc.nextInt();
		
		System.out.print("수학 입력: ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total/3.0;
		
		String level = "F";
				
		//내가			
			//int total = kor + eng + math;
			//double avg =(double) total / 3;
		
		System.out.println("총점: "+total+"점\n" + "평균: "+avg);
		
		if(avg>=90) {
			//System.out.println("A");
			level="A";
		}
			
		if(avg<90 && avg>=80) {
			//System.out.println("B");
			level="B";
		}
		
		if(avg<80 && avg>=70) {
			//System.out.println("C");
			level="C";
				}
		
		//if(avg<70) {
			//System.out.println("F");
			//level="F";
		//}
		// level 기본값을 "F"로 지정하면, 마지막 조건에서는 if문 사용없이 가능.
		// 마지막 조건문 if문으로 작성시 level 초기값 설정
		
		
		// 출력문은 딱 한번만 사용
		System.out.println(level);
		
	}

}
