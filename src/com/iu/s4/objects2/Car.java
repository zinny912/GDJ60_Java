package com.iu.s4.objects2;

public class Car {

	String company;
	String name;
	int price;
	String color;
	
	public Car() { //default 생성자 : 매개변수가 없는 생성자
		this("Black");//생성자 내에서 다른 생성자를 호출할 때 쓰는 구문
//		this.company = "Kia";
//		this.name = "스포티지";
//		this.price = 3500; 
//		this.color = "Black";
		
	}
	
	public Car(String color) { // overloading
		this(color,3500);
//		this.company = "Kia";
//		this.name = "스포티지";
//		this.price = 3500; 
//		this.color = color;
	}
	
	public Car(String color, int price) {
		this(color,price,"스포티지");
//		this.company = "Kia";
//		this.name = "스포티지";
//		this.price = price; 
//		this.color = color;
			
	}

	public Car(String color, int price, String name) {
		
		this.company = "Kia";
		this.name = name;
		this.price = price; 
		this.color = color;
		
	}

	public void info() {
		System.out.println("Name : "+this.name);
		System.out.println("Company : "+this.company);
		System.out.println("Price : "+this.price);
		System.out.println("Color : "+this.color);
	}
	
}
