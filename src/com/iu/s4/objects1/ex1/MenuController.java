package com.iu.s4.objects1.ex1;

import java.util.Scanner;

//start
	//1. 등록
	//2. 수정
	//3. 삭제
	//4. 종료

public class MenuController {
		
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
			
		StudentInput si = new StudentInput(); //객체생성
		StudentView sv = new StudentView();
		
		while(check) {
			Student [] students = new Student[count];
			
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 검색 정보 출력");
			System.out.println("3.학생 전체 정보 출력");
			System.out.println("4.학생 추가");
			System.out.println("5.종료");
			int select = sc.nextInt();
			
			
			switch(select) {
			case 1:
				System.out.println("등록입니다");
				si.setAllStudents(students);
				System.out.println("");
				break;
			case 2:
				Student student = si.findStudent(students);
				if(student!=null) {
					sv.viewOne(student);
				}else {
					System.out.println("그런 학생 없어요");
				}	
				break;
			case 3:
				sv.viewList(students);
				System.out.println("삭제입니다");
				break;			
			case 4:
				students = si.setStudent(students);
				break;
			default :
				System.out.println("종료입니다");
				check=false;
				break;
			
			
			}
		}
//			
//			System.out.println("1.등록 2.수정 3.삭제 4.종료");
//			int a = sc.nextInt();
//			if(a==1) {
//				System.out.println("등록되었습니다.");
//				continue;
//			}else if(a==2) {
//				System.out.println("수정되었습니다.");
//				continue;
//			}else if(a==3) {
//				System.out.println("삭제되었습니다.");
//			}else if(a==4){
//				System.out.println("종료");
//				break;
//			}else {
//				continue;
//			}
//		
//
//		}

	}
}