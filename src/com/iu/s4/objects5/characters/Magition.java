package com.iu.s4.objects5.characters;

public abstract class Magition extends Character{
// 부모클래스에서 상속받은 attack()메서드 완성이 안되어 abstract설정	
	
	private int mp;
	
	public Magition() {
		super("ㄴㄴㄴ");
	}
	
//	public void attack() {
//		System.out.println("마법 공격");
//		
//	} 부모클래스에서 상속받으면 자기자신에서는 해당 메서드 삭제
	
	
	
	//override
	//하위 클래스에 재상속해야해서 해당 멤버메서드를 삭제하면 (부모 클래스 캐릭터로부터 받아온 어택 메소드가 완성안됨)
	//클래스내에 완성되지 않은 추상 메서드가 생겨서 오류 문구 뜸 -> 클래스에도 그외지정자 abstract 추가
//	public void attack() {
//		System.out.println("마법공격");
//	}
	public void spell() {
		
	}

	
	//setter & getter----------------------------------------------------------
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	

}
