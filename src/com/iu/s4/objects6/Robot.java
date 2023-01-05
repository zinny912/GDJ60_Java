package com.iu.s4.objects6;

public class Robot {

	// Robot클래스는 ArmLeft ArmRight 클래스에 대해 의존적이다 defendency
	private ArmLeft armLeft;
	private ArmRight armRight=new ArmRight(); //강한결합
						↑←←←←←←←←↓
					//의존성을 주입 defendency injection : 의존성 주입 -> 개발자역할
	
	//default 
	public Robot() {
		this.armRight = new ArmRight();
	}
	
	public Robot(ArmRight armRight) {
		this.armRight = armRight; 
		// 외부에서 받아서 넣음 : 약한결합
	}
	
	
	public ArmLeft getArmLeft() {
		return armLeft;
	}
	public void setArmLeft(ArmLeft armLeft) {
		this.armLeft = armLeft;
	}
	public ArmRight getArmRight() {
		return armRight;
	}
	public void setArmRight(ArmRight armRight) {
		this.armRight = armRight;
	}
	
	
	
	
}
