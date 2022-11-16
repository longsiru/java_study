package test.ch06.exam01.package1;


// 클래스는 PUBLLIC, DEFAULT접근제한자를 가잘 수 없다.
//생성자 
public class A {
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 = 1;  //o
		field2 = 2;  //o
		field3 = 3;  //o
		method1();  //o
		method2();  //o
		method3();  //o
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}
}
