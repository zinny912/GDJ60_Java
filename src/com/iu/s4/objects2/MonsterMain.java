package com.iu.s4.objects2;

public class MonsterMain {

	public static void main(String[] args) {
		Monster mon1 = new Monster();
		//mon1.Monster(); 생성자를 이렇게 사용 할 수는 없음. new 생성자() 형태로 사용가능
		mon1.power=10;
		mon1.hp=100;
		Monster mon2 = new Monster();
		mon2.power=10;
		mon2.hp=100;
		
		System.out.println(mon1 == mon2);
		boolean result = mon1.checkValue(mon2);
		boolean result2 = mon2.checkValue(mon1);
		System.out.println("Result : "+result);
		
//		System.out.println(mon1);
//		mon1.info();
//		System.out.println(mon2);
//		mon2.info();

	}

}
