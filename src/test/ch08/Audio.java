package test.ch08;

public class Audio implements RemoteControl {
	//field
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("audio를 켭니다.");
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

	private int memoryVolume;  //volume을 기억하는 필드.
	
	//디풀트 메소드는 오버라이드시 반드시 public법근 제한자를 붙여야 한다.
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("음소거 처리 힙니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("음소거 해제.");
			setVolume(this.memoryVolume);
		}
	}
	
	
	}


