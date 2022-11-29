package test.ch08.typp2;

public class CastEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		//vehicle.checkFare();//오류
		
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
//		ride(taxi);
//		ride(bus);
	}

//	public static void ride(Vehicle vehicle) {
//		//vehicle이 Bus 객체를 가지고 있냐?  Vehicle vehicle = new bus();
//		if(vehicle instanceof Bus) {
//			Bus bus = (Bus) vehicle;//用强制变换来实现bus中没有override的checkFare（）方法。
//			bus.checkFare();
//		}
//		
//	}
}
