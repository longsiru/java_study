package test.ch08;
/*
 * 在JAVA中:一个类无法继承自多个类，但是可以实现多个接口，使用关键字implements,
 * 		  多个接口之间使用“,”隔开, 多个接口之间，没有先后顺序
 *这个类叫做实现类，这个类必须实现所有接口的所有方法
 */
public class Television implements RemoteControl  {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
			}
		System.out.println("현재 TV volume: " + volume);
	}
	
}
