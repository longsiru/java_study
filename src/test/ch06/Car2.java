package test.ch06;

public class Car2 {

	// instance field 
			int speed;
			
				
	//instance method 
			void run() {
				System.out.println(this.speed + "으로 달립니다.");
			}
			
			void run2() {
				this.run(); 
				System.out.println(this.speed + "으로 달립니다.");
			}
		
			//static block can not used.
//			static {
//				this.speed = 200;
//				this.run();
//			}
			
	//static method
			static void simulate() {
				Car2 myCar = new Car2();
//				this,speed = 200;  can't use 'this' key word: inaccessible
//				this.run();   can't use 'this' key word: inaccessible
				myCar.speed = 200;
				myCar.run();
			}
	public static void main(String[] args) {

		simulate();
		
		Car2 myCar = new Car2();
		
		myCar.speed = 60;
		myCar.run();
	}

}
