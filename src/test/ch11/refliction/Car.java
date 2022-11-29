package test.ch11.refliction;

public class Car {

	public static void main(String[] args) {
//		Class clazz = Car.class;
//		Class clazz = Class.forName("");
		
		
		Car car = new Car();
		Class clazz = car.getClass();
		
		System.out.println();

	}

}
