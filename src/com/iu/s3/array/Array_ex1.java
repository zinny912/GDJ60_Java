package com.iu.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		
		//1. 학생수 입력
		//2. 학생수만큼 이름 입력 a, b
		//3. 학생수만큼 학생의 번호, 국어, 영어, 수학 입력
		//	a 학생의 번호 :
		//	a 학생의 국어 :
		//	a 학생의 영어 :
		//	a 학생의 수학 :
		// 모든 학생의 정보 출력
		// 이름 번호 국어 영어 수학 총점 평균
		// 학생 1 49  39  20
		// ...
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생수 입력: ");
		int count = sc.nextInt();
		String[]names = new String[count];
		int[]nums = new int[names.length];
		int[]sub1= new int[names.length]; //국어
		int[]sub2= new int[names.length]; //영어
		int[]sub3= new int[names.length]; //수학
		int[]sum = new int[names.length]; //총점
		double[]avg = new double[names.length]; //평균
		
		
			for(int i=0; i<names.length;i++) {
				System.out.println(i+1+"번째 이름: ");
				names[i]=sc.next();
			}
			
			for(int i=0; i<names.length;i++) {
				System.out.print(names[i]+"학생의 번호 입력");
				nums[i] = sc.nextInt();
				System.out.print(names[i]+"학생의 국어점수: ");
				sub1[i] = sc.nextInt();
				System.out.print(names[i]+"학생의 영어점수: ");
				sub2[i] = sc.nextInt();
				System.out.print(names[i]+"학생의 수학점수: ");
				sub3[i] = sc.nextInt();
				sum[i] = sub1[i]+sub2[i]+sub3[i];
				avg[i] = sum[i]/3.0;
			
				System.out.println(names[i]+"학생의 총점: "+sum[i]);
				System.out.println(names[i]+"학생의 평균: "+avg[i]);
			}
			
			System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
			
			for(int i=0;i<names.length;i++) {
				System.out.print(names[i]+"\t");
				System.out.print(nums[i]+"\t");
				System.out.print(sub1[i]+"\t");
				System.out.print(sub2[i]+"\t");
				System.out.print(sub3[i]+"\t");
				System.out.print(sum[i]+"\t");
				System.out.println(avg[i]);
				
			}
			
		
		}
			
	}

			



