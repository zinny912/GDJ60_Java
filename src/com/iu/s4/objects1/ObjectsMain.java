package com.iu.s4.objects1;

public class ObjectsMain {

	public static void main(String[] args) {
		System.out.println("Start");
		//main은 프로그램을 실행하려는 목적
		//Test 목적
		//main은 어느 클래스 안에 있어도 상관없음
		
		//학생 한명 생성
		//객체 생성
		//변수 선언과 거의 동일 //new : heap이라는 공간에 메모리영역 확보해라
		//클래스명 변수명 = new 클래스명();
		Student student= new Student();
		student.name="test";
		student.num=20;
		System.out.println(student);
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.avg);
		
		//학생객체 생성
		Student student2=new Student();
		
		student2.name = "iu";
		student2.num = 30;
		
		System.out.println(student==student2);
		
		student = student2; // 얕은복사
		System.out.println(student.name);
		student.name="winter";
		System.out.println(student2.name);
		
		//가비지 garbage collector 
		
		System.out.println("Finish");

	}

}
