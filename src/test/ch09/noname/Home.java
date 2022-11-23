package test.ch09.noname;

public class Home {
	//field에 익명 구현 겍체 대입
	private RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
		
	};

	//method
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	//method(use the local variable)
	public void use2() {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다");
				
			}

			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다");
				
			}
			
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	//method(매개변수 이용)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
