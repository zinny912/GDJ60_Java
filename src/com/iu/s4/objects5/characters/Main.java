package com.iu.s4.objects5.characters;

public class Main {

	public static void main(String[] args) {
		
		Magition magition = new Magition();
		magition.getMp();
		magition.setMp(0);		
		magition.setName("");
		
		Archer archer = new Archer();
		archer.setDex(0);
		archer.setLevel(3);
		
		magition.attack();
		archer.attack();
		
		Character character = new Character("");
		//추상클래스는 객체생성 불가. abstract로 지정된 클래스
		//데이터타입으로는 선언가능
		

	}

}
