package test.ch08;

public interface Service {
	//디풀드 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
	}
	
	
	//private method
	/*
	private void defaultCommon() {  //jdk8不支持在interface 写private
		System.out.println("defaultMethod1 종속 코드");
		System.out.println("defaultMethod1 종속 코드");
	}
	*/
	
	//static method
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
	}
}
