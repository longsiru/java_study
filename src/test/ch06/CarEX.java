package test.ch06;

public class CarEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체 생성
		//Car myCar = new Car()
		Car myCar = new Car();
		
		//2.필드값 읽이
//		System.out.println(myCar.company);
//		System.out.println(myCar.model);
//		System.out.println(myCar.color);
//		System.out.println(myCar.maxSpeed);
//		System.out.println(myCar.speed);
		System.out.println(Car.numbering);
		System.out.println("--------------");
		
		Car car2 = new Car();
//		System.out.println(car2.model);
//		System.out.println(car2.color);
		System.out.println(Car.numbering);
		System.out.println("--------------");
		
		Car car3 = new Car();
//		System.out.println(car3.model);
//		System.out.println(car3.color);
//		System.out.println(car3.maxSpeed);
		System.out.println(Car.numbering);
		System.out.println("--------------");
		
		Car car4 = new Car();
		System.out.println(Car.numbering);
		
		//필드 값 변경
//		myCar.speed = 60; 
//		System.out.println("수정된 값:" + myCar.speed);
	}

}
