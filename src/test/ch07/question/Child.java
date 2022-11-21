package test.ch07.question;

public class Child extends Parent {
	public int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);  // doesn't this.name = name, because this class is child class.
		this.studentNo = studentNo;
	}
	
	public void play() {
		System.out.print("child should have more play time!");
	}
}
