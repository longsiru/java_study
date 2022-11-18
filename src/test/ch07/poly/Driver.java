package test.ch07.poly;
/*
 * 메소드의 더형성
 */
public class Driver {
	//메소드(매개변수로 다형성을 구현한다)
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
