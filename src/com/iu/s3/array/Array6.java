package com.iu.s3.array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] ar= {8,5,13,9,6};
		//키보드로부터 삭제하고 싶은 값을 입력받기
		
		System.out.println("숫자를 입력하세요");
		int nnn=sc.nextInt();//삭제할 숫자 입력
		
		int [] copy = new int[ar.length-1];
		
		//숫자를 삭제하고, 삭제한 배열이 만들어지게끔
		int idx=0;		
		for(int i=0; i<ar.length;i++) { //ar[]의 인덱스 4까지 가려면 큰 length를 써야함.. copy.length 안됨
			
			if(ar[i]==nnn) {
				continue;
			}
			
			copy[idx]=ar[i]; //
			idx++;
					
		}
			ar=copy;
			
			for(int i=0;i<ar.length;i++) {
				System.out.println(ar[i]);
			}
			
		}
			
	}