package com.iu.s4.objects5.characters;

public abstract class Character {
	private String name;
	private int hp;
	private int level;
	//private 붙어서 character 클래스 내부에서만 쓸 수있다
	
	public Character(String name) {
		this.name = name;
	}
	
	public Character() {}
	
	//상속받은 클래스 아이들이 overriding해서 써라,, {} 안에 들어갈 내용이 없음. -> abstract
	//멤버메서드 선언부에 사용될 경우 오버라이딩해서 써라
//	public abstract void attack();
	//	   --------> 미완성된 클래스 ----------------> 클래스 선언부에도 abstract 그외지정자 설정해줘야함
	
	
	
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	

}
