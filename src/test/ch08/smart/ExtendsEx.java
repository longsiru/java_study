package test.ch08.smart;

public class ExtendsEx {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		InterfaceA ia = impl; //InterfaceA ia = new InterfaceCImpl(); 자동 현변환
		ia.methodA();
		InterfaceB ib = impl;
		ib.methodB();
		//interfaceC는 AB 상속 받았어可以直接呼出AB的方法
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodA();
		ic.methodC();
	}

}
