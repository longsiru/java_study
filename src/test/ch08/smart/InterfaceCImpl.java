package test.ch08.smart;

public class InterfaceCImpl implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl methodA 호출");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl methodB 호출");
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl methodC 호출");
	}

}
