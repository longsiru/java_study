package test.ch03.practice;
/*
 * 赋值运算符：=， +=， -=， /=， %=
 * 符号：=：当“=”
 * 
 */
public class Operation2 {

	public static void main(String[] args) {
		//赋值符号：=
//		int i1 = 10;
//		int j1 = 10;
//		
//		int i2,j2;
//		//连续赋值
//		i2 = j2 = 10;
//		
//		int i3 = 10,j3 = 20;
		
		
		//*******************************************************************************************
		// +=
		int num1 = 10;
		num1 += 2;  //num1 = num1 + 2;
		System.out.println(num1);  //12
		
		//注意
		short s1 = 10;
		//s1 = s1 + 2;//报错，编译失败
		s1 += 2;//可以,因为不会改变变量本身的数据类型。
		System.out.println(s1);  //12
		
		//开发中，如果希望变量实现+2的操作，有几种方法？（前提： int num = 10;）
		//方式一： num = num + 2;
		//方式二： num += 2;  (推荐)
		
		//开发中，如果希望变量实现+1的操作，有几种方法？（前提： int num = 10;）
		//方式一： num = num + 1;
		//方式二： num += 1; 
		//方式三： num++；  (推荐)
		
	}

}
