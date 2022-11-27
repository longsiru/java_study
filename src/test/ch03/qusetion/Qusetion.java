package test.ch03.qusetion;

public class Qusetion {

	public static void main(String[] args) {
		//1
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);  //31
		
		
		//2
		int score = 85;
		String result = (!(score > 90))? "가" : "나";
		System.out.println(result); //가

		
		//3
		int pencils = 534;
		int students = 30;
		int pencilPerStudent = pencils / students;
		System.out.println(pencilPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
		//4
		int value = 356; 
		System.out.println(value / 100 * 100);
		
		//5
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		//double area = (lengthTop+lengthBottom) * height / 2.0 ;
		double area = (lengthTop+lengthBottom) * height * 1.0 / 2 ;
		//double area = (double)(lengthTop+lengthBottom) * height / 2 ;
		//double area =  (double)( (lengthTop+lengthBottom) * height / 2);
		System.out.println(area);
		
		
		//6
		int x1 = 10; 
		int y1 = 5; 
		System.out.println( x1 > 7 && y1 <= 5 );  //true
		System.out.println( (x1 % 3 == 2) || (y1 % 2 != 1) );  //false
		
		
		//7
		//double x3 = 5.0;
		double y3 = 0.0;
		double z2 = 5 % y3;

		if (Double.isNaN(z2)) {
		    System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
		    double result2 = z2 + 10;
		    System.out.println("결과: " + result2);
		}
		
		


		
		
		
		
		
		
		
		
		
		
	}

}



