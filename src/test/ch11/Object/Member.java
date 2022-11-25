package test.ch11.Object;

public class Member extends Object {
	//field
	public String id;
	
	
	//constructor
	public Member(String id) {
		this.id = id;
		
	}


	@Override
	public boolean equals(Object obj) {
		//obj가 member 객체를 가지고있냐?
		if (obj instanceof Member) { //강제 형변환을 하기위해서 검사
			Member target = (Member)obj;  //강제 형변환
			
			if(id.equals(target.id)) { //여기서의 equals은 String의 
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	/*
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = obj1;
		
		System.out.println(obj1.equals(obj2));  //번지수를 비교
		System.out.println(obj1 == obj2);  //번지수를 비교
		
		String a = "1";
		String b = "2";
		
		if (a == b) //x 주소를 비교
		if (a.equals(b))  //O  값을 비교
		//논리적 동등: 같은 객체든 다른 객체든 객체 저장ㅇ 데이터가 동일하다.
	}
	*/
}
