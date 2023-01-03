package com.iu.s4.objects1;

public class MethodTest3 {
				// 매개변수 ↓
	public void t3(int salary, double tax) {
		//3.3%를 뗀 실급여 계산 메서드
		salary=(int)(salary*tax);
		System.out.println("T3 : "+salary);
		
		
	}
	
	public void info(Sword sword) {
		
		//Sword 모든 정보를 출력
		System.out.println(sword.name);
		System.out.println(sword.damage);
		System.out.println(sword.nnn);
		System.out.println(sword.upgrade);
		System.out.println(sword.price);
		sword.name="단도";
	}
	
}

