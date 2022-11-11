package test.ch01;

public class Hello {

	public static void main(String[] args) {
//		int a =10;
//		int b = 12;
//		//int a = 10, b = 20;
//		int result = a + b;
//		int num = 1;
//		
//		System.out.println("결과:" + result);
//		System.out.println(a + num);
		
//		byte a =10;
//		short b = 20;
//		int c = 300;

		int var1 = 0b1011;  //2진수
		int var2 = 0206; //8진수
		int var3 = 365;  //10진수
		int var4 = 0xB3; //16진수
		long var5 = 10000000000000L;
		long var6 = 10000000000000l;  //一定要加l
		char c1 = 'A';  //只可以写一个不可'assss'
		char c2 = 44032;  //유니코드.
		float var7 = 0.666666454545f;  //float 一定要加f
		double var8 = 0.6666664545; 
		double var9 = 3e6;  //3.0 *10^6   3000000
		double var10 = 2e-3;  //2.0 * 10^-3
		float var11 = 3e6f;  //3000000
		
//		String name="용사";  //큰 따움푶, 문자 1개 혹은 여러개.
//		String name1="나는\"용사\"이다";
//		String one = "A";
//		System.out.println(name1);
		
		
		boolean stop = true;
		int x = 10;
		boolean result1 = (x == 20);
		System.out.println(result1);  //false
		
		if(stop) {
			System.out.println("정지"); 
		}
		
	    
		
		System.out.println(var1 + ":" + var2 + ":" + var3 + ":" + var4);
		System.out.println(var5 + var6);
		System.out.println(c1 + ", " + c2);
		System.out.println(var7 + ", " + var8);
		System.out.println(var9);
		System.out.println(var10);
		System.out.println(var11);
	}

}
