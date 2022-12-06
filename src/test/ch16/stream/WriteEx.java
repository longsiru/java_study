package test.ch16.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fo = new FileOutputStream("C://Temp/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			fo.write(a);//1byte씩 출력
			fo.write(b);
			fo.write(c);
			
		    fo.flush();//버퍼에 있는 바이트를 출력하고 버퍼를 비움(test1.db에 작성된다.
		    fo.close();//출력 스트림은 반드시 닫아서 사용한다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
