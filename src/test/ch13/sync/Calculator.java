package test.ch13.sync;

public class Calculator {
	private int memory; //因为是私有的，所以get。

	public int getMemory() {
		return memory;
	}
	
	
	//메소드 동기화 걷기
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);//2초간 정지
		} catch (InterruptedException e) {}  
		
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		
	}
	
	
	//코드 브록에 동기화 걸기(내가 동기화를 걸기를 원하는 코드 번위 선택)
	public void setMemory2(int memory) {
		synchronized(this) {
		this.memory = memory;
		try {
			Thread.sleep(2000);//2초간 정지
		} catch (InterruptedException e) {}  
		
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		
	}
	}
	
	
	
}
