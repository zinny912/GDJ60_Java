package com.iu.s4.object3.p2;

import com.iu.s4.object3.p1.Secret;
//import com.iu.s4.object3.p1.*; <- 모든것 *(와일드카드) : 클래스명만 *으로 사용 가능 / 패키지명은 *로 사용 불가
// 해당패키지안에서 사용되는 클래스의 위치 안내

public class SecretMain {

	public static void main(String[] args) {
		//클래스				//생성자
		Secret secret = new Secret();
						//생성자 접근지정자가 default면 다른 패키지에서 사용불가
		//클래스 앞에는 접근지정자 있어서 사용가능
	
		//com.iu.s4.object3.p1.Secret secret = new com.iu.s4.object3.p1.Secret();
		//import 사용하여 다른 패키지에 있는 클래스 및 메서드의 위치를 불러와서 해당 패키지 안에서 사용 가능하게끔 만들어줌
		
		com.iu.s4.object3.p2.Secret secret2 = new com.iu.s4.object3.p2.Secret();
		//다른 패키지에 저장된 각각의 클래스의 클래스명이 동일한 경우 : secret 은 p1패키지에서, secret2는 p2패키지의 클래스를 사용하고 싶으면 풀패키지명을 명시해줘야함
		
		secret.money=1;
		
		secret.s1();
		//secret.s2();//접근지정자가 default라서 같은 패키지 내에서만 사용가능
			
		//System.out.println(secret.money /*접근지정자때문에 에러뜸*/ );
		System.out.println(secret.point); //접근지정자 변수에 설정
		Test test = new Test();
		//같은 패키지 안에 있어서 Test 생성자 앞에 default가 붙어도 사용가능
		//접근지정자 private가 붙으면 같은 패키지여도 사용 불가
		System.out.println(test.point);
		
	}

}
