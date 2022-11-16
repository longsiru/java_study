package test.ch06.exam01.package1;

public class B2 {
//	A a = new A(); //A클래스(defualt)접근 가능 ，在同一个package里面。
	A a = new A(true); //o
	A a2 = new A(1); //o
	A a3 = new A("문자열"); //X  Class a 里面有的话就不会错，但是没有。
}
