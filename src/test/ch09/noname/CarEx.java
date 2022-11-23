package test.ch09.noname;

public class CarEx {

	public static void main(String[] args) {
		// Car 객체생성
		Car car = new Car();
		
		car.run1();
		car.run2();
		car.run3(new Tire() {

			@Override
			public void roll() {
				System.out.println("이젠 타이어가 굴러갑니다");
			}
			
		});

	}

}
