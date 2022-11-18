package test.ch07;

public class ChildEx {

	public static void main(String[] args) {
		/*//자식 객체
		Child child = new Child();
		
		Parent parent = child; //자동 타입 변환
		parent.method1();
		parent.method2();  //오버라이드 된 메소드를 불러온다.
		parent.method3(); //자식 객체에 있는 메소드는 불러오지 못한다.
		
		parent.a = 2;  //a부모필드
		parent.b = 1;  //b자식필드,접근 불가.
		*/
		
		
		
		Parent parent = new Child();  //자동타입 변환
		
		//instanceof: 객체타입 획인을 위한 자바에서 제공하는 연산자.
		//parent가 Child객체를 담고 있지 않으면 강제타입 변환을 할수 없으므로 
		if (parent instanceof Child) { //parent매개변수가 Child객체를 담고 있냐?
			Child child = (Child)parent; //강제타입 변환
			child.b = 1;  //지식 객채에 있는 필드에 접근 가능 
			child.method3();//지식 객채에 있는 메소드에 접근 가능 
		}
		
		

		
		
	}

}
