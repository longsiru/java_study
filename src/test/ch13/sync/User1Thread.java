package test.ch13.sync;

public class User1Thread extends Thread{

	private Calculator calculator;
	
	public User1Thread() {
		setName("user1Thread"); //thread name change
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	
	//thread 실행
	@Override
	public void run() {
		calculator.setMemory1(100);
	}
	
	
	
	
	
	
	
}
