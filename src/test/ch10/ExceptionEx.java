package test.ch10;

public class ExceptionEx {

	public static void printLength(String data) {
		try {
			int result = data.length();//문자 수
			System.out.println("문자 수: " + result);
		}catch(NullPointerException e) {//에러가 났을 때 실행시킬 코드를 작성
			//에외 처리 정보를 얻는 세가지 방법
			System.out.println(e.getMessage()); //예외가 발생한 이유만 리턴
//			System.out.println(e.toString()); //예외가 발생 이유+ 예외의 종류 출력
//			e.printStackTrace();	//예외가 발생 이유+ 예외의 종류 출력 + 예외가 발생한 곳
		} finally { //finally: 옵션널하나. 마지막에 무조건 실행 되는 코드
			System.out.println("마무리 실행\n");
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("프로그램 중료");
	}

}
