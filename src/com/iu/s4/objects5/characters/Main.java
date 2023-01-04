package com.iu.s4.objects5.characters;

public class Main {

	public static void main(String[] args) {
		
		Archer archer = new Archer();
		
		Character character = null; //추상클래스라서 객체생성X
		
		character = archer; // archer는 character타입이다.(상속관계)
		// archer는 character 타입이면서 archer 타입
		
		archer = (Archer)character; // Archer타입으로 형변환
		//archer = character; 에러뜸. character 안에 속해있는 magition != archer 임
		
		archer.attack();
		//character.attack(); 에러뜸.
		
//		Magition magition = new Magition();
//		magition.getMp();
//		magition.setMp(0);		
//		magition.setName("");
//		
//		Archer archer = new Archer();
//		archer.setDex(0);
//		archer.setLevel(3);
//		
//		magition.attack();
//		archer.attack();
//		
//		Character character = new Character("");
//		//추상클래스는 객체생성 불가. abstract로 지정된 클래스
//		//데이터타입으로는 선언가능
//		

	}

}
