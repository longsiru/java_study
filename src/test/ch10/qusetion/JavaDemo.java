package test.ch10.qusetion;

public class JavaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.변수 int num=10이 ‘양수’, ‘음수’, ‘0’인지 출력하는 코드를 자바로 작성하시오.
//		int num = 10;
//		System.out.println("result: " + ((num > 0)?"양수":(num < 0)? "음수": "0"));

		// 2. int [] arr = {10, 20, 30, 40, 50} 의 합과 평균을 출력하는 자바 코드를 작성하시오.
//		int [] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		int average=0;
//		for(int i =0; i < arr.length; i++) {
//			sum += arr[i];
//			average += arr[i]/5;
//		}
//		System.out.println("arr의 합은: " + sum);
//		System.out.println("arr의 평균은: " + average );

		// 3. 2680원이 있을때(int money=2680;) 500원, 100원, 50원, 10원짜리 동전으로 바꾸려고 한다.
		// 각각 몇개의 동전들이 필요한지 구하는 프로그램을 만드시오.

//		int money = 2680;
//		int[] arr = { 500, 100, 50, 10 };
//		for (int i = 1; i < arr.length; i++) {
//
//		}

		int[] arr = { 500, 100, 50, 10 };

		int money = 2680;
		int serplus = 0;
		int fifty = 0;
		int handred = 0;
		int five = 0;
		int ten = 0;
		serplus = money;
		for (int i : arr) {
			if (i == 500) {
				fifty = serplus /i;
			} else if (i == 100) {
				handred = serplus / i;
			} else if (i == 50) {
				five = serplus / i;
			} else if (i == 10) {
				ten = serplus / i;
			}
			serplus = serplus % i;
			System.out.println(serplus);
		}
		System.out.println("500원 : " + fifty + ", 100원 : " + handred + ", 50원 : " + five + ", 10원 : " + ten);

		
		//4.class student.
		
		
		
		
	}

}
