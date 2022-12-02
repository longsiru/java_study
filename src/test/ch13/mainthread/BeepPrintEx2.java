package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEx2 {  //声音和文字同时出现

	public static void main(String[] args) {
		//Runnable:스레드 실행을 위핸 인터페이스
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() { //run():实际线程执行的代码。
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep(); //빔소리를 냄
					try {
						Thread.sleep(500); //0.5초 일시정지
					}
					catch(Exception e) {
						
					}
				}
				
			}});
		
		thread.start();
		
		
		//main thread
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); //0.5초 일시정지
			}
			catch(Exception e) {
				
			}
		}
		
		
		

	}

}
