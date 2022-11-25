package test.ch11.warpper;

public class ValueCompareEx {
	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 == obj2);  //false
		System.out.println(obj1.equals(obj2)); //true
		System.out.println();
		
		/*
		 * [값을 비교하는 타입]
		 * Boolean
		 * Character
		 * bytr, short, Integer : -128 ~ 127 까지는 값을 비교하는 타입
		 */
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);  //true
		System.out.println(obj3.equals(obj4));  //true
		
		
		
		
	}
}
