package com.iu.s4.object3.p1;

public class Member {
	
	// 비만관리 회원등록
	private String name;
	private int age;
	private double ki;
	private double muge;
	private boolean check;
	//private를 설정하면 같은 클래스 내에서만 사용가능
	//다른 클래스의 멤버변수에서 사용 불가
	//public 멤버 메서드 만들어서 사용가능하게 만들어서 사용
	
	
	public Member() {}
	
					  //매개변수 age
	public Member(int age) {
		if(age>0 && age<200) {
			this.age=age;
			//멤버변수	//매개변수 age
		}
	}

	
	
	
	
//	public void setName(String name) {
//		this.name=name;
//	}
//	
//	public String getName() {
//		return this.name;
//	}
//	
//	public void setKi(double ki) {
//		if(ki>100 && ki<220) {
//		this.ki=ki;
//		}
//	}
//	
//	public double getKi() {
//		return this.ki;
//	}
//	
//	public void setMuge(double muge) {
//		if(muge>40 && muge<200) {
//		this.muge=muge;
//		}
//	}
//	
//	public double getMuge() {
//		return this.muge;
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public double getMuge() {
		return muge;
	}

	public void setMuge(double muge) {
		this.muge = muge;
	}
	
	

	//멤버메서드 사용하여 외부에서 사용가능하게 만들기 set
	//setter 메서드
	//set+멤버변수 변수명의 첫글자를 대문자로바꾼것
	public void setAge(int age) {
		if(age>0 && age<200) {
		this.age=age;
		}
	}
	// 리턴으로 외부의 값을 받아오기 get
	// getter 메서드
	//get+멤버변수 변수명의 첫글자를 대문자로바꾼것
	public int getAge() {
		return this.age;
	}
	
	public void info() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
	}
	
	
	

}
