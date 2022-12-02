package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEx {  //声音和文字不是同时实行，先文字5次出来之后，文字才开始出来实行5次。

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();  //为什么要用toolkit:为了beep();的声音
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); //0.5초 일시정지
			}
			catch(Exception e) {
				
			}
		}
		
		
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
