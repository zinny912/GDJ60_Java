package com.iu.s4.objects1.ex1;

import java.util.Scanner;

import com.iu.s4.objects1.ex1.Student;

public class StudentInput {
	
	//findStudent
	//정보가 있는 학생 배열을 받아서
	//학생의 번호를 입력받고
	//학생번호가 일치하는 학생을 return 리턴타입(Student타입) , 없으면 null
	
	public Student findStudent(Student [] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 학생의 번호를 입력");
		int num = sc.nextInt();
	 Student student = null;			
		for(int i=0; i<students.length;i++) {
			if(num==students[i].num) {
				//return students[i];
				student = students[i];
			}
		}
		//return null;
		return student;
	}
	
	
	//setStudent
	//학생 한명을 메서드안에서 객체 생성해서, 이름,번호,국어,영어,수학 입력
	//총점 평균 계산
	
	public Student [] setStudent(Student [] students) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
				
		System.out.print("이름: ");
		student.name = sc.next();
		System.out.print("번호: ");
		student.num = sc.nextInt();
		System.out.print("국어: ");
		student.kor = sc.nextInt();
		System.out.print("영어: ");
		student.eng = sc.nextInt();
		System.out.print("수학: ");
		student.math = sc.nextInt();
		
		student.total=student.kor+student.eng+student.math;
		student.avg =student.total/3.0;
		
		Student [] newStudents = new Student[students.length+1];
		for(int i=0; i<students.length; i++) {
			newStudents[i]=students[i];
		}
		newStudents[students.length]=student;
		return newStudents;
		
	}	
	
	//setAllStudents
	//매개변수로 학생배열을 받아서
	//배열의 수 만큼 학생 객체를 생성해서 이름,번호,국어,영어,수학 입력
	//총점 평균 계산
	//학생 객체를 배열에 대입
	
	public void setAllStudents(Student [] students) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<students.length; i++) {
			Student student = new Student();
			
			System.out.print("이름: ");
			student.name = sc.next();
			System.out.print("번호: ");
			student.num = sc.nextInt();
			System.out.print("국어: ");
			student.kor = sc.nextInt();
			System.out.print("영어: ");
			student.eng = sc.nextInt();
			System.out.print("수학: ");
			student.math = sc.nextInt();
			student.total=(student.kor+student.eng+student.math);
			student.avg = student.total/3.0;
			System.out.print("총점: "+student.kor+student.eng+student.math);
			System.out.print("평균: "+student.total/3.0);
			students[i]=student;
		}
		
	}
		
	}


