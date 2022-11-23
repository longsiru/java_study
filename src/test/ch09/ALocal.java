package test.ch09;
/*
 * 类中类
 */
public class ALocal {
	void useB(int arg) {
		
		//로컬변수
		int var = 1;  //final int var 虽然没有final但是是默认有final的
		
		class B{
			//인스턴스 필드
			int field1 = 1;
			
			//생성자
			B() {
				System.out.println("B생성자 실해");
			}
			
			//인스턴스 메소드
			void method1() {
				System.out.println("B메소드 실해");
			}
			
			void method2() {
				arg = 2;
				ver = 2;
			}
		}
		//메소드 안에서 객체 생성
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
	}

	
	
}
