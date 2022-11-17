package test.ch07;

public class SmartPhone extends Phone {
	//필드
	public boolean wifi;
	
	//construction
	public SmartPhone(String model, String color) {
		//如果父类没有给媒介变数的话，这里也可以省略，然后在下面给初始值。
		super();//부모 생성자 호출 
		System.out.println("자식 생성자 호출");
		this.model = model;  //부모필드에 접근 가능 
		this.color = color;  //부모필드에 초기값을 준다.
	}
	
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
