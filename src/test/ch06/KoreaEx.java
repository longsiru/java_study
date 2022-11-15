package test.ch06;

public class KoreaEx {

	public static void main(String[] args) {
	
		Korea k1 = new Korea("123456-1234567", "감자바");
		k1.name = "mememe";  //可以这么修改
//		k1.ssn = "123123-1231234";不可以修改，因为是final field.
//		k1.nation = "China"  //不可以修改，因为是final field.
		
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		
		
	}

}
