package com.iu.s4.object4;

public class GodMain {

	public static void main(String[] args) {
		
		//singleTon
		//객체가 딱 1개만 있게끔 유도하는 디자인패턴
		
		
		God god = God.getInstance();
		god.setName("유일신");
		
		System.out.println("God : "+ god);
		System.out.println("Name : "+ god.getName());
		
	//	God god2 = new God();
		
		god = God.getInstance();
		
		System.out.println("God : "+ god);
		System.out.println("Name : "+ god.getName());
		
		
		
	}

}
