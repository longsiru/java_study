package test.ch11.System;

import java.io.IOException;

public class InEX {

	public static void main(String[] args) throws IOException{
			int speed = 0;
			int keycode = 0;
			
			
			while(true) {
				//enter키를 읽지 않았을때 실행
				if(keycode != 13 && keycode != 10) {
					if(keycode ==49 ) {  //숫자1키를 읽었을 경우
						speed++;
					}else if(keycode == 50) { //숫자2키를 읽었을 경우
						speed--;
					}else if(keycode == 51) {//숫자2키를 읽었을 경우
						break; //while나움
					}
					System.out.println("--------------------------");
					System.out.println("1.중속 2.감속 3.중지");
					System.out.println("--------------------------");
					System.out.println("현재속도= " + speed);
					System.out.println("선택: ");
				}
				keycode = System.in.read(); //키을 하나씨 읽너.
			}
			System.out.println("프로그램 중료");

	}

}
