package test.ch08.qusetion;

public class RemoconTest {

	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
	}
	
}

interface Remocon {  //public interface Remocon 这样写的话要放在单独的interface文件中
		public void powerOn();
	}

class TV implements Remocon {

		@Override
		public void powerOn() {
			System.out.println("TV를 켰습니다.");
		}
		
	}
