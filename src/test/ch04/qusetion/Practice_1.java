package test.ch04.qusetion;

public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.	다음 문장들을 조건식으로 표현하시오.
//        1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식-> 10 < x && x < 20
//        2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식 : ch!=' ' && ch !='\t'
//        3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식: ch == 'x' || ch == 'X'
//        4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식: ch >= ‘0’ && ch <= ‘9’
//        5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식:  (‘A’ <= ch && ch <= ‘Z’ ) || ( ‘a’ <= ch && ch <= ‘z’ )
//        6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로
//            나눠떨어지지 않을 때 true인 조건식 : year / 400==0 || year /4 ==0 && year/ 100 !==0
//        7. boolean형 변수 powerOn가 false일 때 true인 조건식:  !powerOn  
//        8. 문자열 참조변수 str이 “yes”일 때 true인 조건식: str.equals("yes")

		
		
//		2. 2.	for 문을 이용하여 1~100까지의 정수 중 3의 배수 총합을 구하는 코드를 작성하시오.
		
//		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			if(i % 3 == 0) {
////				System.out.println(i);
//				sum += i;
//			}
//		}
//		System.out.println("sum=" + sum);  //sum=1683
		
		
		
		
		
		
		
//		3.	1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 코드를 작성하시오
		
//		int sum = 0;
//		for(int i=1; i<=20; i++) {
//			if((i %2 != 0) && (i %3 != 0)) {
//				System.out.println(i);	
//				sum += i;
//			}
//		}
//		System.out.println("sum=" + sum);
		
		
		
//		4.	while 문과 Math.random( ) 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1,
//				눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추
//				는 코드를 작성해보세요. 눈의 합이 5가 되는 경우는 (1, 4), (4, 1), (2, 3), (3, 2)입니다.

		
		
//		while (true) {
//			int num1 = (int) (Math.random() * 6) + 1;
//			int num2 = (int) (Math.random() * 6) + 1;
//			System.out.println("(" + num1 + "," + num2 + ")");
//			if ((num1 + num2) == 5) {
//				break;
//			}   
//		}
//		
		
//		5.	중첩 for 문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드
//				를 작성해보세요. 단, x와 y는 10 이하의 자연수입니다

//		for (int x=1; x <=10; x++) {
//			for(int y =1; y<=10; y++) {
//				if ((4*x + 5*y) == 60) {
//					System.out.println("(" + x + "," + y + ")");
//					break;
//				}
//				
//			}
//			
//		}
		
		
		//6.	1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 
		//총합이 100이상이 되는지 구하는 프로그램을 작성하시오.
//		int sum = 0;
//		int s =1;
//		int num = 0;
//		for (int i=1; true; i++, s= -s) {
//			num = s * i;
//			sum += num;
//			if(sum >= 100)
//				break;
//		}
//		System.out.println("num= " + num);
//		System.out.println("sum= " + sum);
		
		
		
		
		//7.	두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 
		//프로그램을 작성하시오.(이중 for문 이용)
		
//		for (int i = 1; i <=6; i++) {
//			for (int j = 1; j <= 6; j++)
//				if (i + j == 6)
//					System.out.println(i + "+" + j + "=" + (i + j));
//		}
		
		
		
		/* 8.	int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 
		 * 만일 변수 int num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (문자 변환 금지) */
//		int num = 12345;
//		int sum = 0;
//		while (num > 0) {
//			sum += num % 10;
//			num /= 10;
//		}
//		System.out.println("sum= " + sum);
		
		
		/*9.	피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 
		 * 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 
		 * 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터시작하는 피보나치수열의 10번째 
		 * 수는 무엇인지 계산하는 프로그램을 완성하시오. */
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0;
//		System.out.println(num1 + "," + num2);
//		for(int i =0; i< 8 ; i++) {
//			num3 = num1 +num2;
//			System.out.println(", " + num3);
//			num1 =num2;
//			num2 = num3;
//		}
//		
		
		
		
		/*10.	for 문을 이용해서 다음과 같은 실행 결과가 나오는 코드를 작성해보세요.(이중 for문 이용) */
		 
//		  for (int i=1; i<=5; i++) {
//			  for(int k=1; k<=i; k++) {
//				System.out.println("*");
//				if( k == i ) {
//				  System.out.println(); 
//			      }
//			   }
//		  }
//		
		
		/* 11.	다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 
		 * 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다. 
		 * 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. 
		 * 네모에 알맞은 코드를 넣어 프로그램을 완성하시오.*/
		
		
		
		/* 12.	while 문과 Scanner의 nextLine ( ) 메소드를 이용해서 다음 실행 결과와 같이 키보드로부터
		 * 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
