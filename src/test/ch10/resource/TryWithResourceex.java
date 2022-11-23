package test.ch10.resource;

public class TryWithResourceex {

	public static void main(String[] args) {
		// try안에 열고 싶은 리소스 갵체 생성
//		try (MyResource res = new MyResource("A")) {
//			String data = res.read1();
//			int value = Integer.parseInt(data); // int형변환
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

		// try안에 열고 싶은 리소스 갵체 생성
		try (MyResource res = new MyResource("A")) {
			String data = res.read2(); //NumberFamatException 예러 발생
			int value = Integer.parseInt(data); // int형변환
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
