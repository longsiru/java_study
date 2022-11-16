package test.ch06;

public class GetSetEx {

	public static void main(String[] args) {
		GetSet getset = new GetSet();  //写了这个的话，就可以用GetSet文件的private
		getset.setSpeed(10);
		System.out.println(getset.getSpeed());
		
		
		if(!getset.isStop()) {//달라고 있을때
			getset.setStop(true); //멈춤
		}
		System.out.println(getset.getSpeed());
	}

}
