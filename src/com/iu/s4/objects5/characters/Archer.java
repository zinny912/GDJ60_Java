package com.iu.s4.objects5.characters;

public class Archer extends Character implements AttackAble {
	//private String name
	
	private int dex;
	
	public Archer() {
		super("");
		// 기본생성자 사용안하더라도 적어둬야함
		// 부모생성자를 호출(생략가능) , 생성자 라인의 첫줄에 위치해야함
		// super(); this(); 두개는 같이 쓸 수 없다 첫줄에 위치해야해서
	}
	
//	public void attack() {
//		System.out.println("활쏘기");
//		System.out.println(this.getName());
		//getName은 public으로 되어있어서 가능한데, this.name은 private로 되어있어서 불가
//	} //부모클래스로부터 상속받아서 자기자신의 메서드는 삭제, 개별적으로 내용 변경하려면 
	//override↓
	
	@Override
	public void attack() {
		System.out.println("활 공격");
		
	}
	
	public void move() {
		System.out.println("이동~");
	}
	
	
	
	
	//setter & getter---------------------------------------------------
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	
	
	
	
	
	}
