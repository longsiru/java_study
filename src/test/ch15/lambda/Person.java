package test.ch15.lambda;

public class Person {
	public void action(Calcuable2 calculable2) {
		double result = calculable2.calc(10, 4);
		System.out.println("결과: " + result);
	}
}
