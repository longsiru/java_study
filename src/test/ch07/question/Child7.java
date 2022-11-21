package test.ch07.question;

public class Child7 extends Parent7{
	public String name;
	
	public Child7() {
		this("홍길동");
		System.out.println("Child7() call");
	}
	
	public Child7(String name) {
		this.name = name;
		System.out.println("Child7(String name) call");
	}
}
