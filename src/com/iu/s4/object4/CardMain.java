package com.iu.s4.object4;

public class CardMain {

	public static void main(String[] args) {
		
		//클래스명.변수명
		System.out.println(Card.size);
		//프로그램이 로밍될때 메인메서드보다 먼저 만들어져있음
		//선언된 클래스이름을 사용하여 객체생성없이 선언하여 사용
		Card.staticMethod();
		
				
		Card card = new Card();
		card.setShape("Heart");
		card.setColor("Red");
		card.setNumber(1);
		
		Card.size=8;

		Card card2 = new Card();
		card2.setShape("Spade");
		card2.setColor("Black");
		card2.setNumber(12);
				
		
		card.info();
		card2.info();
		
	}

}
