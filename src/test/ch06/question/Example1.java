package test.ch06.question;

public class Example1 {

	public static boolean isNumber(String str) {
		//주어진 문자열이 null이거나 빈문자열 ""이라면 false
		if (str ==null || str.equals(""))
			return false;
		
		//주어진 문자열이 모두 숫자만 이루어져 있는지 확인
		//모든 숫자만 이루어져 있으며 true를 반환 , 그렇지 만으면 false
		//문자열은 배열로 만들 수 있다.
		for (int i = 0; i < str.length(); i++) {
			//str.charAt(i) str에 있는 문자를 가져움,(i)는 인덱스 번호
			char ch = str.charAt(i);
//			System.out.println("값:" + ch);
			
//			chat a = 'A' //65
			
			//0-9tkdl tntwkrk dksla, '0'=48,'9'=57 유니코드
			if (ch < '0' || ch > '9') return false;
		} 
		return true;	
		}
		
		
	
		public static void main(String[] args) {
			String str = "123";
			System.out.println(str + "는 숫자입니까? " + isNumber(str));
			str = "1234o";
			System.out.println(str + "는 숫자입니까? " + isNumber(str));
		}


	}


