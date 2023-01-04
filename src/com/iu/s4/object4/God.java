package com.iu.s4.object4;

public class God {
	// 변수앞에 붙으면 변하지 말아라 -> 상수화
	private static final String MY_NAME=""; // 두단어 합쳐질 경우에는 스네이크법 사용해서 _ 구분
	// final이 붙은 변수는 전부 대문자로 
	
	private static God god; //클래스변수
	
	private God() {
		//this.name="test"; //final을 써서 상수화됨 
	}

	public static God getInstance/*makeGod*/() {
	//**************어려웡********************
		if(God.god==null) {
			God.god = new God();
		}
		
	//	God god = new God();
		
		return God.god; // new God();
		
	}
	// 상속 시 over riding 하지 말라는 뜻
//	public final String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
	

}
