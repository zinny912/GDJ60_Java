package com.iu.s4.objects5;

public class Car /*extends Engine으로 상속(확장)하면 안됨*/ {
	Engine engine; //멤버변수로 선언해서 받아야함
	String brand;
	//Car 가 engine, brand를 가지고 있다.O ->포함
	//Car 가 engine이다. X -> 상속
}
