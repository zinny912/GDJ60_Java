package com.iu.s3.array;

public class Array8 {

	public static void main(String[] args) {
		
		int [] ar= {9,5,8,3,6};
			
		// 9,8,6,5,3 => 내림차순
		// 3,5,6,8,9 => 오름차순
		// 0번 인덱스의 값을 1,2,3,4 인덱스의 값과 비교
		// 1번 인덱스의 값을 2,3,4 인덱스의 값과 비교
		// 2번 인덱스의 값을 3,4 인덱스의 값과 비교
		// 3번 인덱스의 값을 4인덱스와 비교
		// 이중 for문 사용 (크게 4번돌고 그 안에서 3,2,1번씩 도는구조)
		
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					int aaa=ar[j];
					ar[j]=ar[i];
					ar[i]=aaa;
				}
				
			}
		
		}
		System.out.print("내림차순: ");
		for(int i=0; i<ar.length;i++) {
			System.out.print(ar[i]);
			
		}
		System.out.println();
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int aaa=ar[i];
					ar[i]=ar[j];
					ar[j]=aaa;
					
				}
			}
		}
		System.out.print("오름차순: ");
		for(int i=0; i<ar.length;i++) {
			System.out.print(ar[i]);
		}
		
			
		
	}

}
