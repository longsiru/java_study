package test.ch13.multiThread;

public class ThreadNameEx {

	public static void main(String[] args) {
		
		//main thread 이름 가져오기
		 Thread mainThread = Thread.currentThread();
		 System.out.println(mainThread.getName() + "실행");
		
		//thread 3개 생성
		for(int i=0; i<3; i++) {
			//匿名类直接实例化接口、익명 객체 구현 인터페이스. Thread threadA = new Thread() {};
			Thread threadA = new Thread() {

				@Override
				public void run() {
					System.out.println(getName() + "실행");
				}
				
			};
			
			threadA.start();
		}
		
		//chat thread 생성
		Thread chatThread = new Thread() {

			@Override
			public void run() {
				System.out.println(getName() + "실행");
			}
			
		};
		chatThread.setName("chat-thread");
		chatThread.start();
		
		
		
		
		
		
		
		
	
		
		

	}

}
