package test.ch13.sync;

public class User2Thread extends Thread {
	private Calculator calculator;
	
	public User2Thread() {
		setName("user2Thread"); //thread name change
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	//thread 실행
	@Override
	public void run() {
		calculator.setMemory2(50);
	}
	
	
	
}
