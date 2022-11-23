package test.ch09.outer;

public class A {
	//ㅁ클래스의 인스텈스 필드와 메소드
	int field1;
	void method1() {}
	
	//A클래스의 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스
	class B{
		void method() {
			field1 = 10; //o
			method1();  //o
			
			field2 = 10; //o
			method2(); //o
		}
	}
	
	//정적 멤버 클래스
	static class C{
		void method() {
			//정적 멬버 클래스에서는 바깔 클래스의 인스턴스 필드와 메소드 접근 할 수 없다.
			field1 = 10; //x
			method1();  //x
			
			field2 = 10; //0
			method2();  //o
		}
	}
}
