package test.ch11.System;

import java.util.Arrays;

public class ByteToStringEx {

	public static void main(String[] args) {
		String data = "자바";
		
		byte[] arr1 = data.getBytes(); //不屑也是默认UTF-8
		System.out.println(Arrays.toString(arr1)); //배열을 분자열로 ㅂ꾼다.
		
		String str1 = new String(arr1); //偶人UTF-8로 디코딩
		System.out.println(str1);//배열을 문자열로 바꾼다
		
		
	}

}
