package com.iu.s4.objects2;

public class OverTest {
	//OverLoading 매개 변수명이랑은 관계 없음. 타입만 관련
	
	//매개변수 두개를 받아서 + 한 결과를 리턴
	public int hap(int a, int b) {
		return a+b;
	}
	
	public double hap(int a, double b) {
		return a+b;
	}
	
	public String hap(String a, int b) {
		return a+b;
	}
	
}
