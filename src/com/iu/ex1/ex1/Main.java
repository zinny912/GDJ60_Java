package com.iu.s4.objects1.ex1;

public class Main {

	public static void main(String[] args) {
		MenuController menuController = new MenuController();
		
		//menuController.start();
		StudentView sv = new StudentView();
		Student student = new Student();
		student.name="iu";
		student.num=3;
		student.kor=30;
		student.eng=40;
		student.math=50;
		student.total=120;
		student.avg=40.0;
		Student student2 = new Student();
		student2.name="winter";
		student2.num=3;
		student2.kor=30;
		student2.eng=40;
		student2.math=50;
		student2.total=120;
		student2.avg=40.0;
		
		Student [] students = new Student[2];
		students[0]=student;
		students[1]=student2;
		
//		sv.viewOne(student);
		sv.viewList(students);
		

	}

}
