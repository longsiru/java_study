package test.ch06;

public class Korea {
	// final field(지정된 값들을 절대로 변경할 수 업다 . 최종값.)
	//final field느초기값을 무조건 줘야한다(field선언 시 주거나 혹은 생성저에서 줘야 한다.)
	final String nation = "대한민국";
	final String ssn; //주님번호
	
	//인스텐스 필드 instance field
	String name;
	
	//생성자 constructor
	Korea(String ssn, String name){
		//초기값 부여
		this.ssn = ssn;
		this.name = name;
	}
}
