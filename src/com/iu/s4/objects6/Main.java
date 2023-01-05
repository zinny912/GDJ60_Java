package com.iu.s4.objects6;

public class Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Robot robot = new Robot();
		
		//ArmLeft 객체생성 // ArmLeft와 Robot은 약한연결 : 서로의 생명주기에 영향을 받지 않음 // setter로 객체생성
		ArmLeft armLeft = new ArmLeft();
		robot.setArmLeft(armLeft);
		
		System.out.println(robot.getArmLeft());
		System.out.println("Right : "+robot.getArmRight());//ArmRight 객체는 Robot클래스(내부)에서 생성 // ArmRight와 Robot은 강한연결: 생명주기가 같음 
		// Robot에서 생성된 ArmRight는 setter가 없어도 작동이 되지만, ArmRight가 교체될 경우 setter가 없으면 변경이 안됨
		
		robot = null; // 객체를 소멸시키는 과정 
		
		System.out.println("프로그램 종료");
	}

}
