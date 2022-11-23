package test.ch10;

public class ThrowsEx {

	//main메소드는 jvm에서 실행을 하고
	//main메소드에 throws를 사용해서 예외를 떠
	public static void main(String[] args) throws ClassNotFoundException{
		findClass(); //메소드를 호출한 곳에서 예외처리
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}
}
