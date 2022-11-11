package test.ch05;

public class EqualsEX {

	public static void main(String[] args) {
		
		//String은 리ㅓㅌ럴이 같으면 같은 주소를 기르킨다.(참저한다).
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1와 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1와 strVar2는 참조가 다름");
		}
		
		
		//값을 비교할땐 equals함수사용.
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1와 strVar2는 참조가 같음");
		}
		
		
		//3과4 在不同的地址，所以不相等。 new로 생성하면 같은 값이라더 가르키는 주소가 다르다
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		if (strVar3 == strVar4) {
			System.out.println("strVar3와 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3와 strVar4는 참조가 다름");
		}
	}

}
