package com.iu.s4.objects1;

public class ObjectMain2 {

	public static void main(String[] args) {
		//Sword의 Instance 생성
		//클래스명 참조변수명 = new 클래스명();
		//참조변수명.변수명
		
		//s1은 reference type의 지역변수, 참조변수	
		Sword s1 = new Sword();
		s1.name = "집행검"; 
		s1.price=50000;
		s1.damage=50;
		s1.nnn=200;
		s1.upgrade=3;
		//name, price,damage,nnn,upgrade 이 변수들은 Heap영역에 생성됨 : instance변수(멤버변수)		
		
		Knight knight= new Knight();
		knight.name = "우락부락";
		knight.hp = 10000;
		knight.power = 200;
		knight.energy = 500;
		knight.fast = 50;
		knight.intel = 5000;
		
		knight.sword=s1;
		
		System.out.println(knight.sword.name);
		
		//변수 선언
		Sword s2=null;
		
		System.out.println(s2.damage);
	
		
		
	}

}
