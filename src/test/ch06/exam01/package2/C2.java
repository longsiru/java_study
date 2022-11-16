package test.ch06.exam01.package2;

import test.ch06.exam01.package1.B;

public class C2 {

	A a = new A(); //不在一个package里面不可以用A，A也不是public
	B b= new B();  //可以用，因为b是public
}
