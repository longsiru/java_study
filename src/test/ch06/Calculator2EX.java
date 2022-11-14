package test.ch06;

public class Calculator2EX {

	public static void main(String[] args) {
//		Calculator2 calc2 = new Calculator2(); //객체 생성(instance를 성성)
//		calc2.pi = 10;
		Calculator2.plus(1, 2);  //객체(instance)를 생성하지 않아도 접근 가능
		Calculator2.minus(1, 2);
		System.out.println(Calculator2.pi);

	}

}
