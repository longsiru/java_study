package test.ch03.qusetion;

public class Exercise {

	public static void main(String[] args) {
		//8
		int numOfApples = 123; // 사과의 개수
	     int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
	     int numOfBucket = (numOfApples / sizeOfBucket + (numOfApples / sizeOfBucket > 0 ? 1 : 0));
	     System.out.println("필요한 바구니의 수 :"+numOfBucket);

	     
	     //9
	     int num = 8;
	     System.out.println((num > 0 ? "양수" : (num < 0) ? "음수" : 0));
	     
	    
	     //10
	     int num1 = 333;
         System.out.println(num1 / 10 * 10 + 1);
         
         //11
         int fahrenheit = 100;
         float celcius = (int)((5/9f * (fahrenheit))* 100 + 0.5) /100f;
         System.out.println("Fahrenheit:"+fahrenheit);
         System.out.println("Celcius:"+celcius);
         
         
         //12
         byte a = 10;
         byte b = 20;
         byte c = (byte) (a + b);

         char ch = 'A';
         ch = (char) (ch + 2);

         float f = 3f / 2f;
         long l = 3000l * 3000l * 3000l;
         float f2 = 0.1f;

         double d = (float)0.1;
         boolean result = d==f2;

         System.out.println("c="+c);
         System.out.println("ch="+ch);
         System.out.println("f="+f);
         System.out.println("l="+l);
         System.out.println("result="+result);

         
         //13
         char ch2 = 'z';
         boolean b2 =  ('a' <= ch2 && ch2 <= 'z') || ('A' <= ch2 && ch2 <= 'Z') || ('0' <= ch2 && ch2 <= '9');
         System.out.println(b2);

         
         
         //14
         char ch3 = 'A';
         char lowerCase = ('A' <= ch3 && ch3 <= 'Z')? (char)(ch3 +32) : ch;
         System.out.println("ch3:"+ch3);
         System.out.println("ch3 to lowerCase:"+lowerCase);

         
         

         
         
         

	     
	     
	}

}


