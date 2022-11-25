package test.ch11.Object;

public class ToStringEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성", "안드로이드");
		
		
		//toString: 객체의 문자정보를 리턴을 한다.
		//@@4e718207 -> 객채를 나타내는 16진수의 hashcode.
		//override를 해서 사용을 할때는 특별하게 나다내고 싶은 문자,不用override的话就会只出现hashcode
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);  //同上输出的结果。
		
		try {
			int value = Integer.parseInt("1oo");
		}catch(NumberFormatException e) {
			System.err.println("에러입니다"); 
		}
		
		
	}

}
