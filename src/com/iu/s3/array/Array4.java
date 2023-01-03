package com.iu.s3.array;

public class Array4 {

	public static void main(String[] args) {
		int[]ar1= {1,2,3};
		//새로운 배열 생성
		//깊은복사
		int[]copy = new int[ar1.length+1]; // ar1의 length가 3 copy[]의 length를 4로
		
		for(int i=0;i<ar1.length;i++) {
			copy[i]=ar1[i]; //ar1[]이 copy[]로 변경되면서 ar1의 length가 4로 변경
			
		}
		copy[copy.length-1]=4; //copy의 length는 ar1의 length+1인데, copy[]=ar1[]이니까 copy[4]에 값을 넣으려면 copy의 length에서 -1을 해야 4번째 인덱스에 값을 넣을 수 있음 
		ar1=copy; //얕은복사 해주면 ar1의 번지가 copy의 번지를 읽을 수 있음
		
		for(int i=0;i<ar1.length;i++) {
			System.out.println(ar1[i]); //ar1의 배열이 copy의 배열과 같아짐
		}
	}

}
