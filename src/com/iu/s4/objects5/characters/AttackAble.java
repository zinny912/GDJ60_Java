package com.iu.s4.objects5.characters;

public interface AttackAble {
	
	//상수
	public static final int DAMAGE = 1;
	
	
	
	//추상메서드 - 메서드 선언부까지만 선언
	
	//접근지정자 : 무조건 public
	//그외지정자 : abstract
	public abstract void attack();
//	abstract void attack2();
//	void attack3();
//	public void attack4(); //강사님 방식
	
//	//인터페이스안에서 알아서 public, abstract 지정해줌
	
}
