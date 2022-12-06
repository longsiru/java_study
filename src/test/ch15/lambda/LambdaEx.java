package test.ch15.lambda;

public class LambdaEx {

	public static void main(String[] args) {
//		action(new Calculable() { //하위 클래스 + 오버라이드
//			@Override
//			public void calculate(int x, int y) {
//				System.out.println(x + y);
//			}
//		});
//		
//		action(new Calculable() { //하위 클래스 + 오버라이드
//			@Override
//			public void calculate(int x, int y) {
//				System.out.println(x - y);
//			}
//		});
		
		
		
		// 람다식은 인터페이스를 보고 만들며 함수명 제거하고 형 제거하고 표현함
		//람다식은 인터페이스에 단 하나의 추상메서드가 있어야 가능하다
		//람다식 :위의 표현과 같은 작동
		action((x,y)->{
			System.out.println(x + y);
		});
		
		action((x,y)->{
			System.out.println(x - y);
		});
		
		//매개변수 
		//action(x -> System.out.println(x));
	}
	
	private static void action(Calculable Calculable) {
		int x = 10;
		int y = 4 ;
		Calculable.calculate(x, y);
	}

}



