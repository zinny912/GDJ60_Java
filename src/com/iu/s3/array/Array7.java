package com.iu.s3.array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[]ar= {5,1,4};
		
		//1.데이터추가
		// ar 배열 0번인덱스에 추가, 나머지는 뒤로 밀림
		//2.데이터삭제
		// ar 배열 0번인덱스에있는 데이터 삭제
		//3.종료
		//종료누를때까지 계속
		
		boolean check = true;
		
		while(check) {
			System.out.println("선택하세요");
			System.out.println("1.데이터추가 2.데이터삭제 3.종료");
			int select = sc.nextInt();
				
			if(select==1) {
				System.out.print("추가할 숫자입력: ");
				select=sc.nextInt();
				int[]copy=new int[ar.length+1];
				copy[0]=select;
				
				for(int i=0;i<ar.length;i++) {				
					copy[i+1]=ar[i];
				}
				
				ar=copy;	
							
			}else if(select==2){
				System.out.println("2.데이터삭제");
				int[]copy=new int[ar.length-1];
				
				for(int i=0;i<copy.length;i++) {
					copy[i]=ar[i+1];
				}
				ar=copy;
				
			}else {
				System.out.println("종료");
				break;
			}
			
			for(int i=0;i<ar.length;i++) {
				System.out.println(ar[i]);
				
			}
		}
		
	}

}
