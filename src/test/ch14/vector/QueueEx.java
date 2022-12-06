package test.ch14.vector;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue:先入先出
 */
public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> msgQ = new LinkedList<>();
		//메시지 넣기
		msgQ.offer(new Message("sendMain", "홍길동"));
		msgQ.offer(new Message("sendSMS", "용사"));
		msgQ.offer(new Message("sendKakao", "여사"));
		
		//메시지 내보내기
		while(!msgQ.isEmpty()) {
			Message msg = msgQ.poll();
			System.out.println(msg.command + ", " + msg.to);
		}
		
		

	}

}

class Message{
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
