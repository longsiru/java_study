package test.ch16.stream;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Temp/images"); //피일 결로 객체 생성
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		if(dir.exists() == false) { dir.mkdir();}
		if(file1.exists() == false) {file1.createNewFile();}
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		//Temp폴더의 파일, 폴더 리스트 출력
		File temp = new File("C:/Temp");
		File[] contents= temp.listFiles();
		
		for(File file : contents) {
			if(file.isDirectory()) {
				System.out.println(file.getName());
			}else {
				System.out.println(file.getName());
			}
			
		}
	}

}
