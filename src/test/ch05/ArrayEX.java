package test.ch05;

public class ArrayEX {

	public static void main(String[] args) {
		int[] arr1 = new int[3];  //可以输入三个值
		/*
		 * 初始值：int, short,byte=0
		 * long =0l
		 * char:'\u0000'
		 * float:0.0f
		 * double: 0.0
		 * boolean: flase
		 * */
		for (int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
			arr1[i] = 10;
		}
		
		double[] arr2 = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
			arr2[i] = 10;
		}
		
		
		
//		String[] season = {"Spring", "Summer", "Fall", "Winter"};
////		String season[] = {"Spring", "Summer", "Fall", "Winter"};
////		String season2[]; 선언만 
//		System.out.println(season[0]);
//		System.out.println(season[1]);
//		System.out.println(season[2]);
//		System.out.println(season[3]);
//		
//		season[1] = "여름";
//		System.out.println(season[1]);
//		System.out.println();
//		
//		int[] scores = {83, 90, 87};
//		
//		//총합,평균
//		int sum = 0;
//		for (int i = 0; i < 3; i++) {
//			sum += scores[i];
//		}
//		double avg = (double) sum / 3;
//		
//		System.out.println("총합=" + sum + ", 평균" + avg);
			
	}

}
