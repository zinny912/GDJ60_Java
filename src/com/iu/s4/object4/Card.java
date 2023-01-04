package com.iu.s4.object4;

public class Card {
	
	//Card 
	private String shape;
	private int number;
	private String color;
	
	//클래스변수
	//Static을 사용하여 클래스 변수로 만듦
	public static int size = 10; //공용으로 사용하는 변수는 그외지정자 static으로 지정하여 객체생성을 하지 않고 클래스변수로 
	
	//instance 초기화블럭 (멤버변수의 값을 초기화)
	{}
	
	//static 초기화블럭
	static {
		Card.size = 50;
	}
	
	//클래스메서드 static 메서드
	//멤버메서드나 멤버변수를 사용할 수 없음
	//객체생성은 가능
	//객체생성 후 멤버변수나 멤버메서드 사용 가능, 객체 생성없이는 사용안됨
	public static void staticMethod() {
		Card.size=10;
		System.out.println("Static Method");
//		System.out.println(this.shape);
//		this.info();
		Card card = new Card();
		card.info();
	}
	
	//멤버 메서드 내에서는 클래스변수나 클래스메서드 사용가능
	public void info() {
		System.out.println("Shape : "+this.shape);
		System.out.println("Color : "+this.color);
		System.out.println("Number : "+this.number);
		System.out.println("Size : "+Card.size);
		Card.staticMethod();
	}
	
	
	
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
