package test.ch11.warpper;

public class BoxingUnboxing {

	public static void main(String[] args) {
		Integer obj = 100; //박신: 기본 타입의 값을 포장 객체로 만드는 것
		int value = obj; //언박신: 포장 객체를 기본타입으로 만드는 것.
		
		int value2 = obj + 5; //obj는 5와 연산되기 전에 언박싱이 된다.
		
		System.out.println("value: " + obj.intValue());
		System.out.println("value2: " + value2);
		
		
		
		
	}

}
