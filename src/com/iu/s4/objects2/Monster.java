package com.iu.s4.objects2;

public class Monster {
	
	//멤버변수, instance 변수
	int power;
	int hp;
	
	//생성자, Constructor
	public Monster() {
		//매개변수가 없는 생성자를 기본생성자 Default Constructor
		this.power=50;
		this.hp=60;
				
		System.out.println("생성자 실행");
	}
	
	public Monster(int power) {
		
	}
	
	//멤버메서드, instance method
	
	public boolean checkValue(Monster monster) {
		//나의 power와 monster의 power가 같고, 나와 hp가 같다면 true리턴, 아니면 false 리턴
		if(monster.hp==this.hp && monster.power==this.power) {
			return true;
		}else {
			return false;
		}
	}
	//공격
	
	//어슬렁
	public void info() {
		System.out.println(this);
		//참조변수 this : class 내부에서만 사용 가능, 생성된 객체주소를 담고있음
		System.out.println(this.power);
		//this는 생략 가능
		System.out.println(hp);
		
		this.attack(); //this 생략가능
		
	}
	
	public void attack() {
		System.out.println("공격합니다");
		// this.info(); 무한반복 되면서 StackOverFlow 발생
		
		
	}
	
	
	
	public void setHp(int hp) {
		this.hp=hp; //this.멤버변수 = 매개변수이면서 지역변수 
		// hp=hp; 이렇게 쓰게 되면, 지역변수(매개변수) = 지역변수 가 되어버림
		// 지역변수와 멤버변수 구분을 위해서 대입하는 상황이 올 경우에는 this를 사용해주어야함
		
	}

}
