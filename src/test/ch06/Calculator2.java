package test.ch06;

public class Calculator2 {
	//1.필드(속성)
	static double pi = 3.14159;
	static String model = "calc1";
	static String number = "1";
	static String info;
	
	
	//static block:  static field에 대한 처기화 작업 
	static {
		info = model + "_" + number;  //calc_1
	}
	
	
	
	//2.메소드(기능)
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {  //有static的时候不用new也可以）
		return x - y;
	}
	
}
