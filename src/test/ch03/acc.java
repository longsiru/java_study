package test.ch03;

public class acc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int apple = 1;
//		double pieceUnit = 0.1;
//		int number = 7;
//		double result = apple - number * pieceUnit;
//		System.out.println("사과 1개에서 남은 양: " + result);
		
		
//		int apple = 1;
//		int totalPiece = apple * 10;
//		int number = 7;
//		
//		int result = totalPiece - number;
//		System.out.println("사과 1개에서 남은 양: " + result/10.0);
//		
		
		int x = 5;
		double y = 0.0;
		double z = x / y;
//		double z = x % y;
		System.out.println(z + 2);
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z);
			
		}
	}

}
