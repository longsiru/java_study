package test.ch08;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("=============================");
		
		rc = new Audio();//audio로 교체.
		
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
		
		
		
		
//		RemoteControl rc = new Television();
//		rc.turnOn();
		
//		RemoteControl rc1 = new Audio();
//		rc1.turnOn();
		
		/*
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();//audio로 교체.
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		
		//static의 특성을 가졌기 때문에 객체를 생성하지 않고 호출할 수 있다.
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		*/
		
		

	}

}
