package test.ch06.exam01.package1;


// 클래스는 PUBLLIC, DEFAULT접근제한자를 가잘 수 없다.
//생성자 
public class A {
	A a3 = new A("문자열");  //private생성자는 같은 클래스 내에서만 사용할 수 있다.
	
	public A(boolean b) {
		
	}
	
	A(int b) {
		
	}
	
	
	private A(String s) {
		
	}
}
