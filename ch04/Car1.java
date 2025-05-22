package ch04;

public class Car1 {

	//this 연습
	
	String company = "포르쉐";
	String model ;
	String color ;
	int maxSpeed ;
	int Speed ;
	
	
	//생성자 (객체 생성시 초기화 역할)
	public Car1(String model){
		this.model = model;
		this.color = "빨강";
		this.maxSpeed = 250;
	}
	
	public Car1(String model, String color){
		this.model = model;
		this.color = color;
		this.maxSpeed = 250;
	}
	
	public Car1(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}


	
}
